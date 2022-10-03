package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
//task girilen bir tam sayı çiftse yarısını değilse
        //" girilen sayı tek olduğu için yarısı tam sayı değildir" print eden code create yazdır

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a=scan.nextInt();
        String sonuc=a%2==0 ? "a/2" :"girilen sayı tek olduğu için yarısı tam sayı değildir";
        ///TRİCK---TERNARY İKİDUURUM (T/F) İÇİN FARKLI DATA TYPE ÇIKTISI VERİYORSA VARİEBLE ATAMA YAPMADAN SOUT YAPILARAK
        //YADA TERNARY ÇIKTISI AYNI DATA TYPE SERİALİZABLE EDİLMELİ.
        System.out.println(a%2==0 ? a/2 :"girilen sayı tek olduğu için yarısı tam sayı değildir");

    }
}
