package day15.Day05;

import java.util.Scanner;

public class Q08_UseContinue {
    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String str = sc.next();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'|| str.charAt(i)==' ')
                continue;
                System.out.println(str.charAt(i));


        }


    }
}