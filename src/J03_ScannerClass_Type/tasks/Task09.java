package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s1=sc.nextInt();
        System.out.println("bir sayı giriniz");
        int s2=sc.nextInt();
        System.out.println("bir sayı giriniz");
        int s3=sc.nextInt();
        System.out.println(((s1*s1)-(s2*s2))+" "+"3. sayının 3 katı:"+((s3*s3*s3)));


    }
}
