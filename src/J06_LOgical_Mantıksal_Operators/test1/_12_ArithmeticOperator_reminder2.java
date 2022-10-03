package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

Scanner sc=new Scanner(System.in);
        System.out.println("bir tane sayı giriniz:");
        int num1= sc.nextInt();
        System.out.println("bir tane sayı giriniz:");
        int num2= sc.nextInt();
        System.out.println("sonuç="+(num1%num2));




    }
}
