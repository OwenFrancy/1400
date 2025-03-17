public class TestConditionalOperators {
public static void main(String[] args)
	{
   //values
   int x = 9;
   double y = 20;
    
//    if (x > 20){
//       if(x < 100){
//          System.out.println(x);
//          }
//       System.out.println(x); 
//       }
//    if (x>20 && x < 100){
//       System.out.println(x);
//       }
//    if (y > 18){
//       //System.out.println(y);
//       }
//    if (y %2 != 0){
//    System.out.println("Odd");
//    
//    } 
//    if (y >18 || y%2 !=0){
//    System.out.println(y);
//    } 
    if(x > 10){
    System.out.println(x);
    }
    else if(x>10){
      System.out.println("Greater than ten");
      }
    else if(x>30){
      System.out.println("Greater than thirty");
      }
    else if(x>50){
      System.out.println("Greater than fifty");
      }
    else{
      System.out.println("None of them");
      }


}
}