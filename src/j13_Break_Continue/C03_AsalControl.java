package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        // Task------girilen tam sayının asal olmasını control eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a = scan.nextInt();
        boolean asalMı = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {//eğer sayı kendisine kadar olan sayılara tam bölünüyorsa demek
                asalMı=false;
                break;

            }

        }
        if (asalMı&a!=1){
            System.out.println("girilen sayı Asaldır");
        }else System.out.println("girilen sayı asal değildir");
    }}