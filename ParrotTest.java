import java.util.Scanner;
   public class ParrotTest

{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   Parrot myParrot = new Parrot();
   
   System.out.print("The parrot will say: ");
   String word = input.nextLine();
   
   myParrot.Speak(word);
}
}