package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
        Değer ataması yapılan Array'i Arrayliste çeviren method create ediniz
        main içersinde meth return ettiği arrylist i hashset, linkedHashSet ve TreeSett 'e atayınız
         */
        String arr[]={"Muharrem","Umit","Sinan","Nihan"};
       // arrayListeCevir(arr);
        HashSet<String>hs=new HashSet<>(arrayListeCevir(arr));// karışık olarak ekrana yazdırır.
       LinkedHashSet<String> lhs=new LinkedHashSet<>(arrayListeCevir(arr));// Girdiğimiz sırayla ekrana yazdırır
        TreeSet<String> ts=new TreeSet<>(arrayListeCevir(arr));// TreeSet-->Alfabetik sıralama yapar

        System.out.println("hurraa set:"+ hs);//[Muharrem, Sinan, Nihan, Umit]
        System.out.println("erken gelen girer set:"+ lhs);//[Muharrem, Umit, Sinan, Nihan]
        System.out.println("alfabetik sıra  set:"+ ts);//[Muharrem, Nihan, Sinan, Umit]

    }// main sonu

    private static ArrayList<String> arrayListeCevir(String arr[]) {
        ArrayList<String> arLst = new ArrayList<>(List.of(arr));
        for (String s : arr) {
            arLst.add(s);
        }

        return arLst;
    }
}
