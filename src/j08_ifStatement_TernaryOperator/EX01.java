package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        // girilen bir sayının negatif ve pozitifliğini kontrol edin
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı= scan.nextInt();
        if (sayı<0) {
            System.out.println("negatif");
        } else if (sayı<0){
            System.out.println("pozitif");

        }else System.out.println("sayı=0");

    }
}
