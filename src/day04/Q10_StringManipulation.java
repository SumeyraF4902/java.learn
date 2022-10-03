package day04;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner sc=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String name=sc.nextLine().toLowerCase();
        System.out.println("soy ismizini giriniz");
        String soyisim=sc.nextLine().toLowerCase();
        if(name.length()>soyisim.length()) {
            System.out.println("isminiz daha uzun");
        } else if(name.length()==soyisim.length()){ System.out.println( "isim ve so isim eşit");
        }else System.out.println("soyisminiz daha uzun");




    }
}
