public class Constructor {
  public static class Car{
    int seats; //0
    String name; //null
    double length; //0.0
    Car(int x, String s, double d){ //default constuctor
          seats = x;
          name = s; 
          length = d;
    }
    void print(){
      System.out.println(seats+ " "+name+" "+length);
    }
    
  }
  public static void main(String[] args) {
    Car c1 = new Car(5, "Kia Sonet", 3.99);
    c1.print();
  
    Car c2 = new Car(5, "Lord Alto", 4.45);
    c2.print();
  }
}
