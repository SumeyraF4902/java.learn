package Deneme;

import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        /* KULLANICIDAN bir kelime isteyin eğer kelime 3  ve daha fazla harften oluşuyorsa
        son iki harfini 3 kere yan yana yazdırın. değil ise girilen kelimeyi yazdırın.
        örnek: input=ali
        output=lilili
        input=el
        output=el
         */
      Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String kel=sc.nextLine().toUpperCase();
        if(kel.length()>=3){
            System.out.println(kel.substring(kel.length()-2)+kel.substring(kel.length()-2));

        }else System.out.println(kel);
    }
}