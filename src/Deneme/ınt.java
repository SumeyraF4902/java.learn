package Deneme;

import java.util.Locale;
import java.util.Scanner;

public class ınt {
    public static void main(String[] args) {

        /* TASK :* ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("günde kaç saat uyuyorsunuz : ");
       int saat=sc.nextInt();
        System.out.println("ayda"+" "+(saat*30)+" "+"yılda"+" "+(saat*365)+" "+ "40 yılda"+" "+(40*365*saat)+" "+" saat uyuyorsunuz");

    }
}