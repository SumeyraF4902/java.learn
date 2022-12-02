package day15;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan bir stringin ilk ve son harfini yine kullanıcıdan alınan  sayı kadar return eden method create ediniz

        input      output
        elma 2    eaea
        army  3  ayayay
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String str=sc.nextLine();
        System.out.println("kaç kere yazdimak istiyorsun");
        int sayi=sc.nextInt();
        ilkSonHarfi(str,sayi);



    }

    private static void ilkSonHarfi(String str, int sayi) {
        String ilkVeSonHarf=str.substring(0,1).concat(str.substring(str.length()-1));

        String output="";

        for(int i=0; i<sayi;i++) {
          output+=ilkVeSonHarf;
        }  System.out.print(output);
    }
}
