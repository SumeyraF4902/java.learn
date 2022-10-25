package day08;

import java.util.ArrayList;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanları yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int sayi[]={1,2,3,4,5,6,7};
        int toplam=0;

        for(int i = 0; i<sayi.length; i++){
            toplam+=sayi[i];
        }
         double ortalama=toplam/sayi.length;
        System.out.println(ortalama);
        System.out.println("ortalamadan büyük olan elemanlar");
        for (int i= 1; i <sayi.length ; i++){
            if(sayi[i]>ortalama){
                System.out.print(sayi[i]+ " ");
            }
        }


    }
}
