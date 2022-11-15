package day08;


import java.time.LocalDate;
import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("isminiz?");
        String isim=sc.nextLine().toUpperCase();
        System.out.println("cinsiyetiniz:  E/K");
        char cinsiyet=sc.next().toUpperCase().charAt(0);
        if(cinsiyet=='E'){
            System.out.println("Hoşgeldiniz  "+isim+  "  Bey");
        }else System.out.println("Hoşgeldiniz  "+isim+  "  Hanım");

    }
    }

































