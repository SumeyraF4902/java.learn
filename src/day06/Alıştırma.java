package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Alıştırma {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("kaç eleman girmek istiyorsunuz");
        int arr[]= new int[sc.nextInt()];

int toplam=0;
        for( int i=0; i<arr.length;i++){
            System.out.print(i+". sayıyı giriniz:  ");
            arr[i]=sc.nextInt();
            toplam+=arr[i];

        }
        int arrOrtalama=toplam/arr.length;
        int ortalamayıGecensayı=0;
        System.out.println(Arrays.toString(arr));
        System.out.println(toplam);
       for (int i=0;i<arr.length; i++){
           if (arr[i]>arrOrtalama){
               ortalamayıGecensayı++;
           }
       }
        System.out.println("ortalamayı geçen sayı: "+ ortalamayıGecensayı);

    }
}
