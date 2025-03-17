import java.util.Scanner;

public class UserInputArray {
public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter five seperate numbers: ");
      int [] numList = new int [5];
      numList[0]= input.nextInt();
      input.nextLine();
      numList[1]= input.nextInt();
      input.nextLine();
      numList[2]= input.nextInt();
      input.nextLine();
      numList[3]= input.nextInt();
      input.nextLine();
      numList[4]= input.nextInt();
      input.nextLine();
      
      // for(int i=0; i <=4; i++){
//       System.out.printf(numList[i]+" \n");
//       }
      for(int x: numList){
         System.out.print(x);
         }
      }
      }
