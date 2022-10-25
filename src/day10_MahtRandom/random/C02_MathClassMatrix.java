package day10_MahtRandom.random;

import java.util.Random;
import java.util.Scanner;

public class C02_MathClassMatrix {
    public static void main(String[] args) {
        /*
Ask user to enter a number and print on console number by number matrix.

Example:
Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/
            Scanner sc=new Scanner(System.in);
        System.out.println("matrix oluşturmak için istediğiniz boyut için  sayıyı giriniz:");
        int boyut=sc.nextInt();// math yöntemiyle
        for (int i=0; i<boyut;i++) {//outer for - satir
            for (int j=0;j<boyut; j++) {// inner for-sutun
                System.out.print((int) (Math.random()*2)+" ");// 1 ve 0 kullansın diye 2 yazdık ilk iki sayı.

            }
            System.out.println();

        }

// 2 yol Random objesiyle işlem yapma
        System.out.println("random objesiyle işlem yapma");
        Random random;
        for (int i=0; i<boyut;i++) {//outer for - satir
            for (int j=0;j<boyut; j++) {// inner for-sutun
                System.out.print(new Random().nextInt(2)+" ");
    }
            System.out.println();

}

    }}
