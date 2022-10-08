package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class tassk1 {
    public static void main(String[] args) {
        /*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int toplam=0;
        int adet=0;
        while(toplam<333){

            int sayı= sc.nextInt();
            toplam+=sayı;
            adet++;
        }
        System.out.println(adet+"sayının toplamı:"+toplam);
    }
}
