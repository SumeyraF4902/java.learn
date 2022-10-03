package j04_AritmeticOperators;

import java.util.Scanner;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("***** Increment Arttırma*****");
        int a=7;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a++ + ++a);
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
    int sayı= scan.nextInt();
    int birler=sayı%10;
    sayı /=10;
    int onlar=sayı%10;
    int yüzler=sayı/10;
        System.out.println("girdiğiniz sayının birler basamağı :"+birler+"\nonlar basamağı :"+onlar+ "\nyüzler basamağı :"+yüzler);



    }
}
