package j09_SwitchStatement_TEST;

import java.util.Scanner;

public class  Q08 {
    /*
     * TASK : BİİTTTİİİ

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("aldığınız ürünün adedini giriniz:");
        int adet = in.nextInt();
        System.out.println("Ürünün liste fiyatını giriniz:");
        int lf = in.nextInt();
        System.out.println("müşteri kartınız var mı:V/Y");
        char kart = in.next().charAt(0);
        int t = adet * lf;
        if (kart == 'V') {
            if (adet > 10) {
                System.out.println("Toplam Tutar: " + (t - (t * 20 / 100)));
            } else{
                System.out.println("Toplam Tutar: " + (t - (t * 15 / 100)));}
        }else  {
                if (adet>10){
                    System.out.println("Toplam Tutar: " + (t-(t*15/100)));
                } else
                    System.out.println("Toplam Tutar: " + (t-(t*10/100)));
        }







    }

}
