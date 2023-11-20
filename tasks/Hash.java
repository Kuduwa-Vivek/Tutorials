package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {
  public static void main(String args[]){
    while (true) {
      System.out.println("Enter no : ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      HashMap<Integer, String> data = new HashMap<>();
      data.put(1, "Vivek");
      data.put(2, "Keshav");
      data.put(3, "Adarsh");
      data.put(4, "Pushkar");
      data.put(5, "Omkar");
      data.put(6, "Om");
      data.put(7, "Akhil");
      data.put(8, "Shashank");
      data.put(9, "Gaurav");
      data.put(10, "Sushil");
      data.put(11, "sagar");
      data.put(12, "Sahil");
      data.put(13, "Tushar");
      data.put(14, "Yash");
      data.put(15, "Tejas");
      data.put(16, "Mayur");
      data.put(17, "Subodh");
      System.out.println("Value of Key (" + n + ") is : " + data.get(n) +" \n");
//    for (Map.Entry d : data.entrySet()){
//      System.out.println(d.getKey()+ " : " + d.getValue());
//    }

//    HashMap<Integer,String> map=new HashMap<>();
//    map.put(1,"Mango");
//    map.put(2,"Apple");
//    map.put(3,"Banana");
//    map.put(4,"Grapes");
//
//    System.out.println("Iterating Hashmap...");
//    for(Map.Entry m : map.entrySet()){
//      System.out.println(m.getKey()+" "+m.getValue());
//    }
    }
  }
}