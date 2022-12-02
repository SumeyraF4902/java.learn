package day15.Day04;

import java.util.Scanner;

public class Q03_CountFactors {
    public static void main(String[] args) {
        /*  while loop ile
        Kullanıcıdan alınan bir tam sayinin carpanlarini bulan program yazınız
        number :12   =  1,2,3,4,6,12= 6 tane
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
int sayi= scan.nextInt();
int carpan=1;
int count=0;
while(carpan<sayi){
    if (sayi%carpan==0){
        count++;
        System.out.print( carpan+" ");
    }
carpan++;
}
        System.out.println();
        System.out.println(count);

    }
}
