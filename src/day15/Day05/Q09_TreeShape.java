package day15.Day05;

import java.util.Scanner;

public class Q09_TreeShape { // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken
    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("tac uzunluğunu giriniz");
        int tacUzunluk= sc.nextInt();
        String agac="";//bu degiskeni for loop icinde kullanmak icin tanımladik
        for (int i = 0; i < tacUzunluk; i++) {
            agac+="^";// kod satiri  sayesinde gor loopa ihitiyac duymadan yazdik
            System.out.println(agac);
        }
        for (int i = 0; i <5;i++) {// gövde sabit oldugu icin 5 girdik
            System.out.println("| | |");
        }
    }
}
