package day15.Day04;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    public static void main(String[] args) {
        /*
        kullaniciden string alın ve sadece sesli harflerini yazdırın
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("string giriniz");
        String str=sc.nextLine().toLowerCase();
        // while loop ile
        int index=0;
        while (index<str.length()) {
            char c = str.charAt(index);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c);
            }
            index++;

        }
        // replaceALL İLE
        System.out.println();
        str=str.replaceAll("[^aeiuo]","");
        System.out.println(str);


    }
}
