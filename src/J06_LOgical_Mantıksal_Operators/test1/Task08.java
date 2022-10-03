package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Saniye giriniz:");
        int san=sc.nextInt();
        double saat=san/3600;
        double dak=(san%3600)/60;
        double sn=dak/10;
        System.out.println(san+"="+saat+" "+"saat"+" "+dak+" "+"dakika"+" "+sn+" "+"saniye eder.");

    }
}
