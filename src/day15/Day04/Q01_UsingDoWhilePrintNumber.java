package day15.Day04;

import java.util.Scanner;

public class Q01_UsingDoWhilePrintNumber {
    public static void main(String[] args) {
        /*
     do while ile  girilen sayıyı   5 er arttırarak 100 kadar yazdıralım yazdırın
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi=sc.nextInt();
        do{
            System.out.print(sayi+" ");
            sayi+=5;

        }while(sayi<100);


    }
}
