package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz ");
        int num=sc.nextInt();
int a=num%10, b=(num/10)%10,c=num/100;
        System.out.println("Girdiginiz sayinin birler basamagi : "+a+"\nGirdiginiz sayinin onlar basamagi :"+b+"\nGirdiginiz sayinin yuzler basamagi : "+c);

    }
}
