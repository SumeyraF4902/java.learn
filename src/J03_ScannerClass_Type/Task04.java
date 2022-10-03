package J03_ScannerClass_Type;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("İsminizi ve soyisminizi giriniz:");
        System.out.println("yaşınızı giriniz:");
        System.out.println("kilonuzu giriniz:");
        System.out.println("boyunuzu giriniz:");
        System.out.println("salona kaç ay devam edeceksiniz:?");
        int ay= scan.nextInt();
        System.out.print("Salona geleceğiniz sürede ödeyeceğiniz toplam tutar: " +(ay*20)+"$");
    }
}
