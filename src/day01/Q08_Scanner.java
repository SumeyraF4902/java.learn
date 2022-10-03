package day01;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
// bu tam sayilari toplayin ve sonucu yazdirin

Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        int tam=scan.nextInt();
        int tam2=scan.nextInt();
        System.out.println(tam+tam2);



    }
}
