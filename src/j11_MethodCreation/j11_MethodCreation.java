package J11_MethodCreation;

import java.util.Scanner;

public class j11_MethodCreation {
    public static void main(String[] args) {
        //TASK--- GİRİLEN İKİ SAYININ EŞİTLİĞİNİ KONTROL EDEN METHOD CREATE EDİNİZ.
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int a= scan.nextInt(),b= scan.nextInt();
        esitKontrol(a,b);
        esitKontrol(3,5);
        esitKontrol(33,33);
        esitKontrol2(56,67);
        esitKontrol2(61,61);
        esitKontrol2(a,b);


}

    private static boolean esitKontrol(int a, int b) {
        boolean esitMi=false;
        if (a==b){
            esitMi=true;
        }else esitMi=false;
        return esitMi;

    }
    public static void esitKontrol2(int c, int d) {

    }  /*      //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...
​
    Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
    int sayı1 = sc.nextInt();
​
        System.out.print("2. sayıyı giriniz : ");
    int sayı2 = sc.nextInt();
​
        System.out.println(esitKontrol(sayı1, sayı2));//true-false 23=23
        System.out.println(esitKontrol(3, 5));//false
        System.out.println(esitKontrol(33, 33));//true
    esitKontrol2(56,67);//agam sayılar eşit değil :(
    esitKontrol2(61,61);//agam sayılar eşit  :)
    esitKontrol2(sayı1, sayı2);//23=23->agam sayılar eşit :)
​
        ​
        ​
}//main sonu
​
private static boolean esitKontrol(int sayı1, int sayı2) {
        boolean esitMi ;
        if (sayı1 == sayı2) {
        esitMi = true;
        } else esitMi = false;
        ​
        return esitMi;
        }
        ​
public  static  void esitKontrol2(int a,int b){
        if (a == b){
        System.out.println("agam sayılar EŞİT :) ");
        }else System.out.println("agam sayılar eşit değil  :( ");
        ​
        ​
        */








        }



