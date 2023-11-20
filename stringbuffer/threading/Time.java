package stringbuffer.threading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends Thread {
  public static  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

  public void run() {
    while (true) {
      Date now = new Date();
      String formattedDate = dateFormat.format(now);
      System.out.println(Thread.currentThread().getName() + ": " + formattedDate);
      try {
        Thread.sleep(1000);
      }catch (Exception e){
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new Time(), "Date & Time : ");
    thread.start();
  }
}
