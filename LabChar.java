public class LabChar {
   public static void main(String[] args)
{
   char dash = '-';
   char a = 'a';
   char letter = a;
   char b = (char) (letter + 1);
   char c = (char) (letter + 2);
   char d = (char) (letter + 4);
   char e = d;
   
   
   System.out.printf("Letter: %c a:%c b:%c C:%c e:%c\n", d, a, b, c, e);
   
   char copyrightSign = '\u00A9';
   System.out.printf("Copyright Sign: %c %d %X\n", copyrightSign, (int) copyrightSign, (int) copyrightSign);
   
   char yen = '\u00A5';
   System.out.printf("Yen: %c %d %X\n", yen, (int) yen, (int) yen);
   


}
}
