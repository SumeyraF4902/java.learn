package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /* kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim gün sayısı 6000 den fazla ise emekliliğini,
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
      kontrol edip kalan yıl ve prim gununu print eden code create ediniz*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi: \n kadın ise:  K olarak giriniz. \n erkek ise: E olarak giririniz .");
        char ch = scan.next().charAt(0);
        System.out.println("lütfen yaşınızı giriniz.");
        int yas = scan.nextInt();
        if (ch == 'K' || ch == 'k') {
            if (yas > 60) {
                System.out.println("Lütfen prim gün sayınızı giriniz:");
                int primgun = scan.nextInt();
                if (primgun > 6000) {
                    System.out.println("Gözünüz aydın artık emeklisiniz.");
                } else
                    System.out.println("Emekli olabilmeniz için" + (6000 - primgun) + " primgün sayısına ihtiyacınız var.");
            } else System.out.println("Emekli olabilmeniz için " + (60 - yas) + "yıla ihtiyacınız var.");
        } else if (ch == 'e' || ch == 'E') {
            if (yas > 65) {
                System.out.println("Lütfen prim gün sayınızı giriniz:");
                int primgun = scan.nextInt();
                if (primgun > 7000) {
                    System.out.println("Gözünüz aydın artık emeklisiniz.");
                } else
                    System.out.println("Emekli olabilmeniz için" + (7000 - primgun) + " primgün sayısına ihtiyacınız var.");
            } else System.out.println("Emekli olabilmeniz için " + (65 - yas) + "yıla ihtiyacınız var.");

        }else System.out.println("lütfen cinsiyetinizi kontrol ediniz.");



    }
}
