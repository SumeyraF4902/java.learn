package day04;

import java.util.Scanner;

public class Q04_StringManipulation {
    public static void main(String[] args) {
        /* KULLANICIDAN bir kelime isteyin eğer kelime 3  ve daha fazla harften oluşuyorsa
        son iki harfini 3 kere yan yana yazdırın. değil ise girilen kelimeyi yazdırın.
        örnek: input=ali
        output=lilili
        input=el
        output=el
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("LÜTFEN  bir kelime giriniz:");
        String str= sc.next();
        if (str.length()>=3){
            System.out.println((str.substring(str.length()-2))+(str.substring(str.length()-2))+(str.substring(str.length()-2)));
        }else System.out.println(str);

        //2 yol String s=str.substring(str.length()-2);
        // if ten sonra System.out.println(s+s+s) yazdırabiliriz
    }
}
