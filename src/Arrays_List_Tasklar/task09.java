package Arrays_List_Tasklar;

import java.util.ArrayList;

public class task09 {
    public static void main(String[] args) {
          /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */
      int  arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      ArrayList<Integer> list=new ArrayList<>();
        for (int [] a:arr){
            for(int b:a){
            list.add(b);

        }
    }
        System.out.println(list);
}}
