package Deneme;

import java.util.Scanner;

public class d08 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("LüTFEN BİR SAYI GİRİNİZ:");
        int sayı1=sc.nextInt();
        System.out.print("LüTFEN BİR SAYI GİRİNİZ:");
        int sayı2=sc.nextInt();


        sayı1=sayı1+sayı2;
        sayı2=sayı1-sayı2;
        sayı1=sayı1-sayı2;

        System.out.println(sayı1);
        System.out.println(sayı2);






    }
}
