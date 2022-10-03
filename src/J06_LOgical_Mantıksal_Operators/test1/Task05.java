package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("kaç saati saniyeye çevirmek istiyorsunuz?");
        int saat=sc.nextInt();
        System.out.println("kaç dakikayı saate çevirmek istiyorsunuz");
        int dak=sc.nextInt();
        System.out.println("kaç saniye eklemek istiyorsunuz");
            int san=sc.nextInt();
        System.out.println("toplam"+" "+"saat"+" "+((saat*3600)+(dak*60)+san)+" "+"saniye");


    }

}
