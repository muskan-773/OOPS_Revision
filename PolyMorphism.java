package com.example.oopspackage;

// 🔹 What is Polymorphism?
// Polymorphism means “many forms”.
// 👉 Same method name, but different behavior.
// ✅ Types of Polymorphism (Java)
// Compile-time Polymorphism → Method Overloading
// Run-time Polymorphism → Method Overriding

public class PolyMorphism {

  public static class Dog{
      void speak(){
         System.out.println("Bhau Bhau");
      }
  }
  public static class Cat{
    void speak(){
      System.out.println("Meow Meow");
   }
  }
  public static class Lion{
    void speak(){
      System.out.println("Grrrrr");
   }
  }
  public static class Pikachu{
    void speak(){
      System.out.println("Pika Pika");
   }
  }
  public static class Human{
    void speak(){
      System.out.println("Hello");
   }
  }
  public static void main(String[] args) {
    Dog tommy = new Dog();
    Cat c = new Cat();
   Lion l = new Lion();
    Pikachu p = new Pikachu();
    Human h = new Human();

    tommy.speak();
    c.speak();
    p.speak();
    h.speak();
  }
}
