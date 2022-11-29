package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task--> girilen sayıların içinde ortalamadan büyük olanları print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println( "kaç tane sayı girmek istiyorsunuz" );
        int boyut= sc.nextInt();
        int arr[]=new int[boyut];
        int toplam=0;
        for (int i = 0; i <boyut; i++) {
            System.out.println(i+1+"sayıyı giriniz");
            arr[i]=sc.nextInt();
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(toplam);
        int ortalama=toplam/boyut;
        System.out.println(ortalama);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ortalama){
                System.out.println(arr[i]+" ");

        }

        }
        }
    }

