package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class  _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */
Scanner sc=new Scanner(System.in);
        System.out.println("iki sayı giriniz:");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        System.out.println(sayi1+sayi2);



 toplama ();

    }

    private static void toplama() {
    }

    public static int toplama(int sayi1,int sayi2,int sayi3,int sayi4){
        return sayi1+sayi2+sayi3+sayi4;
    }
}
