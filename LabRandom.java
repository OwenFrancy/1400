import java.util.Random;
public class LabRandom{
public static void main(String[] args)
	{
    Random rand = new Random();
    
    int number;
    //int i = 1;
    
    for(int i =1; i <= 100; i ++) {
      number = rand.nextInt(901,999);
      //or rand.nextInt(4,8);(includes everything between 4 and 8)
      System.out.printf("%-5d",number);
      
      if(i %  10 == 0){
      System.out.println();
      }
      }
    
    //for(int i <= 100;
}
}