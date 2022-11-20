package j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list =new LinkedList<>();//Dta type object (Hz. Adem)--> ne olursan ol gel,
        // object dediğimiz için int, string , char hepsini ekleyebiliriz
        //Bad practice app. çok yavaşlar tavsiye edilmez: cıısss...
        list.add("Nazım");
        list.add('$');
        list.add(1453);
        System.out.println("list =  "+ list);//[Nazım, $, 1453]

    }}
