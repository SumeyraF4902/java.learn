package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class calısma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam=0;
        for(int i=1; i<=5;i++){
            System.out.println(i+". sayıyı giriniz");
            int sayi= sc.nextInt();
            if (sayi<=10|| sayi>=20){
                toplam+=sayi;
            }
        }
        System.out.println("girdiğini sayıların istenen şarta toplamı:"+toplam);

    }}