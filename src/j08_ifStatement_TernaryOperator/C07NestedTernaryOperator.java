package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07NestedTernaryOperator {
    public static void main(String[] args) {
        /*
TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 *///TERNARY ŞART ? TRUE AKSİYON : FALSE AKSİYON

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a=scan.nextInt();
        System.out.println((a>999&&a<10000) ?"4 Basamaklı": a%2==0?"4 basamaklı olmayan çift sayı":"4 basamaklı olmayan tek sayı");
    }
}
