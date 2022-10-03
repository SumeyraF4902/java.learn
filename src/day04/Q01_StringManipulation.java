package day04;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
        //Kullanıcıdan ismini ve soyismini girmesini isteyin, sonrasında tam ismini büyük harfler ile yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz:");
        String ad=sc.nextLine(), soyad=sc.nextLine();
        String adsoyad=ad.concat(" "+soyad).toUpperCase();
        System.out.println("adınız soyadınız:"+adsoyad);
    }
}
