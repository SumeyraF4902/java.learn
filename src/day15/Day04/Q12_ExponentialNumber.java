package day15.Day04;

import java.util.Scanner;

public class Q12_ExponentialNumber {
    public static void main(String[] args) {
        //Get 2 numbers from the user.
        //first number base
        //second number Top
        //Write a code that calculates the prime of a number.
        // 2, 3 --> 2^3 = 2*2*2= 8

        // 4, 3 --> 4^3= 4*4*4 = 64
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen taban numarasını giriniz");
        int tabanNo=sc.nextInt();
        System.out.println("lutfen us numarasını giriniz");
        int us= sc.nextInt();
       // System.out.println(Math.pow(tabanNo,us));// 1 yol
        // 2 yol while ile
        int sonuc=1;

        while(us>0){
          sonuc*=tabanNo;
          us--;
       }
        System.out.println("while sonucu="+sonuc);
        // 3. yol
       /* for(int i=0; i<us; i++){
            sonuc*=tabanNo;
        }
        System.out.println("for ile-->"+sonuc);*/
    }
}
