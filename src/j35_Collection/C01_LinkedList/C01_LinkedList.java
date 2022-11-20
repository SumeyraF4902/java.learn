package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList.....
        1- LinkedList de elemanlar "data" ve "adress" olmak üzere iki kısımdan oluşur ve eleman yerine "node" olarak
        tanımlanır.
        2- LinkedList' te ilk note data barındırmayan sadece adres bulunduran head note tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4-ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır. LinkedList eleman bulmada
        index yapısı olmadığı için başarısıdır.
        5-LinkedList --> Tren vagon ilişkisi bağlantısı gibi düşünüşebilir
        6-Collection obj tanımlanırken cons class (LinkedList ,ArrayList.. ) olmalı, interface(List Queue...)
        olmamasına dikkat edilmeli.
        ancak obj. Data Type olarak parent interface  tanımlanabilir.
        7- LinkedList clss iki tane parent interface'den (List, Queue ) implement etmiştir.
        */

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Adem","İlker","Merve"));//Declare+assaigment(bildirme-atama)
        //LinkedList print...
        System.out.println("ll1="+ll1);//[Ebubekir, Gülsüm, Adem, İlker, Merve]
       // LinkedList.add().--> ekleme
        ll1.add("uğur");// en sona eklenir
        System.out.println("ll1="+ll1);//[Ebubekir, Gülsüm, Adem, İlker, Merve, uğur]
        ll1.add(2,"Abdulaziz");//istenilen indexe eklenir
        System.out.println("ll1="+ll1);//[Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, uğur]
        ll1.addFirst("Javacan");//ilk indexe eklendi
        System.out.println("ll1="+ll1);//[Javacan, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, uğur]
        ll1.addLast("Javatar");// sona eklendi
        System.out.println("ll1="+ll1);//[Javacan, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, uğur, Javatar]

        List<String> ll2=new LinkedList<> (Arrays.asList("Fatih","Erol","Nur"));//data type interface(arayüz) list olan LinkedList
        ll1.addAll(ll2);// ll2 listin tamamını  ll1 listesine ekledik
        //ll1.add("Agam");// CTE -->parametre coll olmazsa.

        System.out.println("ll1 : " + ll1);//[Javacan, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, uğur, Javatar, Fatih, Erol, Nur]
        ll1.addAll(3,ll2);// ll1 listesinin 3 indexsine ll2 nin tamamını ekledik.
        System.out.println("ll1 : " + ll1);//[Javacan, Ebubekir, Gülsüm, Fatih, Erol, Nur, Abdulaziz, Adem, İlker, Merve, uğur, Javatar, Fatih, Erol, Nur]
        
    }
}
