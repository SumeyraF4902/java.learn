package j09_SwitchStatement_TEST.testswitch;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız BİİTTTİİİİİİİİİİİİİİİİİ

        Scanner scan=new Scanner(System.in);
        System.out.println("Pazaresi-->1\nSalı--<2\nÇarşamba-->3\nPerşembe-->4\nCuma-->5\nCumartesi-->6\nPazar-->7  Lütfen birgün giriniz:");
        int gun=scan.nextInt();
        switch (gun){
            case 1:
                System.out.println("pazartesi");break;
            case 2:
                System.out.println("salı");break;
            case 3:
                System.out.println("çarşamba");break;
            case 4:
                System.out.println("perşembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("cumartesi");break;
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("aaaaa hatalı giriş");






        }



    }
}
