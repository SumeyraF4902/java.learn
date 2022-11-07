package day09.day1_ınterwiew_soruları;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /*
    * Kullanicidan bir cumle ve bir harf alin,
    * Cumlede harfin kac kere
    * kullanildigini bulup, yazdirin
    * ORNEK:
    * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
    *
    * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String str=sc.nextLine();
        System.out.println("sayısını öğrenmek istediğiniz harfi giriniz");
        char c=sc.next().toLowerCase().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)==c){
                count++;
            }
        }
        System.out.println("girdiğiniz cümlede "+c + "harfin adedi: "+ count);


    }



}
