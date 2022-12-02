package Team07_OkulYonetimi.calısma;

import java.util.Scanner;

public class Muhsin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int islem;
       int tutar;
       int bakiye=2000;
        String islemler="işlemler \n1 para cekme \n2 para yatırma\n3 havale yapma\n 4 bakiye sorgulama\n5 kart iade\n" ;
        System.out.println( islemler);
        System.out.println("lütfen işleminizi seciniz");
        islem=sc.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz "+  bakiye);
                System.out.println("ne kadar para çekmek istiyorsunuz");
                tutar=sc.nextInt();
                bakiye=bakiye-tutar;
                    System.out.println(" hesabınız son durumu ="+ bakiye);

            case 2:
                System.out.println("Bakiyeniz "+  bakiye);
                System.out.println("ne kadar para yatırmak istiyorsunuz");
                tutar=sc.nextInt();
                bakiye=bakiye+tutar;
                    System.out.println(" hesabınız son durumu ="+ bakiye);

            case 3:
                System.out.println("Bakiyeniz "+  bakiye);
                System.out.println("ne kadar  havale göndermek  istiyorsunuz");
                tutar=sc.nextInt();
                if (tutar>bakiye) {
                    System.out.println("yeterli bakiyeniz yoktur \n tekrar giriş yapınız");
                    tutar = sc.nextInt();
                }else{
                    bakiye=bakiye-tutar;
                    System.out.println(" hesabınız son durumu ="+ bakiye);}


            case 4:
                System.out.println("Bakiyeniz "+  bakiye);
            case 5:
                System.out.println("lütfen kartınızı almayı unutmayın");
        }
        }
    }
