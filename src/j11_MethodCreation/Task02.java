package J11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //girilen ad ve soyadın ilk harflerini büyük diğerlerini küçük yapan method create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad=scan.nextLine();
        System.out.println("soyadınızı giriniz");
        String soyad=scan.nextLine();
        System.out.println(isimSoisimKontrol(ad,soyad));
        System.out.println(isimSoyisimHarfKontrol2(ad, soyad));




    }

    private static String isimSoisimKontrol(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

        System.out.println("ad soyad:"+ad + " " + soyad);
        return ad;
    }    private static String isimSoyisimHarfKontrol2(String ad, String soyad) {//return typle method
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        return ad+" "+soyad;




    }}
