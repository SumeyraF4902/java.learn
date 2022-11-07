package day09.day1_ınterwiew_soruları;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int number = sc.nextInt();
        boolean flag=true;
        if(number>=2){
        for (int i=2; i<number;i++) {// sayının 2 den başlaması gerekiyor yoksa döngü çalışmaz
            if (number%i==0) {
                flag=false;break;
            }
        }
        if (flag==true) {
                System.out.println("sayı asal sayıdır");
            } else {
            System.out.println("sayı asal sayı değildir");

        }
        }else System.out.println("sayı asal değildir");//0 ve 1  ve negatif sayılar için çalışan kod satırı
    }

    }
