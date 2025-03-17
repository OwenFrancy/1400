import java.util.Scanner;
public class LabWhile
{
 public static void main(String[] args)
 {
 multiplyNumbers();
 }

 public static void multiplyNumbers()
 {
   Scanner input = new Scanner(System.in);
   System.out.println("Input quantity of item (enter 0 to end): ");
   int product = 1;
   int number = input.nextInt();
      input.nextLine();
   while (number != 0){
      product *= number;
      number = input.nextInt();
      input.nextLine();
 }
   System.out.println(product);
}
}