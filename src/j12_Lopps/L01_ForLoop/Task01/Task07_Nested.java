package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
     /*   task ->
                girilen boyuttta bir kare için
        Ekran Çıktısı
        Bir sayı giriniz: 7
        1 0 0 0 0 0 0
        0 1 0 0 0 0 0
        0 0 1 0 0 0 0
        0 0 0 1 0 0 0
        0 0 0 0 1 0 0
        0 0 0 0 0 1 0
        0 0 0 0 0 0 1


        Bir sayi giriniz: 5
        1 0 0 0 0
        0 1 0 0 0
        0 0 1 0 0
        0 0 0 1 0
        0 0 0 0 1

        şekli print eden code create ediniz
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("kare için boyut giriniz");
        int sayi = sc.nextInt();


        for (int i = 1; i <= sayi; sayi++) {//apt döngü
            for (int j = 1; j <= sayi; j++) {//daire döngü
                if (i == j) {
                    System.out.print("1 ");
                } else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}