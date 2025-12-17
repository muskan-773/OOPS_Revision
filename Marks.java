package com.example.oopspackage;

import java.util.Arrays;

public class Marks {
  public static class StudentData{
      String name;
      int rno;
      int[] marks;

        public StudentData(int[] s) {
          marks = Arrays.copyOf(s, s.length);
        }
      
  }
  public static void main(String[] args) {
    int[] arr = {4,7,1,4,8};
    int[] brr = arr;
    StudentData s1 = new StudentData(arr);
    s1.marks[0] =  40;
    // StudentData s2 = new StudentData();
  }
}
