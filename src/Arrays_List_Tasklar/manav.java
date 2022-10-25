package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class manav {

        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        static ArrayList<String> urun=new ArrayList<>(Arrays.asList("elma","muz","portakal","domates","soğan"));
       static ArrayList<Double> urunFiyat=new ArrayList<Double>(Arrays.asList(10.30,23.0,10.20,15.10,7.0));
        static Scanner sc=new Scanner(System.in);
        static double toplamFiyat=0;
        static double kilo=0;
        public static void main(String[] args) {
            System.out.println("manavımıza hoşgeldiniz:");
        urunSec();

    }

    private static void urunSec() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ürün listemizden almak istediğiniz ürünü seciniz");
        for(int i=0;i<urun.size();i++) {
            System.out.println(urun.get(i)+"="+urunFiyat.get(i));
        }
        System.out.println("lütfen almak istediğiniz ürünü yazınız");
        String secim=sc.nextLine().toLowerCase().trim();
        switch (secim) {
            case "elma":
                System.out.println("kaç kilo elma almak isyiyorsunuz");
                kilo=sc.nextInt();
                System.out.println("toplam ödemeniz gereken tutar: "+(kilo*urunFiyat.get(urun.indexOf("elma"))));
              devamtamam();break;
            case" muz":
                System.out.println("kaç kilo muz almak isyiyorsunuz");
                kilo=sc.nextInt();
                System.out.println("toplam ödemeniz gereken tutar: "+(kilo*urunFiyat.get(urun.indexOf("muz"))));
                devamtamam();break;
            case"portakal":
                System.out.println("kaç kilo portakal almak isyiyorsunuz");
                kilo=sc.nextInt();
                System.out.println("toplam ödemeniz gereken tutar: "+(kilo*urunFiyat.get(urun.indexOf("portakal"))));
                devamtamam();break;
            case"domates":
                System.out.println("kaç kilo domates almak isyiyorsunuz");
                kilo=sc.nextInt();
                System.out.println("toplam ödemeniz gereken tutar: "+(kilo*urunFiyat.get(urun.indexOf("elma"))));
                devamtamam();break;
            case"soğan":
                System.out.println("kaç kilo soğan almak isyiyorsunuz");
                kilo=sc.nextInt();
                System.out.println("toplam ödemeniz gereken tutar: "+(kilo*urunFiyat.get(urun.indexOf("soğan"))));
                devamtamam();break;
        }
    }

    private static void devamtamam() {
        System.out.println("başka ürün almak istiyor musunuz? evet için E, hayır için H yazınız");
        char devamTamam=sc.next().toUpperCase().charAt(0);
        if(devamTamam=='E'){
            urunSec();
        }else
            System.out.println("siparişiniz en kısa zamanda elinizde olcaktır, afiyet olsun, herzaman bekleriz");

    }

}
