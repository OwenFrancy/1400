import java.util.Scanner;

public class TestDoWhile {
   public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

   // int count = 1;
//    do{
//    System.out.println(count);
//    count ++;//count ++; or count +=1;
//    }while(count <= 10);

   int choice;
   do{
      System.out.println("input 1 for hello, 2 for howdy, 3 to end program");
      choice = input.nextInt();
      if(choice == 1){
      System.out.println("Hello");
      }
      if(choice == 2){
      System.out.println("Howdy");
      }
      if(choice >= 4){
      System.out.println("Invalid input");
      }
      System.out.println();
   }while(choice != 3);
}
}