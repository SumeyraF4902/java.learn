package j09_SwitchStatement_TEST.testswitch;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        // Scanner scan = new Scanner(System.in);
        //    System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
        //           "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        //   int kacıncıGun = scan.next//pazarı 0 olarak alırız. 7 bölümden kalan 0 olduğu için.
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi 1\nSalı 2\nÇarşamba 3\nPerşembe 4\nCuma 5\nCumartesi 6 \nPazar  7\n Haftanın kaçıncı gününde olduğunuzu giriniz");
        int gun = scan.nextInt();
        int songun = (100+gun) % 7;//kaçgün sonrasını istiyorsun diye soru sorabilirsin.100 yerine onu yazdırırsın.
        switch (songun) {
            case 1:
                System.out.println("Pazartesi ");
                break;
            case 2:
                System.out.println("Salı ");
                break;
            case 3:
                System.out.println("Çarşamba ");
                break;
            case 4:
                System.out.println("Perşembe ");
                break;
            case 5:
                System.out.println("Cuma ");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 0:
                System.out.println("pazar");
                break;
            default:
                System.out.println("lütfen tekrar deneyiniz");


        }
    }

}