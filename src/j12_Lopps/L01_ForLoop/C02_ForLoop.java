package j12_Lopps.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //task--> girilen sayıdan 100 e kadar 4 +un katı tamsayıları print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("100 e kadar pozitif bir tam sayı giriniz");
        int sayi= scan.nextInt();
        if (sayi>100){
            System.out.println("agam hani 100 den küçük girecektin");
        }else {
        for (int i=sayi; i<100; i++){//100 değeri foru çalıştırmaz 98 foru çalıştırır ama for içindeki if çalışmaz
            if (i%4==0){
                System.out.println(i+" ");
            }else System.out.println("sayı 4 ün katı değildir");
        }
    }
}}
