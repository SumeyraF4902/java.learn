package day08;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
        /*
  Kullanicidan aldigimiz 8 elemanli arrayin icinde
  kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
 */
        int arr[]=new int[8];
                    Scanner sc=new Scanner(System.in);
        int count=0;//3 e bölünebilen eleman sayısı
        for (int i=0; i< arr.length; i++){
            System.out.println(i+" . indexteki elemanı giriniz: ");
            arr[i]=sc.nextInt();
            if(arr[i]%3 ==0 && arr[i]!=0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count = " + count);

    }




    }

