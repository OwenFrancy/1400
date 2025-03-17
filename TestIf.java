import java.util.Scanner; 
public class TestIf {
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
     // int x = ;
      System.out.print("Input number: ");
      int x = input.nextInt();
      
      if(x != 5){
      System.out.println("Not Equal to 5");
      }
      if(x >= 10){
      System.out.println("Greater or equal to 10");
      }
      if(x == 10){
      System.out.println("Equal to 10");
      }
      
      boolean y;
      y = 5 != 6; 
      
      boolean z;
      z = false;
      if(z == false){
         z = true;
      }
      //if(y == true){
       System.out.println(y);
       //}
      

   }
   }