package day07;

import java.util.Scanner;

public class Q11_Count {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
                Scanner sc=new Scanner(System.in);
        System.out.println(" bir cümle giriniz:");
        String cumle=sc.nextLine();
        System.out.println("hangi harfi öğrenmek istiyorsun:");
        char c=sc.next().charAt(0);
        int cSayısı=0;
        for (int i=0;i<cumle.length(); i++){
            if(cumle.charAt(i)==c){
                cSayısı++;

            }

        }
        System.out.println(c+" harfi"+ cSayısı+" "+"kadar kullanılmış" );
    }
}
