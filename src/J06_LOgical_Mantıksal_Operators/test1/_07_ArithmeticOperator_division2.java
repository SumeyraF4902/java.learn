package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner sc=new Scanner(System.in);
        System.out.println("2 tane sayı giriniz");
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        int sonuc=i1/i2;
        System.out.println("SOnuç  ="+ sonuc);




    }
}
