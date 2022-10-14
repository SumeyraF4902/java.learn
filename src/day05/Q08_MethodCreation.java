package day05;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen bir yılın artık yıl olup olmadığını kontrol etmek ediniz için bir java Methodu yazınız
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Artık yıl olup olmadığını öğrenmek istediğiniz yılı giriniz:");
        int yıl= sc.nextInt();
        artıkYılmı(yıl);
    }

    private static void artıkYılmı(int yıl) {
        if (yıl%4==0 && yıl%100!=0 || yıl%400==0){
            System.out.println("Girdiğiniz yıl artık yıldır");
        }else System.out.println("Girdiğiniz yıl artık yıl değildir");
    }
}
