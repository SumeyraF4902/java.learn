package Projeler.Depo_Projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Islemler {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);

    static HashMap<Integer, Urunler> urunler = new HashMap<>();//urunleri depolanacagı bos map
    // {1001,"un ankara cuval 100 2a"}--> map element
    public static void girisPanel() {
        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
              +W+ "   ____________________             ____________________    \n"
                +R+ "   | 1-URUN TANIMLAMA  |            | 2-MİKTAR GUNCELLEME|  \n"
               +G + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                +Y+ "   ____________________             ____________________    \n"
               +B + "   | 3-RAF GUNCELLEME  |            | 4-URUN CIKISI     |   \n"
               +W + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
               +R + "   ____________________             ____________________    \n"
               +G + "   | 5-URUN LİSTELE    |            | 6-CIKIS           |   \n"
               +Y + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int secim = sayıgir();

        switch (secim) {
            case 1:
                urunTanımla();
                girisPanel();
                break;
            case 2:
                miktarGuncelle();
                girisPanel();
                break;
            case 3:
                rafDegisim();
                girisPanel();
                break;
            case 4:
                urunCıkısı();
                girisPanel();
                break;
            case 5:
                urunListele();
                girisPanel();
                break;
            case 6:
                cıkınızLutfen();
                break;
            default:
                System.out.println("Geçersiz giriş lütfen tekrar deneyiniz");
                girisPanel();
                break;


        }

    }
    private static int sayıgir(){// sayı gire try catch tanımladık. sayı girildiğinde bazen hataverebiliyor onun önne geçmek için
        // yada ayrı olarak trycatch methodu oluştururp bunları sayı girilecek yere çağırabilirsin örnek en altta var
        int a;
        while(true){
            try {
                a=scan.nextInt();
                if(a>0)break;
               else throw new Exception();
            }catch (Exception e){
                System.out.println("yanlış giriş yaptınız. tekrar giriniz ");
            System.exit(0);
            }
        }
        scan.nextLine();
        return a;
    }
    private static void rafDegisim() {
        urunListele();
        System.out.print(" urunun id  nosunu giriniz : ");
        int arananId = sayıgir();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("ürünü koymak istediğiniz  raf bilgisini girniz : ");
            int guncelRaf = sayıgir();
            urunler.get(arananId).setRaf(guncelRaf);
            System.out.println(arananId + " ıd nolu ürün\" " + guncelRaf+"\"rafına yerleştirildi\n");


        } else {System.out.println("aradıgınız ıd depoda  yok");
        rafDegisim();}

    }
    private static void miktarGuncelle() {
        urunListele();
        System.out.print("urunun  urun id giriniz : ");
        int arananId =sayıgir();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("guncel miktarınızı girniz : ");
            int guncelMiktar = sayıgir();
            urunler.get(arananId).setMiktar(guncelMiktar + urunler.get(arananId).getMiktar());
            System.out.println("==================================================================");
            System.out.println(urunler.get(arananId).getUrunIsmi()+ "Güncel miktarı= "+ urunler.get(arananId).getMiktar());
            System.out.println("====================================================================");
        } else System.out.println("aradıgınız urun yok");



    }
    private static void urunCıkısı() {
        urunListele();
        System.out.print("Miktar çıkısı yapacağınız urun id giriniz : ");
        int arananId = sayıgir();
        if (urunler.keySet().contains(arananId)) {
            System.out.print("eksiltmek istediğiniz ürünün miktarınızı girniz : ");
            int guncelMiktar = sayıgir();
            urunler.get(arananId).setMiktar(urunler.get(arananId).getMiktar() - guncelMiktar);

            System.out.println("urun mikatrınız güncel hale getirildi ");
        } else System.out.println("aradıgınız urun yok");
    }
    private static void urunListele() {
        System.out.println("****  Urun Listesi ****");
        System.out.println("|ID |Ürün Ismi| Uretici Adı|Urun Miktarı| Urun Birimi|Raf Bilgisi");
        System.out.println("====================================================================");
        for(Map.Entry<Integer,Urunler> a: urunler.entrySet()) {
            System.out.printf("|%-5d|%-9S|%-11S|%-12d|%-11S|%-11S\n",
             a.getKey(),a.getValue().getUrunIsmi(),a.getValue().getUretici(),a.getValue().getMiktar(),a.getValue().getBirim(),a.getValue().getRaf());
            System.out.println("==================================================================");
            scan.nextLine();
        }



    }

    private static void cıkınızLutfen() {
        System.out.println("yine bekleriz");
    }

    private static void urunTanımla() {
        System.out.print("urunun ismini giriniz : ");
        String urunIsmi = scan.nextLine().toUpperCase();

        System.out.print("uretici bilgisi giriniz : ");
        String uretici = scan.nextLine().toUpperCase();
        // scan.nextLine();
        System.out.print("urun birimi giriniz : ");
        String birim = scan.nextLine().toUpperCase();



        Urunler urun = new Urunler(urunIsmi, uretici,birim);
        urunler.put(urun.getId(), urun);

    }
        // TRY CATCH METHODU ÖRNEK

       /* public int intTryCatch(int ustlimit,int altlimit){
            int userinput;//kullanıcının her türlü sayısal giriş işlemini yapıp atacağımız variable
        while(true){// true olduğu sürece
        try {
        userinput=scan.nextInt();// variable değer atadığımız kısım
            if(userinput>ustlimit || userinput<altlimit){
                throw  new Exception();
            }break;//doğru bilgi girişi yaptığı zaman break komutuyla whileden çıkılacak

        }catch(Exception e){
            System.out.println("Girilen değer geçerli limit snırları içinde olmalıdır\n"+"Tekrar giriş yapınız");
            scan.nextLine();//döngü başına girince scande sorun olmasın diye kullanacağımız Dummy

        }
        }
        scan.nextLine();//döngüden çıkınca bu methodu kullandığımız methotda dummy atamamıza gerek kalmasın diye kullandığımız dummy
            return userinput;
        }*/

    /* mesala  mağazaya girecek olan malların birimini kolaylık olsun diye method oluştururuz
    public String urunBirimSec(String urunIsmi){
    switch(urunismi){
    case "un:
    case "seker":
    return "cuval";
    case "yumurta":
    return "koli";
    case "yağ":
    return "litre";
    }
    return "null"; }hazırlayabiliriz
    String birim=urunBirimSec(urunIsmi); olarak birime atayabiliriz
     */




    }

