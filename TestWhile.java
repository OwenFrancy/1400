import java.util.Scanner;

public class TestWhile{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   System.out.print("Input a number: ");

   int x= input.nextInt();

   int i = 1;
   int total = 0;
   int factorial = 1;
  
   while (i <= x){
   total += i;
   factorial *= i;
   System.out.println(i);
   i++;
   }
   
   System.out.println(total);
   System.out.print(factorial);

   
   }
   }
   