package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11_Arrays {
    public static void main(String[] args) {
         /*
    aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */
        List<Integer>sayi= new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 8, 10,9));

        List<Integer>Alist = new ArrayList<>();
        Collections.sort(sayi);
        for(int i=1; i<=10;i++) {
            if (!sayi.contains(i)) {
                Alist.add(i);
            }

        }
     /*   System.out.println(Alist);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 8, 10, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7, 2, 3, 10, 5, 9, 1, 4, 8));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7, 5, 1, 2, 4, 6, 8, 3, 9));

        System.out.println(eksiksayi(list1));
        System.out.println(eksiksayi(list2));
        System.out.println(eksiksayi(list3));


    }
​
    private static ArrayList<Integer> eksiksayi(ArrayList<Integer> list1) {
        ArrayList<Integer> eksiksayi = new ArrayList<>();
        for(int i =1; i<=10 ; i++){
            if(!list1.contains(i)){
                eksiksayi.add(i);
            }
        }
        return eksiksayi;*/

    }

    }

