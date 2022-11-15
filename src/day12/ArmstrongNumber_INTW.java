package day12;

import java.util.Scanner;

public class ArmstrongNumber_INTW {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }
    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {// 2 sorunun cevabı
        for (int i = 0; i < sayi; i++) {
            armstrong(i);// ilk soruda ki methodu kullandık
        }
    }
    private static void armstrong(int sayi) {// 1 sorunun methodu
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = sayi;
        while(sayi>0){
            basamaktakiSayi =sayi%10;  //her bir rakama erismek icin
            sayininKupleriToplami +=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);// total = (int) (total + Math.pow(temp,count));
            // küpü bu formüllede yapabiliriz
            sayi =sayi/10; //basamak sayisini eksiltmek icin
        }
        if(girilenSayi ==sayininKupleriToplami){
            System.out.println(girilenSayi + " sayisi armstrong sayidir");
        }else System.out.println(girilenSayi + " sayisi armstrong sayi degildir");

    }

}
