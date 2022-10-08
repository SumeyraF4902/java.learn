package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Interview Question

        //// Girilen  100’den kucuk bir tamsayi için
        // 1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
        //  -girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        //        plindrome:her iki yönde okundugunda eşit olan ifadeler Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //       - Sayi 5’in kati ise sayi yerine “CAN'dır” yazdirin.
        //      - Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz


        System.out.println("bir ifade giriniz");
        String str = scan.nextLine();
        String tersstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersstr += str.charAt(i);
        }
        System.out.println(tersstr);
        if (str.equalsIgnoreCase(tersstr))
        {
            System.out.println("kelime polidrone bir kelime");
        } else System.out.println("polindrome değil");


    }
}





