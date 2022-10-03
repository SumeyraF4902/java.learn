package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOparator {
    public static void main(String[] args) {
// TASK > girilen pozitif bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        Scanner SC=new Scanner(System.in);
        System.out.println("agam bir tamsayı giriniz:  ");
        int t=SC.nextInt();
        // system.out.println(agaSayisi > 9 ? " sayı iki veya daha fazla basamaklı " : " sayı tek basanaklı");

    String sonuc= t>9 ? "sayı iki veya daha fazla basamaklı":" sayı tek basamaklı";
        System.out.println(sonuc);





    }
}
