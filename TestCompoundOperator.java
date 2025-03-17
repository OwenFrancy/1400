public class TestCompoundOperator {
public static void main(String[] args)
	{
   int x = 10;
   x -= 1;
   
   int y = 20;
   y += 1;
   y += 20;
   
   x *= y;
   x /= 10;
   x %= 8;
   
   System.out.println(x);
   System.out.print(y);
}
}