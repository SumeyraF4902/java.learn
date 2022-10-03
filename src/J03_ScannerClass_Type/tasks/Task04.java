package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Adınız Soyadınız:");
        String bilgi = sc.next();
        System.out.print("yaşınız:");
        int yas = sc.nextInt();
        System.out.print("kilonuzu giriniz:");
        int kilo = sc.nextInt();
        System.out.print("boyunuzu giriniz:");
        int boy = sc.nextInt();
        System.out.print("salonu kaç ay devam edeceksiniz: ");
        int ay = sc.nextInt();
        System.out.println("salon ücretiniz  ="+ay*20+"$");
    }
}
