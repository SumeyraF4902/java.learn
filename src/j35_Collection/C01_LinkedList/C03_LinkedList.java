package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>(Arrays.asList("javaCAN","Ebubekir","Gülsüm","Ebubekir","Adem","İlker","JavaCAN","Merve"));
        System.out.println("ll1="+ll1);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, JavaCAN, Merve]
        //LinkedList remove()... ilk node ile silinir ve silinen node return edilir. silineni consola yazdırı
        System.out.println("ll1.remove()=" + ll1.remove());//javaCAN
        System.out.println("ll1="+ll1);//[Ebubekir, Gülsüm, Ebubekir, Adem, İlker, JavaCAN, Merve]

        System.out.println("ll1.remove()="+ ll1.remove(3));//3 indexteki silindi. Adem-- silinen node return eder.
        System.out.println("ll1="+ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, JavaCAN, Merve]

        System.out.println("ll1.remove( Merve)="+ ll1.remove("Merve")); //true sildim der, listede  olan node silinince true verir
        System.out.println("ll1.remove(javatar)="+ ll1.remove("javatar"));// false --olmayan node için false verir.

        System.out.println("ll1="+ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, JavaCAN]

        System.out.println("ll1.removeFirstOccurrence(\"ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//true
        // eğer ilk karakterde istenen node varsa siler, true verir, eleman yoksa false.
        System.out.println("ll1 =" + ll1);//[Gülsüm, Ebubekir, İlker, JavaCAN]

        System.out.println("ll1.element() =" + ll1.element());//ilk node retrun eder -> Gülsüm

        LinkedList<String>ll2= new LinkedList<>(Arrays.asList("JavaCAN","Ebubekir","Gülsüm","Ebubekir","Adem","İlker","JavaCAN","Merve"));

        LinkedList<String> ll3=new LinkedList<>(Arrays.asList("Hasan","Harun","Haluk", "Hasmayan"));

        ll2.addAll(ll3);//ll2 ye ll3 tamamı eklendi
        System.out.println("ll2 = " + ll2);//[JavaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, JavaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));//ll2 den ll3 tamamı silindi
        System.out.println("ll2 = " + ll2);//[JavaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, JavaCAN, Merve]
        System.out.println("ll2.get(2) = " + ll2.get(2));//Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//JavaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//Hasmayan


    }
}
