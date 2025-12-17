package com.example.oopspackage;

class Cricketer{
   static String country ;  
   int runs;
   String name;
   double avg;
}
public class FinalAndStactic {
  public static void main(String[] args) {
    Cricketer c1 = new Cricketer();
    //c1.country = "England"; error
    c1.country = "India";
    System.out.println(c1.country);
  }
}
