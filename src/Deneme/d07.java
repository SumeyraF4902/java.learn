package Deneme;

import java.util.Scanner;

public class d07 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("5 haneli bir rakam giriniz:");
        int sayi=sc.nextInt();
        int a=sayi%10;
        int b=(sayi/10)%10;
        int c=(sayi/100)%10;
        int d=(sayi/1000)%10;
        int e=(sayi/10000);
        System.out.println("sayı: "+"\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);


    }
}
