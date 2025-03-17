import java.util.Scanner;
   public class LabMarbles

{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Input color: ");
   String color1 = input.nextLine();
   System.out.printf("Number of %s Marbles: ",color1);
   int number1 = input.nextInt();
   input.nextLine();
   
   System.out.print("Input color: ");
   String color2 = input.nextLine();
   System.out.printf("Number of %s Marbles: ",color2);
   int number2 = input.nextInt();
   input.nextLine();
   
   System.out.print("Input color: ");
   String color3 = input.nextLine();
   System.out.printf("Number of %s Marbles: ",color3);
   int number3 = input.nextInt();
   input.nextLine();
   
   //System.out.printf("%-12s %s %s %s\n",color1, color2, color3);
   System.out.printf("\nColor      Number of Marbles\n");
   System.out.printf("------------ -----------------\n");
   System.out.printf("%-12s %17d\n", color1, number1);
   System.out.printf("%-12s %17d\n", color2, number2);
   System.out.printf("%-12s %17d\n", color3, number3);


}
}
