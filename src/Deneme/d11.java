package Deneme;

import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {

        /*not hesaplayici
        A => 90 ~100
        B => 80 ~ 89
        C => 70 ~ 79
        D => 60 ~ 69
        F =>  0 ~ 59
        sartlari aralik belirterek yaziniz
        write a program that:
        1. 0 ~12 ==> good morning
        2. 12 ~ 15 ==> good afternoon
        3. 15 ~ 23 ==> good night
        4. 12 ==> good noon*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Notunuzu giriniz:");
        int n = sc.nextInt();
        if (n == 100 && n >= 90) {
            System.out.println("A");
        }  else if (n>=80 && n<89) {
            System.out.println("B");
        }  else if (n>=70 && n<79) {
            System.out.println("C");
        } else if (n>=60 && n<69) {
            System.out.println("D");
        } else if (n>0 && n<=59) {
            System.out.println("F");////tamamdır

        }


    }

}




