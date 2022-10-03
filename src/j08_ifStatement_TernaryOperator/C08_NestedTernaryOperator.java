package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */



        Scanner scan=new Scanner(System.in);
        System.out.println("bir miktar giriniz:");
        int a=scan.nextInt();
        System.out.println("birim fiyatı giriniz");
        int b=scan.nextInt();

        System.out.println(a>100?" Ödemesi gereken toplam fiyat: "+((a*b)-(a*b*30/100)) :"ödemesi gereken toplam fiyat:" +(a*b));

    }
}
