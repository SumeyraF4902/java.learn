package day15.Day04;

import java.util.Scanner;

public class Q10_OddIndexNumber {
    public static void main(String[] args) {
        /*
        indexi tek  sayı olan  karakterleri yazdıran bir code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str=sc.nextLine();
        int index=0;
        do{ if(index%2==1) {// indexi tek sayı olan
            System.out.print(str.charAt(index)+ "");
        }
        index++;

        }while (index<str.length());
    }
}
