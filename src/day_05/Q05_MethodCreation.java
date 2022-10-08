package day_05;

import java.util.Scanner;

public class Q05_MethodCreation {
   static Scanner sc=new Scanner(System.in);
    //Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

    public static void main(String[] args) {

        System.out.println("kaç sayıyı toplamak istiyorsunuz:");
        int adet= sc.nextInt();
        if (adet<2){
            System.out.println("En az iki sayı girmelisiniz");
        } else if (adet==2) {

            ikissayıyıTopla();
        } else if (adet==3) {

            üçSayiTopla();

        } else if (adet==4) {

            dörtSayiTopla();
        }else System.out.println("fazla sayı girdiniz toplayamam");

    }

    private static void dörtSayiTopla() {
        System.out.println("dört sayı giriniz:");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        int sayi3= sc.nextInt();
        int sayi4= sc.nextInt();
        System.out.println("dört sayının toplamı:"+(sayi1+sayi2+sayi3+sayi4));

    }

    private static void üçSayiTopla() {
        System.out.println("üç sayı giriniz:");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        int sayi3= sc.nextInt();
        System.out.println("üç sayının toplamı:"+(sayi1+sayi2+sayi3));
    }

    private static void ikissayıyıTopla() {
        System.out.println("iki sayı giriniz:");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        System.out.println("iki sayının toplamı:"+(sayi1+sayi2));
    }
}



/*
 * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
 *
 * input      output
 * axyzm  ==   true
 * xyz    ==   true
 * x.yz   ==   false
 * xyaz   ==   false
 *
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String str = scan.nextLine().toLowerCase();
        System.out.println(xyzVarMi(str));
        xyzVarMiVoid(str);
    }
    private static void xyzVarMiVoid(String str) {
        System.out.println(str.contains("xyz") ? "true xyz var": "false yok");
    }
    private static boolean xyzVarMi(String str) {
        if(str.contains("xyz")) {
            return true;
        }else
            return false;
    }

    /*
     private static String xyzVarMi(String str) {
        String sonuc = "";
        if (str.contains("xyz")) {
            sonuc = "var";
        } else
            sonuc = "yok";
        return sonuc;
    }
     */
