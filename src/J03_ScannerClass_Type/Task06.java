package J03_ScannerClass_Type;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        float knr1=12f;
        float knr2=5f;
        float hıpo=(knr1*knr1)+(knr2*knr2);
        double a = (Math.sqrt(hıpo));
        System.out.println("hipotenüs  :" +a);

    }
}
