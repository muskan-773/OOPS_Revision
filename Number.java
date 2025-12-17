package com.example.oopspackage;

class ComplexNumber {
    int x;
    int y;

    // constructor
    public ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // print method
    void print() {
        if (y >= 0)
            System.out.println(x + "+" + y + "i");
        else
            System.out.println(x + "-" + (-y) + "i");
    }

    // add method
    void add(ComplexNumber z) {
        int X = this.x + z.x;
        int Y = this.y + z.y;
        
    }

     // multiply two complex numbers
     void multiply(ComplexNumber z) {
      int X = x* z.x - y * z.y;
      int Y = x* z.y + y * z.x;
      
  }
}

public class Number {
    public static void main(String[] args) {

        ComplexNumber z1 = new ComplexNumber(2, 3);
        ComplexNumber z2 = new ComplexNumber(1, 4);

        z1.print();
        z2.print();
        z1.add(z2); 
        z2.multiply(z2); 
        z1.print();
        z2.print();
    }
}
