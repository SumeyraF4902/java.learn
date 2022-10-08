package day_6;

import java.util.Scanner;

public class Q08_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı 2 sayı giriniz:" );
        int sayı1=sc.nextInt();
        int sayı2=sc.nextInt();
        int toplam=0;
        if (sayı1<sayı2){
            for (int i= sayı1; i <=sayı2; i++){
                toplam+=i;
            }
            System.out.println(sayı1+ "ile "+ sayı2+ "arasındaki sayıların toplamı:"+toplam);
        } else if (sayı1>sayı2) {
            for (int i=sayı2;i<=sayı1; i++){
                toplam+=i;
            }
                System.out.println(sayı1+ "ile "+ sayı2+ "arasındaki sayıların toplamı:"+toplam);

        }else System.out.println("sayılar eşittir");


        /* Cuneyt bey den 2 yol;
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2 ? sayi1 : sayi2); i<= (sayi1>sayi2 ? sayi1 : sayi2); i++) {
            toplam+=i;
        }System.out.println("toplamları = " + toplam);
     */

    }
}
