package day02;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12 -------------------
         */

Scanner sc=new Scanner(System.in);
        System.out.println("5 basamaklı sayı giriniz");
        int say= sc.nextInt();
int ilkIki=say/1000;//12
int sonIki=say%100;//45
        int ilkIkiTop=(ilkIki/10)+(ilkIki%10);//1+2
        int sonIkiTop=(sonIki/10)+(sonIki%10);//4+5
        System.out.println("TOPLAMI:"+(ilkIkiTop+sonIkiTop));

    }
}
