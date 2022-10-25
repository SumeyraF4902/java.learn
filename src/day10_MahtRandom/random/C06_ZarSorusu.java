package day10_MahtRandom.random;

public class C06_ZarSorusu {
    public static void main(String[] args) {
        /*
        iki tane atılan zarın toplamlarının 9 olması durumunda  " Kazandınız" yazını yazdırınız,
        aksi takdirde " Tekrar deneyiniz" yazısı yazmalı.
         */
        int min=1;
        int max=6;
        int zar1= (int) (Math.random()* ((max - min) + 1))+ min;
        int zar2= (int) (Math.random()* ((max - min) + 1))+ min;
        System.out.println("zar1: " + zar1);
        System.out.println("zar2: " + zar2);
        int toplam=zar1 + zar2;
        if(toplam==9){
            System.out.println("Kazandınız");
        }else System.out.println("tekrar deneyiniz");

       // System.out.println((zar1 + zar2 == 9) ? "Kazandınız" : "Tekrar deneyiniz"); ternary le cevaplandı


    }
}
