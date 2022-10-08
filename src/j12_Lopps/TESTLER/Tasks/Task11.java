package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner sc= new  Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayı= sc.nextInt();
        int adet=0;
        int toplam=0;
        while(sayı!=0){
            adet++;
            toplam+=sayı;
            sayı= sc.nextInt();
        }

        System.out.println(adet+"sayının toplamı"+toplam);





    }
}
