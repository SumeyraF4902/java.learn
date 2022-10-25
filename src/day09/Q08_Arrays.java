package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("adınızı giriniz:");
        String name=sc.nextLine().toLowerCase().trim();
        ArrayList<String> mevcutKullaniciListesi = new ArrayList<>(Arrays.asList("ilyas", "tarhan", "ilyastarhan10", "ilyastarhan",
                "tarhanilyas", "ilyast", "ilyasta", "ilyas111", "ilyastarhan1", "ilyastarhan11", "ilyastarhan22"));
        String isimOneri = name + (int)Math.random() * 99;
        boolean devamMi = true;
        if (!mevcutKullaniciListesi.contains(name)) {
            System.out.println(name + " kullanici ismini kullanabilirsiniz.");
            mevcutKullaniciListesi.add(isimOneri);
        } else
            while (devamMi) {
                System.out.println("Maalesef isminizi kullanici adi olarak belirleyemezsiniz. " +
                        "\nkullanici isminiz " + isimOneri + " olarak belirlensin mi?" +
                        "\nEvet icin 'E' baska bir isim belirlemek icin 'H' giriniz");

                char secim = sc.next().toUpperCase().charAt(0);
                if (secim == 'E')
                    devamMi = false;
            }
        mevcutKullaniciListesi.add(isimOneri);
        System.out.println(mevcutKullaniciListesi);

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz: ");
        String kullaniciIsim = scan.nextLine().replaceAll(" ", "").toLowerCase();
        ArrayList<String> mevcut = new ArrayList<>(Arrays.asList("ilyas", "tarhan",
                "ilyastarhan10", "ilyastarhan",
                "tarhanilyas", "ilyast", "ilyasta", "ilyas111", "ilyastarhan1",
                "ilyastarhan11", "ilyastarhan22"));
        String Oneri = name + (int)Math.random() * 99;
        boolean devaMi = true;
        if (!mevcutKullaniciListesi.contains(kullaniciIsim)) {
            System.out.println(kullaniciIsim + " kullanici ismini kullanabilirsiniz.");
            mevcutKullaniciListesi.add(isimOneri);
        } else
            while (devamMi) {
                System.out.println("Maalesef isminizi kullanici adi olarak belirleyemezsiniz. " +
                        "\nkullanici isminiz " + isimOneri + " olarak belirlensin mi?" +
                        "\nEvet icin 'E' baska bir isim belirlemek icin 'H' giriniz");

                char secim = scan.next().toUpperCase().charAt(0);
                if (secim == 'E')
                    devamMi = false;
            }
        mevcutKullaniciListesi.add(isimOneri);
        System.out.println(mevcutKullaniciListesi);


    }
}
