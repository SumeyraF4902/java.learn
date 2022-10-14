package day07;

import java.util.Scanner;

public class Q05_ForLoop {
    public static void main(String[] args) {

        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
        Scanner sc=new Scanner(System.in);
        int toplam=0;
        int count=0;
        for (int i = 0; i < 100; i++) {
            System.out.print("sayi giriniz : ");
            count++;
            int sayi = sc.nextInt();
            toplam+=sayi;
            if (toplam>100){
                System.out.println(count + " kere sayi girdin. Bu kadar sayi yeter ");
                System.out.println("toplam = " + toplam);
                break;
            }
            System.out.println("toplam = " + toplam);
        }






/* 2. yol
int sayiToplam = 0;
		int adet = 0;
		while (sayiToplam<=100) {
			System.out.print("Sayı giriniz : ");
			int num = scan.nextInt();
			sayiToplam+=num;
			System.out.println("sayıların toplamı = " + sayiToplam);
			adet++;
		}
		System.out.println(adet + "kere sayı girdin Bu kadar sayı yeter. Sayı toplamları = " + sayiToplam);*/

/*  3 YOL
   int toplam=0;
        int kere=0;
        do{
            System.out.println("Sayi giriniz");
            int sayi=scan.nextInt();
            toplam+=sayi;
            System.out.println(toplam);
            kere++;
        }while (toplam<=100);
        scan.close();
        System.out.println(kere+" kere sayi girdin.Bu kadar sayi yeter");*/
    }
}
