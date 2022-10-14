package day07;

import java.util.Scanner;

public class Q09_Continue {
    public static void main(String[] args) {
          /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        Scanner sc=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = sc.nextLine();
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)==' ') continue;
            System.out.println(str.charAt(i));
        }


    }
}
