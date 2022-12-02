package day15.Day04;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    public static void main(String[] args) {
     /* do while ile
        Kullanıcıdan  bir tam sayı girmesini isteyin. tamsayı 100 den kücükse kullanıcıya "kazandı!" =won deyin aksi takdirde
        kullanıcıya "Kayıp!" =lost deyin.
      */
        Scanner sc=new Scanner(System.in);
       int sayi;
        do{
            System.out.println("bir sayı giriniz");
            sayi=sc.nextInt();
            if(sayi<100){
            System.out.println("Kazandı!");}

        }while(sayi<100);
        System.out.println("Kayıp!");
    }
}
