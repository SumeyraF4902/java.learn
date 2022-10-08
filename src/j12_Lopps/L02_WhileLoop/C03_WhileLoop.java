package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //Task--girilen tamsayısını tam bölen sayısını print eden code create ediniz
        //20-->1,2,4,5,10,20,; 6 tane tam böleni vardır
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= sc.nextInt();
        int bolenSayı=1;
        int tamBolenAdedi=0;//hem kendine , hemde 1 bölündüğü için 2 tane böleni vardır kesin. 0 yerine 2 de yazabiliriz başlangıç olarak.
        while(bolenSayı<=sayi) {
            if (sayi % bolenSayı == 0) {//sayı bolenSayıya tam bölünme şartı
                tamBolenAdedi++;

            }

            bolenSayı++;//loop sonsuza düşmemesi için ve diğer sayıların böldüğü kontrol edilmesi için yazıldı
        }
        System.out.println("agam girdiğin "+sayi+" nın "+tamBolenAdedi+" kadar tam boleni var :)");

    }
}
