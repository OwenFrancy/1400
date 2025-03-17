import java.util.Scanner;
public class RectangleMenu
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
       Rectangle myRectangle= new Rectangle(5,4);
       int selection; 
       do{
       menuPrompt();
       selection = input.nextInt();
      //System.out.println("input 0 to end program");
      if(selection == 0){
      System.out.println("Good bye");
      } else if(selection > 3 || selection < 0){
      System.out.println("Invalid input");
      } else if(selection ==1){
         System.out.println("Area: " + myRectangle.area());
         } else if(selection ==2){
         System.out.println("Perimeter: " + myRectangle.perimeter());
         } else if(selection ==3){
         System.out.println("Length: " + myRectangle.getLength() + " Width: " + myRectangle.getWidth());
         }

      System.out.println();
   }while(selection != 0);


  	}
	
	private static void menuPrompt()
	{
   //Scanner input = new Scanner(System.in);

	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
     
	}
}