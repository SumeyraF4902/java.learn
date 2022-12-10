package day15.Day05;

import j26_ınheritance.task01.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {
    public static void main(String[] args) {
        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have
        // find out what are the duplicated values

        // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
        // kaç tane tekrarli eleman olduğunu sayin
        // yinelenen değerlerin ne olduğunu öğrenin
        ArrayList<Integer>list=new ArrayList(List.of(1, 3, 1, 2, 4, 5, 3));
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        System.out.println("list = " + list);// 2 koyya olusturuldu
        int tekrarliElemanSayisi=0;
        Set<Integer> uniqeNumbers = new HashSet<>();
        ArrayList<Integer>tekrarliEleman= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean ekliMi=uniqeNumbers.add(list.get(i));//ekli  olma durumu uniqe var olmasıdır
            if(!ekliMi){// uniqe elemanlara eklenmediyse  o eleman duplicate dir
                tekrarliElemanSayisi++;
                tekrarliEleman.add(list.get(i));

            }

        }
        System.out.println("tekrarliEleman = " + tekrarliEleman);// [1, 3, 1, 3, 1, 2, 4, 5, 3]
        System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi);//9

    }
}
