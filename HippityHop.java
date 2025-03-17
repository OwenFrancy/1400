// out print 1 through 25
// every multiple of three, print hoppity instead
// every multiple of five, print hop
public class HippityHop {
public static void main(String[] args)
	{
    for (int i = 1; i <= 25; i++) {
            //System.out.println(i);
    if(i % 3 == 0 && i % 5 == 0){
    System.out.println("Hippity Hop");
    }

    else if(i % 3 == 0){
    System.out.println("Hippity");
    }
    else if(i % 5 == 0){
    System.out.println("Hop");
    }
    else {
    System.out.println(i);
    }
    }
    }
    }
    