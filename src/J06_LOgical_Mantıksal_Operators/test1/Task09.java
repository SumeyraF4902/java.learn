package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("çiftlikte kaç tane inek var" );
        int i= sc.nextInt();
        System.out.println("çiftlikte kaç tane koyun var" );
        int k= sc.nextInt();
        System.out.println("çiftlikte kaç tane tavuk var" );
        int t= sc.nextInt();
        System.out.println("Hayvanların toplam ayak sayısı="+((i+k)*4+t*2));




    }

}
