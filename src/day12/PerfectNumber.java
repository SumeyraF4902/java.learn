package day12;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
         /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

            Scanner scan = new Scanner(System.in);
            System.out.println("bir sayi giriniz");
            int sayi = scan.nextInt();

            perfectNumber(sayi);
            girilenSayiyaKadarOlanPerfect(sayi);
        }
        private static void girilenSayiyaKadarOlanPerfect(int sayi) {// burası if else de yazan cümlenin altındaki sayıları yazdırır
            int toplam = 0;
            for (int i = 1; i < sayi; i++) { //girilen sayiya kadar
                for (int j = 1; j < i; j++) { //burada bolenler kontrol edilir
                    if(i%j == 0){ //sayinin herhangi bir boleni varsa
                        toplam +=j;//bolenleri toplama ekle
                    }
                }
                if(toplam ==i) {
                    System.out.println(i + " mukemmel sayidir");
                }
                toplam =0;
            }
        }
        private static void perfectNumber(int sayi) {
            int toplam =0;
            for (int i = 1; i <sayi ; i++) { //1 den basalyarak bolenleri kontrol edecegiz, sayi dahil olmamali
                if(sayi%i ==0){ //sayinin herhangi bir boleni (i) varsa
                    toplam+=i;//toplam degiskenine ekle
                    System.out.print( i + " ");//bolenleri gormek icin
                }
            }
            System.out.println();
            if(toplam ==sayi){ //bolenlerin toplami sayiya esitse
                System.out.println(sayi + " sayisi mukemmel sayidir");
            }else
                System.out.println(sayi + " sayisi mukemmel sayi degildir");

    }
}
