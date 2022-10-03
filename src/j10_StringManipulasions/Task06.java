package j10_StringManipulasions;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        girilen Stringin son karakterini silen code create ediniz.,,,
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String str= sc.nextLine();
        System.out.println(str.substring(0,str.length()-1));// 2.yol str.replace(str.charAt(str.length()-1), "");




    }
}
