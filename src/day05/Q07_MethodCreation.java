package day05;

import java.util.Scanner;

public class Q07_MethodCreation {
    public static void main(String[] args) {
       /* üç sayı arasındaki en küçük sayıyı bulan method create ediniz*/
        Scanner sc=new Scanner(System.in);
        System.out.println("üç sayı giriniz");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        enKucuk(a ,b,c);
    }
    public static void enKucuk(int a, int b, int c) {
        if(a<b&&a<c){
            System.out.println("en küçük sayı :"+a);
        } else if (b<a&&b<c) {
            System.out.println("enk küçük sayı:"+b);


        }else System.out.println("en kucuk sayı:"+c);


    }
}
