public class PrintArray {
public static void main(String[] args)
 {
   int[] numList = {10, 20, 30, 40, 50};
   String[] names = {"Lane", "Nevyn", "Pericval", "James", "Tiana"};
   // System.out.print(numList[0]);
//    System.out.print(numList[1]);
//    System.out.print(numList[2]);
//    System.out.print(numList[3]);
//    System.out.print(numList[4]);
System.out.print("Array elements: ");
   for(int i=0; i <= 4; i++){
    System.out.printf(numList[i]+" ");
    }
    System.out.println();
    System.out.print("Names: ");
    for(int i=0; i <= 4; i++){
    System.out.printf(names[i] + " ");
    }
   }
   }