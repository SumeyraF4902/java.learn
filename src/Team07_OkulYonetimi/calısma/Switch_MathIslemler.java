package Team07_OkulYonetimi.calısma;

import java.util.Scanner;

public class Switch_MathIslemler {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// break atmazsak tüm ilşemleri  sırayla yapar
        int sayi1, sayi2;
        String secenekler="Sayının karekökünü hesaplamak  icin 1\n"
                +"Sayının üssünü hesaplamak icin 2\n"
                +"Sayının karesini almak icin  3\n";

        System.out.println(secenekler);
        System.out.println("Lütfen secim yapınız");
        int secim=sc.nextInt();
        switch (secim) {
            case 1:
                System.out.println( "Karekökünü almak istediğiniz sayıyı giriniz");
                sayi1=sc.nextInt();
                System.out.println("sayınızın karekökü  :" +Math.sqrt(sayi1));break;
            case 2:
                System.out.println("Ussunu almak isteğiniz sayıyı giriniz");
                sayi1=sc.nextInt();
                System.out.println("Sayı ussunu giriniz");
                sayi2=sc.nextInt();
                System.out.println("isleminizin sonucu= "+Math.pow(sayi1,sayi2));break;
                case 3:
                    System.out.println("Karesini almak isteğiniz sayıyı giriniz");
                    sayi1=sc.nextInt();
                    System.out.println("isleminizin sonucu= "+( sayi1*sayi1));

        }
    }
}
