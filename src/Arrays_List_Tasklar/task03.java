package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;

public class task03 {
    public static void main(String[] args) {
        /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

        ArrayList<String>sehir=new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println("uzunluk = " + getLengths(sehir));
    }

    private static ArrayList<Integer> getLengths(ArrayList<String> a) {
        ArrayList<Integer>list=new ArrayList<>();
        for (String value:a){
            list.add(value.length());
        }

       return list;
    }
    /*ArrayList<Integer> list = new ArrayList<>();
            for (String w: strlist) {
                list.add(w.length());*/


}
