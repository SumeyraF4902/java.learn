package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        //hasPrevious= öncesinde eleman varsa, sondan başa doğru yazdırır
        // hasNext= sonrasında eleman varsa, baştan sona doğru yazdırır.
        // while ile kullanılır
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24, 38, 65, 9, 11, 7, 27, 23));
        //l1 elamanlarını tersten print ediniz.
        System.out.println("l1 list ilk hali : " + l1);
        /*
        tekrarda son elemandan başlayan işlemler için pointer en sona götürülmeli
        Bunun için pointer'e sona götüren hasNext() meth çalışmalı.
         */
        ListIterator<Integer> it1 = l1.listIterator();
        while (it1.hasNext()) {//b->s pointer sürekli sona doğru ilerler
            it1.next();
        }
        while (it1.hasPrevious()) {//s->b pointer sürekl basa doğrı ilerler
            //  System.out.print(it1.previous()+" ");//23 27 7 11 9 65 38 24
            System.out.print(it1.previous() + 2 + " ");//2 ekleyerek  yazdırır  25 29 9 13 11 67 40 26
        }

        //System.out.println("l1 tersten print hali : "+l1);
        System.out.println("     ******    ");
        // l2 elemanının sonuncusuna :-) ekleyip print ediniz
        List<String> l2 = new ArrayList<>(Arrays.asList("cağla", "uğur", "muharrem", "cebrail"));
        System.out.println("listiterator öncesi: l2 " + l2);

        ListIterator<String> it2 = l2.listIterator();
        while (it2.hasNext()) {
            String s= it2.next();//elemanı getir
            if (!it2.hasNext()) {// son eleman sonrasında eleman yoksa
                it2.set(s + ":-)");
            }
        }
            System.out.println(l2);//[cağla, uğur, muharrem, cebrail:-)]
        /*
        ÇOK ÖNEMLİ:--> hasPrevious() meth için MUTLAKA KESİNLİKLE hasNext() ve next() meth çalıştırılarak
         cursor (pointer) en sona getirilmeli.

         ITERATOR VE LISTITERATOR FARKLARI Interwiew Soruları

         1- ITERATOR --> Sadece hasNext(),next(),remove(), meth ile çalışır.
         LISTITERATOR--> hasNext(), next(), remove(),hasPrevious(),previous(), add(), set() vs method.çalışır

         2- LISTITERATOR -->Sadece List yapılarda tanımlanır
         ITERATOR --> Tüm collection(list set Array, map..) için tanımlanır

         3- ITERATOR -->Sadece ileri b-->s tekrarlar bastan-->sona
         LISTITERATOR--> b<->s ileri geri ve geri çift yönlü tekrarlar,

         ITERATOR -->Kapsamı geniş ama aksiyonu az
         LISTITERATOR-->Kapsamı dar ama aksiyonu çok



         */
        }

    }


