package Team07.calısma;

import java.util.Scanner;

public class Switch_Atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  islem,tutar, bakiye=2000;
        String islemler="işlemler \n1 para cekme \n2 para yatırma\n3 havale yapma\n 4 bakiye sorgulama\n5 kart iade\n" ;
        System.out.println( islemler);
        System.out.println("lütfen işleminizi seciniz");
        islem=sc.nextInt();;
        switch (islem) {
            case 1:
                System.out.printf("Bakiyenız=%d\n", bakiye);
                System.out.printf("Çekmek istediğiniz tutarı giriniz=");
                tutar = sc.nextInt();
                if (tutar > 2000) {
                    System.out.printf("Hesabınızda yeterli bakiye olmadığı için bu tutarı veremiyoruz\n yeniden giriniz= ");
                    tutar = sc.nextInt();
                }
                bakiye = bakiye - tutar;
                System.out.printf(" yeni bakiyeniz=%d", bakiye);
                break;
            case 2:
                System.out.printf("Bakiyenız=%d\n", bakiye);
                System.out.printf("Yatırmak  istediğiniz tutarı giriniz=");
                tutar = sc.nextInt();
                bakiye = bakiye + tutar;
                System.out.printf(" Yeni bakiyeniz%d", bakiye);
                break;
            case 3:
                System.out.printf("Bakiyenız=%d\n", bakiye);
                System.out.printf("havaleyapmak   istediğiniz tutarı giriniz=");
                tutar = sc.nextInt();
                if (tutar > bakiye) {
                    System.out.println("yetersiz bakiye \n lütfen gecerli bir tutar giriniz");
                    tutar=sc.nextInt();
                }
                bakiye = bakiye - tutar;
                System.out.printf(" Yeni bakiyeniz%d", bakiye);
                break;
                case 4:
                    System.out.println("bakiyeniz=" +bakiye);break;
            case 5:
                System.out.println("Kartınızı almayı unutmayın");
        }
    }
}
