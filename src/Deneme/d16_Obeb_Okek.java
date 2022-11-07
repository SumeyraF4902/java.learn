package Deneme;

import java.util.ArrayList;
import java.util.Scanner;

public class d16_Obeb_Okek {
    public static void main(String[] args) {
        // TASK2 => girilen iki sayının EBOB ve EKOK larını print eden method yazınız.
        //Kod surekli tekrar etsin  EBOB
        while (true) {

            //Bolenler icin integer turunde bir arraylist tanimladik
            ArrayList<Integer> arrBolenler = new ArrayList<>();

            //Giris islemleri icin scanneri tanimladik
            Scanner giris = new Scanner(System.in);

            //1.sayiyi istedik
            System.out.println("1.Sayiyi giriniz");
            int sayi1 = giris.nextInt();

            //2.sayiyi istedik
            System.out.println("2.sayiyi giriniz");
            int sayi2 = giris.nextInt();

            //Girilen sayilardan hangisi daha kucuk onu tespit ettik
            //For dongusu ona kadar calisak,cunku ortak bolenleri arıyoruz.
            int enKucukSayi = sayi1 < sayi2 ? sayi1 : sayi2;
            System.out.println("En buyuk = " + enKucukSayi);

            //2 den baslayip,enKucukSayi ya kadar olansayilari..
            //.. girilen sayilara tam bolunuyor mu diye kontrol ettik
            for (int i = 2; i < enKucukSayi; i++) {

                //Eger ikisine de tam bolunuyorsa
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    //ArraBolenler dizimize bu sayiyi ekledik
                    arrBolenler.add(i);
                }
                //Degilse bir sey yapmiyoruz zaten
            }
            //Artik bu bolenler arasinda en buyugunu bulmaya geldik.Bunun icin bir degisken tanimladik..
            //..Ve baslangic olarak dizimizdeki 1.elemani enBuyukBolen diye kabul ettik
            int enBuyukBolen = arrBolenler.get(0);

            //Tum dizide 2.elemandan baslayip dolasiyoruz
            for (int i = 1; i < arrBolenler.size(); i++) {

                //Eger dizinin elemanlarindan biri,bizim enBuyukBolen imizden buyukse,artık enBuyukBolen o olsun
                if (arrBolenler.get(i) > enBuyukBolen) {
                    enBuyukBolen = arrBolenler.get(i);
                }
                //Degilse bir sey yapma
            }

            //En son En buyuk boleni ekrana yaz
            System.out.println("En Buyuk Bolen = " + enBuyukBolen);
            System.out.println("---------------------------------");
        }
        // 2 YOL
        /*int sayi3=162;
        int sayi2 = 72;
        int enKucukSayi = sayi3 < sayi2 ? sayi3 : sayi2;
        ArrayList<Integer> arrBolenler = new ArrayList<>();

        for (int i = 2; i <= enKucukSayi; i++) {
            if (sayi3 % i == 0 && sayi2 % i == 0) {
                arrBolenler.add(i);
            }
        }
        System.out.println("Ebob(" + sayi3 + "," + sayi2 + ")=" + arrBolenler.get(arrBolenler.size() - 1));*/
    }

    }

