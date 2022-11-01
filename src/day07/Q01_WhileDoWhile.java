package day07;

import java.util.Scanner;

public class Q01_WhileDoWhile {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz. sayıyı parametre olarak alan bir metod oluşturun
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayı=scan.nextInt();
       System.out.println(basamakToplamı(sayı));
// do While ile
        do {
        int toplam1=0;
        toplam1+=sayı%10;
        sayı/=10;
            System.out.println(toplam1);
    }while (sayı!=0);

        for (int i =0;i<sayı; i/=10){
            int toplam3=0;
            toplam3+=i;
            System.out.println(toplam3);
        }


        }

   private static int basamakToplamı(int sayı) {
        int toplam=0;
        while(sayı!=0){
          toplam+=sayı%10;
        sayı/=10;
        }
        return toplam;

    }


    //for ile

}
