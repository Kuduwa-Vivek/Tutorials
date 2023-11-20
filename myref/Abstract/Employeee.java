//package myref.Abstract;
//
//
//abstract class Employee{
//  private String name;
//  private String EmailID;
//  private int number;
//  private String address;
//
//  public Employee(String name, String address, int number) {
//  }
//
//  public void Employee(String name,String EmailID,String address,int number)
//  {
//    this.name = name;
//    this.EmailID = EmailID;
//    this.number = number;
//    this.address = address;
//  }
//
//  public double computePay(){
//    System.out.println("Inside Empployee ComputePay..");
//    return 0.0;
//  }
//
//  public void  Mailcheck(){
//    System.out.println("Mailing a check to " + this.name + " " + this.EmailID);
//  }
//  public void checkAdd(){
//    System.out.println("Check Addresss " + this.address);
//  }
//
//  public String toString(){
//    return this.name + " " + this.EmailID + " " + this.number;
//  }
//
//  public String getName(){
//    return name;
//  }
//
//  public String getEmailID(){
//    return EmailID;
//  }
//  public int getNumber(){
//    return number;
//  }
//  public String getAddress(){
//    return address;
//  }
//  public void setAddress(String newAddress){
//    address = newAddress;
//  }
//}
//public class salary extends Employee {
//  private double salary;   // Annual salary
//
//  public salary(String name, String address, int number, double salary) {
//    super(name, address, number);
//    setSalary(salary);
//  }
//
//  public void mailCheck() {
//    System.out.println("Within mailCheck of Salary class ");
//    System.out.println("Mailing check to " + getName() + " with salary " + salary);
//  }
//
//  public double getSalary() {
//    return salary;
//  }
//
//  public void setSalary(double newSalary) {
//    if(newSalary >= 0.0) {
//      salary = newSalary;
//    }
//  }
//
//  public double computePay() {
//    System.out.println("Computing salary pay for " + getName());
//    return salary/52;
//  }
//}
//public class Employeee {
//  public static void main(String[] args) {
//    Employeee e = new Employeee("Vivek","Indra Prabha","baby@gmail.com",4546546546);
//    System.out.println("\n Call mailCheck using Employee reference--");
//    e.toString();
//  }
//}
