package varaible.wrapper;


import java.text.SimpleDateFormat;

//import java.text.SimpleDateFormat;
import java.util.Date;
//
//public class nin implements Runnable {
//  public static  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//
//  @Override
//  public void run() {
//    while (true) {
//      Date now = new Date();
//      String formattedDate = dateFormat.format(now);
//      System.out.println(Thread.currentThread().getName() + ": " + formattedDate);
//
//      try {
//        Thread.sleep(1000);
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//    }
//  }
//
//  public static void main(String[] args) {
//    Thread thread1 = new Thread(new nin(), "Date & Time : ");
//    thread1.start();
//  }
//}
public class nin implements Runnable{

  public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
  public void run(){
    while (true){
      Date date = new Date();
      String formattedDate = dateFormat.format(date);
      System.out.println(Thread.currentThread().getName() + ": " + formattedDate);

      try {
        Thread.sleep(1000);
      }catch (Exception e){
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    Thread t = new Thread(new nin(),"Date and Time");
    t.start();
  }
}
