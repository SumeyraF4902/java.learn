package j15_Arrays;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
         /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner sc=new Scanner(System.in);

        int arr[]= new int[8];
        int count=0;
        for (int i=0; i< arr.length; i++){
            System.out.println(i+ " . indexi giriniz");
            arr[i]=sc.nextInt();
            if (arr[i]%3==0){
                count++;
            }

        }
        System.out.println("girdiğiniz array daki 3 e bölünebilen eleman sayısı:  "+ count);


    }
}
