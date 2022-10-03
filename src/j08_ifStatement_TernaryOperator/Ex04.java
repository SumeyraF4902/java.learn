package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //girilen bir karakterin harf olup olmadığını kontrol eden code create ediniz.

        Scanner sc =new Scanner(System.in);

        System.out.print("bir karakter giriniz : ");

        char karakter=sc.nextLine().charAt(0);
        if ((karakter>='a' && karakter<='z')||(karakter>='A' && karakter<='Z')){
            System.out.println("girdiğiniz bir harftir.");

        }else System.out.println("girdiğiniz bir harf değildir. lütfen tekrar deneyiniz.");





}


    }

