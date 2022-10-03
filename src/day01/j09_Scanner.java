package day01;

import java.util.Locale;
import java.util.Scanner;

public class j09_Scanner {
    public static void main(String[] args) {

///BBİİİİTTTTTTTTTTTİİİİ
        //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
//  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
//  Isim – soyisim : Elly Dainty
//  Kullanicidan ismini alip isminin bas harfini yazdirin.
        //1 soru
        Scanner sc=new Scanner(System.in);
        System.out.println("dairenin yarı çapı kaçtır:");
        double r= sc.nextDouble();
        System.out.println("Çemberin çevresi:"+(2*3.14*r));
        System.out.println("dairenin alanı:"+r*r*3.14);
        //2. soru
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi yasınız:");
        String ad=scan.nextLine();
        System.out.println("soyisminizi yasınız:");
        String soyad=scan.nextLine();
        System.out.println("İsim -soyisim:"+ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()+" "+ soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase());
        System.out.println("isinizi giriniz:");
        char ad1=scan.next().charAt(0);
        System.out.println("isminizin baş harfi "+ad1);
    }
}
