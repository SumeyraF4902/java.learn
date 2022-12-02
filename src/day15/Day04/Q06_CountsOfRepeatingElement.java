package day15.Day04;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    public static void main(String[] args) {
        /*
        girilen  bir sayının bir dizide kac kere tekrarlandıgını bulun

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = sc.nextInt();
        int arr[] = {1, 1, 1, 22, 2, 3, 23, 85, 77, 23, 22, 77, 66, 77, 23};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sayi == arr[i]) {
                count++;
            }
        }  System.out.println("aranılan sayı "+ sayi+ " \n tekrar sayısı: "+count);

        }
    }
