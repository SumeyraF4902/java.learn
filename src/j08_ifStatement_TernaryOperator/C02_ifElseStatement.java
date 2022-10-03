package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        //girilen yaşın 18 den büyüklüğünü kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı giriniz :");
        int yas = scan.nextInt();
        if (yas <= 18) {
            System.out.println("ehliyet alamazsınız.");

        }else System.out.println("ehliyet alabilirsiniz");


    }
}
