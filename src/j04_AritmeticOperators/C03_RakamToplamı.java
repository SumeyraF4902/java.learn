package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {
        //kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamı
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayı= scan.nextInt();
        int birler=sayı%10;
        sayı /=10;
        int onlar=sayı%10;
        int yüzler=sayı/10;
        int rakamToplamı=birler+onlar+yüzler;
        System.out.println("rakamToplamı = " + rakamToplamı);


    }
}
