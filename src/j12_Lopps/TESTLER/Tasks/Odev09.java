package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Odev09 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();
        int sonuc=0;
        for (int i=2; i<=sayi;i++){
            sonuc+=i*i;

        }
        System.out.print("toplam "+ sonuc);




    }
}