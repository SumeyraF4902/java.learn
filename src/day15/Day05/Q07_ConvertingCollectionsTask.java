package day15.Day05;

import java.util.*;

public class Q07_ConvertingCollectionsTask {
    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {


        Integer array[] = new Integer[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("array: "+Arrays.toString(array));//array: [3, 5, 0, 7, 4, 0, 8, 2, 7, 0]

        ArrayList<Integer> arraydenListeDonusum=new ArrayList<>(Arrays.asList(array));
        System.out.println(arraydenListeDonusum);//[3, 5, 0, 7, 4, 0, 8, 2, 7, 0]

        Set<Integer> listtenSeteDonusum=new HashSet<>(arraydenListeDonusum);
        System.out.println(listtenSeteDonusum);//[2, 4, 5, 6, 7, 9] hasset tekrarlı eleman kabul etmez
    }
}