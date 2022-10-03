package Deneme;

import java.util.Scanner;

public class d09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("LÜTFEN Y/N İKİLİSİNDEN BİRİNİ GİRİNİZ:");
        char s=sc.next().charAt(0);
        if(s=='Y' || s=='y'){
            System.out.println("YES");
        }else if (s=='N'|| s=='n'){
            System.out.println("NO");
        }else System.out.println("tekrar deneyiniz");


    }
}
