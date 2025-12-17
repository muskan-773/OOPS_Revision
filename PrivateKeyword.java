package com.example.oopspackage;

class Students{
  String name;
  private int rno;
  double cgpa;
  void print(){
    System.out.println(name+" "+cgpa+ " "+rno);
  }
  int getRno(){//getter
    return rno;
  }
  void setRno(int x){ //setter
    rno = x;
  }

  // getter setter use for acces private class
}

public class PrivateKeyword {
  public static void main(String[] args) {
    
    Students s1 = new Students();
    s1.cgpa = 8.8;
    s1.name = "Muskan";
    // s1.rno = 45; error
    s1.setRno(45);
    System.out.println(s1.getRno());
  }
}
