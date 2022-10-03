package Deneme;

import java.util.Scanner;

public class d13 {
    public static void main(String[] args) {


  /*
        Problem tanimi :
        Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz:");
        int y=sc.nextInt();
        System.out.println("Kilonuzu giriniz");
        int k=sc.nextInt();
        if(y<18){
            System.out.println("kan bağışı yapamazsınız.");
        } else if (y>18 && k<50) {
            System.out.println("buyuk bağışı yapamaz.");
        } else if (y>18 && k>50) {
            System.out.println("kan bağışı yapabilir");////TAMAMDIR

        }





    }
}


