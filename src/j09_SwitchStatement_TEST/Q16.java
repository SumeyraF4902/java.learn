package j09_SwitchStatement_TEST;

import java.util.Scanner;

public class Q16 {
/* TASK :BİTTTİİİ
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir numara giriniz");
        int n = sc.nextInt();
        System.out.println("bir numara giriniz");
        int n1 =sc.nextInt();
        System.out.println("bir numara giriniz");
        int n2 = sc.nextInt();
        if (n<n1){
            if (n1>n2)
            System.out.println(n1+"en büyüktür");
        }
        if(n<n2){
            System.out.println(n2+"en büyüktür");}
        else System.out.println(n+"en büyüktür");


    }
}

