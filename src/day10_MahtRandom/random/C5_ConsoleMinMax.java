package day10_MahtRandom.random;

import java.util.Scanner;

public class C5_ConsoleMinMax {
    public static void main(String[] args) {
        // console üzerinden dedimi scanner kullanılır kullanıcıdan istenir demektir,
        //console üzerinden maxsimuum ve minimum değeri sağlayınız
        //ve buradan gelen rakamları Math.rondom() da olmasını istediğiniz aralığa getiriniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı1:"); int sayı1=sc.nextInt();
        System.out.println("sayı2:"); int sayı2=sc.nextInt();
        System.out.println(Math.max(sayı1,sayı2));// burada biz sadece iki sayı arasından büyük olanı yazdırdık.
        // bizden istenen kullanıcının girdiği iki değer arasından bilgisayarın yeni bir değer üretmesi
        // 1 yol
        if (sayı1>sayı2){
            int random=(int) (Math.random()*sayı1);// büyük olan sayıya kadar bir sayı üret
            System.out.println("random: "+random);
        } else {
            int random=(int) (Math.random()*sayı2);// büyük olan sayıya kadar bir sayı üret
            System.out.println("random: "+random);
        // 2 yol
        //int randomNum =(int) (Math.random() * ((Math.max(sayi1,sayi2) - Math.min(sayi1,sayi2)) + 1)) + Math.min(sayi1,sayi2);
      //  System.out.println("randomNum = " + randomNum);



    }
}}
