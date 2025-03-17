import java.util.Scanner;
  class Car
{
   Scanner input = new Scanner(System.in);
   
   private String make;
   private int year;
   private int door;
   
   public Car(String make, int year) {
      this.make = make;
      this.year = year;
   }
   public void displayInfo() {
      System.out.println("Car Make: " + make);
      System.out.println("Car Year: " + year);
      //System.out.println("Door Count: " + door);
 
   
}
}
