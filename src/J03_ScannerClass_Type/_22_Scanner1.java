package J03_ScannerClass_Type;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create ediniz */
    Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim= scan.next();
        System.out.println( "isminiz:" +isim);
        System.out.println( "cins,yetinizi giriniz: E/B");
        char ch= scan.next().toLowerCase().charAt(0);
        if(ch=='E') {
            System.out.println("hoşgeldiniz " + isim+"hanım");
        }else System.out.println("hoşgeldiniz "+isim+  "bey");



    }
}
