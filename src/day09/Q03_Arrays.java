package day09;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {
        // kullanıcıdan bir cümle isteyin ve kelime sayısını yazdırın. ödev split " " böl,
       String cumle;
        Scanner sc = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        cumle = sc.nextLine();
        String kelimesay[]=cumle.split(" ");
        System.out.println(kelimesay.length);

}}