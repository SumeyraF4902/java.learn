package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class T_01 {
    public static void main(String[] args) {
        // task --< girilen bir sayının negatif olması duruumunu kontrol ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz:  ");
        int t = sc.nextInt();
        System.out.println(t < 0 ? "agam sayı negatif değil" : "agam sayı negatif");
    }
}

