import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int c = in.nextInt();
        calculate(x, y, c);
    }


    public static void calculate(int x, int y, int c){
        System.out.println(+ x/5 + " " + y/5 + " " + c/5 );
    }

}
