package day02;

import java.util.Scanner;

public class Q04_IfSatament {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen Y/N ikilisinden birini girin:");
        char ce = scan.next().charAt(0);
        if (ce == 'Y' || ce == 'y') {
            System.out.println("YES");
        } else if (ce == 'N' || ce == 'n') {
            System.out.println("NO");
        } else {
            System.out.println("yalnış girdiniz");


        }
    }
}