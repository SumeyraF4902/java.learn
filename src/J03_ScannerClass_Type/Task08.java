package J03_ScannerClass_Type;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("İlk vize notunuzu giriniz");
        int a=sc.nextInt();
        System.out.println("İkinci vize notunuzu giriniz");
        int b=sc.nextInt();
        System.out.println("Final notunuzu giriniz");
        int c=sc.nextInt();
        double ort=((a+b)/2)*0.30+c*0.70;
        System.out.println("Geçme notunuz   : "+ ort);

    }
}
