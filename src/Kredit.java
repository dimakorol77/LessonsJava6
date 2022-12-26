import java.util.Scanner;

public class Kredit {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму оплаты ");
        int x = in.nextInt();
        kredit(x);


    }


    public static void kredit(int x) {
        int  Monatpayment = 100;
        int переплата = x - Monatpayment;
        int allkredit1 = 700;
        int nowkredit = allkredit1 - x;
        if (nowkredit <= 0) {
            System.out.println("кредит выплачен");
        } else {
            System.out.println("сумма к выплате:" + nowkredit);

            if (переплата > 0) {
                System.out.println("Переплата за месяц:" + " " + переплата);
            } else {
                System.out.println();
            }

        }


    }
}