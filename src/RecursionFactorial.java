import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(fac(7));

    }

    public static int fac( int x) {
        if (x==1)
            return 1;


        return x*fac(x-1) ;
    }
}

