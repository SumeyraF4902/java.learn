package Team07_OkulYonetimi.calısma;

import java.util.Scanner;

public class Switch_Dort_Islem {
    public static void main(String[] args) {
            // HESAP MAKİNESİ PROGRAMI
        Scanner sc=new Scanner(System.in);
        int sayi1,sayi2;
        String secenekler="Toplama islemi icin 1\n"
                +"Cıkarma islemi icin 2\n"
                +"Carpma islemi icin 3\n"
                +"Bolme islemi icin 4' ebasınız";
        System.out.println(secenekler);
        System.out.println("Lütfen secim yapınız");
        int secim=sc.nextInt();
        switch(secim){ // switch icerisine kontrol edecegimiz degeri yazarız
            case 1:    //switch icindeki deger ile case degeri eşlesiyormu ona bakarız case ile eslesen yerde case blogu calışır
                System.out.println("Birinci sayiyi giriniz");
                sayi1=sc.nextInt();
                System.out.println("Ikınci sayiyi giriniz");
                sayi2=sc.nextInt();
                System.out.println("Sayılarınızın toplamı = "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Birinci sayiyi giriniz");
                sayi1=sc.nextInt();
                System.out.println("Ikınci sayiyi giriniz");
                sayi2=sc.nextInt();
                System.out.println("Sayılarınızın cıkarıldıgında = "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Birinci sayiyi giriniz");
                sayi1=sc.nextInt();
                System.out.println("Ikınci sayiyi giriniz");
                sayi2=sc.nextInt();
                System.out.println("Sayılarınızın carpımıı = "+(sayi1*sayi2));
                break;
            case 4: System.out.println("Birinci sayiyi giriniz");
                sayi1=sc.nextInt();
                System.out.println("Ikınci sayiyi giriniz");
                sayi2=sc.nextInt();
                if(sayi1==0 || sayi2==0){
                    System.out.println("sıfır sayısını giremezsiniz");break;
                } else
                    if(sayi1> sayi2) {
                        System.out.println("Sayılarınızın bölümü= " + (sayi1 / sayi2)); break;
                    } else {
                        System.out.println("Sayılarınızın bölümü= " + (sayi2 / sayi1));
                break;}
            default:
                System.out.println("gecersiz sayı girdiniz");
        }
    }

}
