public class TestPromotionCasting {
   public static void main(String[] args)
{
   double x = 10.9;
   int y = (int)x;
   int a = 5;
   double b = (int)a;
   int p = 10;
   double q = 7;
   double r = p/q;
   
   char x1 = 'a';
   char x2 = '\u00A9';
   
   
   System.out.println("Print number: " + x);
   System.out.println("Print r " + r);
   System.out.println("Print x1 " + 'a');
   System.out.print(x2);

}
}