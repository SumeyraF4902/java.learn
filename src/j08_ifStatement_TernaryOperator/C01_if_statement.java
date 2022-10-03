package j08_ifStatement_TernaryOperator;

public class C01_if_statement {
    public static void main(String[] args) {
        int krmYas = 33;
        int ismlYas = 40;
        if (krmYas == ismlYas) {
            System.out.println("aynı yaştasınız");
            System.out.println("yoksa siz ikiz misiniz?");
            if (krmYas >= 40) ;
            {
                System.out.println("olgunluk yaşındasınız");
                System.out.println("bu yazıyı okuduysanız 12. satırdaki ifle alakası yok");
            }
            if (krmYas + ismlYas > 100) {
                System.out.println("keram bey ve ismail bey yaşlatı toplamı 100 den büyük");

            }
            // bunların hiç biri çalışmaz çünkü hiçbir şart tutmuyor.
        }
        System.out.println("selam javacanlar");

    }
}
