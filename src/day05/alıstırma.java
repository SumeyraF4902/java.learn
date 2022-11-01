package day05;

import java.util.Scanner;


public class alıstırma {
    static  Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
         /*
     Kullanıcıdan isim ve soyismini alın.
     */
            enbuyuk();




    }
    public static void enbuyuk(){
        System.out.println("üc sayı girin");
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        if(b>c){
            if(b>d){
                System.out.println("en büyük sayı" + b);
            }else System.out.println("en büyük sayı" + d);
        }else if (c>d){
            System.out.println("en büyük sayı" + c);
        }else System.out.println("en büyük sayı"+ d);
    }
}


