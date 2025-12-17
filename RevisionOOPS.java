package com.example.oopspackage;

class Pokemon{
  private int power;
  String type;

    public Pokemon(String type, int power) {
      this.type = type;
      this.power = power;
    }
    void print(){
       System.out.println(this.power+ " "+ this.type);
    }
  
}
public class RevisionOOPS {
    public static void main(String[] args) {
      Pokemon pikachu = new Pokemon("Electric", 70);
    }
}
