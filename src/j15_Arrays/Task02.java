package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Task--< girilen int array   elemanları toplamını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz:");
      //  int arrBoyut= scan.nextInt();

        int arr[]= new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++){
            System.out.print(i + ". index elemanı giriniz: ");
            arr[i]= scan.nextInt();
        }
        System.out.println("agam istediğin array:  "+ Arrays.toString(arr));
        int arrToplam=0;
        for (int i =0; i<arr.length;i++){
            arrToplam+=arr[i];
        }
        System.out.println("array eleman toplamları:"+arrToplam);
        // 2 yol
        for (int a:arr){
            arrToplam+=a;
        }

        System.out.println(" for each ile " +arrToplam);
    }/*
      Scanner sc=new Scanner(System.in);
        System.out.println("Kaç elemanlı arr istiyorsun");
        int boyut=sc.nextInt();
        int arr[]=new int[boyut];
        int toplam=0;
        for (int i=0;i<boyut;i++) {
            System.out.println(i+1+ "  sayıyı giriniz");
            arr[i]=sc.nextInt();
            toplam+=arr[i];
        }
        System.out.println(toplam);*/
}
