package day_05;

import java.util.Locale;
import java.util.Scanner;

public class Q06_MethodCreation {

    /*
     Kullanıcıdan isim ve soyismini alın.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" isminizi giriniz");
        String ad = sc.nextLine();
        System.out.println("Soy isminizi giriniz");
        String soyAd = sc.nextLine();
adsoyad(ad,soyAd);
}
private static void adsoyad(String ad,String soyad ){
    System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()+" "+soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase());
}
}


