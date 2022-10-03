package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
       /* TAKS GİRİLEN İKİ SAYIYI SEÇİLEN DÖRT İŞLEMDEN BİRİNE UYGULAYIP SONUCU PRİNT EDEN KODE CREATE EDİNİZ

        */
        Scanner sc =new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        double sayi1=sc.nextDouble();
        System.out.println("ikinci sayıyı giriniz : ");
        double sayi2=sc.nextDouble();
        System.out.println("Lütfen dört işlemden birini seçiniz: +  için  1, - için 2 yi,  * sayı 3 ü , /için sayı 4 ü seçiniz. ");
        int islem=sc.nextInt();
        if (islem==1) {
            System.out.println(sayi1 + sayi2);
        } else if (islem==2) {
            System.out.println(sayi1 - sayi2);
        } else if (islem==3) {
            System.out.println(sayi1 * sayi2);
        }else System.out.println(sayi1/sayi2);





    }
        }
/*Scanner scan=new Scanner(System.in);
​
        System.out.println("1. sayıyı giriniz : ");
​
        double sayi1= scan.nextDouble();
        System.out.println("2. sayıyı giriniz : ");
​
        double sayi2= scan.nextDouble();
​
        System.out.println("işlem seçiniz : ");
        char islem=scan.next().charAt(0);
​
        if (islem=='+') System.out.println("Toplam = " + (sayi1+sayi2));
        else if (islem=='-') System.out.println("Çıkarma = " + (sayi1-sayi2));
        else  if (islem=='*') System.out.println("Çarpma = " +(sayi1*sayi2));
        else if (islem=='/') System.out.println("Bölme = "+ (sayi1/sayi2));
        else System.out.println("yanlış işlem girdiniz");
Collapse
*/




