package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //task--> girilen iki sayı arasındaki çift sayıları print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= scan.nextInt();
        System.out.println("bir sayı giriniz");
        int sayi1=scan.nextInt();
        cıftsayı(sayi1,sayi);

    }//main dışı

    private static void cıftsayı(int sayi1, int sayi) {
        if (sayi < sayi1) {
            for (int i=sayi; i<sayi1; i++){
             if (i%2==0){//döngü içindeki sayıların çift kontrolü
                 System.out.println(i+" ");
             }
            }
        }else System.out.println("hatalı giriş yaptınız");
/*
for (int i=Math.min(a,b); i<Math.max(a,b);i++){ bu şekilde yaparsak otomatik olarak kendisi küçük ve büyük sayıyı bulacak
        if (i%2==0){
            System.out.println(i+" ");
 */

    }
}
