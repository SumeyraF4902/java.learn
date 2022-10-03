package day04;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        //kullanıcıdan 4 kelime isteyin ve cümle olarak yazdırıp sonuna . koyun
       /* örnek
       inputs:cesaret,insana,snınırlarını,öğretir
       output:Cesaret insana sınırlarını öğretir.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen cümle oluşturmak için bir kelime giriniz"); String word1=sc.next();
        System.out.println("Lütfen cümle oluşturmak için bir kelime giriniz"); String word2=sc.next();
        System.out.println("Lütfen cümle oluşturmak için bir kelime giriniz"); String word3=sc.next();
        System.out.println("Lütfen cümle oluşturmak için bir kelime giriniz"); String word4=sc.next();
       String cumle=(word1.substring(0,1).toUpperCase()+word1.substring(1)+" "+word2+" "+word3+" "+word4+".");
        System.out.println(cumle);

    }
}
