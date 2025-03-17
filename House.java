//import java.util.Scanner;
public class House
{
   //Fields
   private int door;
   
   private int window;
   
   private String roofStatus;
   //Methods
   public void doorOpen(){
      System.out.println("door is open");
      
   }
   public void setDoor(int door){
      this.door = door;
   }
   public int getDoor(){
      return this.door;
   }
   public void setWindow(int window){
      this.window = window;
   }
   public int getWindow(){
      return this.window;
      }
   public void setRoofStatus(String roofStatus){
      this.roofStatus = roofStatus;
      }
   public String getRoofStatus(){
      return this.roofStatus;
      }
}
//public static void main(String[] args){
//Scanner input = new Scanner(System.in);
