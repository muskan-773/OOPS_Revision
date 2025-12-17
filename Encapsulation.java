// 🔹 What is Encapsulation?

// Encapsulation means wrapping data and methods together and hiding data from outside access.

// 👉 We achieve encapsulation using the private keyword and public methods.
 
package com.example.oopspackage;

public class Encapsulation {
  // private data (hidden)
  private int id;
  private String name;

  // public method to set data
  public void setData(int i, String n) {
      id = i;
      name = n;
  }

  // public method to get data
  public void showData() {
      System.out.println("ID: " + id);
      System.out.println("Name: " + name);
  }
}
