package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>liste= new ArrayList<>();
        System.out.println("listinizin uzunluğu ne kadar olsun");
        int listeUzunluk= sc.nextInt();
        int sayı=0;
        while(sayı<listeUzunluk) {
            System.out.println(sayı + " giriniz");
            liste.add(sc.nextInt());

            sayı++;
        }
        System.out.println(liste);
        System.out.println(tekrarlayansayı(liste));


    }

    private static ArrayList<Integer> tekrarlayansayı(List<Integer>liste) {
        ArrayList<Integer>tEKRARSAYI= new ArrayList<>();
        Collections.sort(liste);
        for(int i = 0; i < liste.size(); i++){
            for(int j=i+1; j<liste.size(); j++){
                if (liste.get(i)==liste.get(j)){
                    tEKRARSAYI.add(liste.get(i));
                }
            }
        }return tEKRARSAYI;
    }
}
