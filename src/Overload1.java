public class Overload1 {
    static int AverageMethod(int a, int b, int c) {
        return (a + b + c) / 3;    }
    static int AverageMethod(int a, int b, long c, int d) {
        return (int) ((a + b + c + d) / 4);    }
    static int AverageMethod(int a, int b, int c, int d, double e) {
        return (int) ((a + b + c + d + e) / 5);    }
    static void Method(int A, int B, int C) {
        if(A>B && A<C) {
            System.out.println("avarage: " + A);        }
        else if(B>A && B<C) {
            System.out.println("avarage: " + B);        }
        else {
            System.out.println("avarage: " + C);        }
        System.out.println("Min: " + Math.min(A, Math.min(B, C)));        System.out.println("Max: " + Math.max(A, Math.max(B, C)));        }
    public static void main(String[] args) {
        Method(
                AverageMethod(12, 21, 32),        AverageMethod(11, 12, 32, 22),        AverageMethod(4, 44, 12, 55, 50));    }
}

