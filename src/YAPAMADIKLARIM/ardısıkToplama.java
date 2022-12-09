package YAPAMADIKLARIM;

import java.util.ArrayList;

public class ardısıkToplama {
    public static void main(String[] args) {
        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */
        int arr[]={3,5,1,2,7,9,2,3,5,7};
        ardısıkToplam(arr);

    }

    private static void ardısıkToplam(int arr[]) {
        ArrayList<Integer> toplam=new ArrayList<>();
        int  counter=1; int j; int sum=0;
        for(int i=0; i<arr.length;){
             sum=0;
            for ( j=i;j<i+counter  && j<arr.length;j++){
                sum+=arr[j];


            }toplam.add(sum);
                counter++;
            i=j;
        }
        System.out.println(toplam);
    }
}
