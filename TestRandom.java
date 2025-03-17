import java.util.Random;

public class TestRandom {
   public static void main(String[] args) {
   
      Random rand = new Random();
      
      double doubleNumber = rand.nextDouble(); //0 - <1
      int number = rand.nextInt(101)+100; //all integers
      int x = rand.nextInt(101,201);
      int y = rand.nextInt(5)*2;
      int z = rand.nextInt(4)*5+10;
      int a = rand.nextInt(3) * 2 -10;
      
//      System.out.println(number);
//      System.out.println(a);
//       System.out.println(x);
//       System.out.println(doubleNumber+4);
   
   }
   }