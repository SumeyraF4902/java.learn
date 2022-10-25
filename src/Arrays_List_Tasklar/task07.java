package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;

public class task07 {
    public static void main(String[] args) {
  /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */
        ArrayList<Integer>list1=new ArrayList(List.of(8,7,9,6,7));
        ArrayList<Integer>list2=new ArrayList(List.of(6,7,12,3,1));
        System.out.println(comman_values(list1, list2));
    }

    private static ArrayList<Integer> comman_values(ArrayList<Integer>a, ArrayList<Integer>b) {
        ArrayList<Integer>list=new ArrayList();
        for (int i=0; i<a.size()-1;i++){
            for(int j=0;j<b.size()-1;j++){
                if(a.get(i)==b.get(j)){
                   list.add(a.get(i));
                }
            }
        }return list;
    }/*        ArrayList<Integer> ortak = new ArrayList<>();
        for(int i : a){
            for(int j : b){
                if(j == i) ortak.add(i);
            }
        }
        return ortak;*/

}
