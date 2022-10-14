package day05;

import java.util.Scanner;

public class Q01_MethodCreate {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=scan.nextInt();
        System.out.println(isEven(sayı));
    }

/* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/


    public static boolean isEven(int sayı) {
        return sayı%2==0 ? true:false;

    }
}
