package day07;

import java.util.Scanner;

public class Q10_Break {
    public static void main(String[] args) {
         /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
            Scanner sc=new Scanner(System.in);
        System.out.println("pozitif bir sayı giriniz");
        int sayı=sc.nextInt();
        boolean asalMı= true;
        for (int i=2; i<sayı; i++){
            if(sayı%i==0){
                asalMı=false;
                break;
            }
        }
        System.out.println(asalMı);
    }
}
