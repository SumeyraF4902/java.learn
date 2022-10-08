package day_6;

import java.util.Scanner;

public class Q04_ForLoop {
    public static void main(String[] args) {

/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
        Scanner sc=new Scanner(System.in);
        System.out.println("birden büyük bir tam sayı giriniz:");
        int sayı= sc.nextInt();
        int adet=0;
        int karetoplam=0;
        for (int i=1; i< sayı; i++){
            karetoplam+=i*i;
            adet++;


        }
        System.out.println("kareleri toplamı="+karetoplam);
        System.out.println("adet="+adet);





    }
}
