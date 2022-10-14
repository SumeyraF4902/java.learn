package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
         /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
        // arraydaki her bir elemanı index değeri kadar arttıralım



        int arr[]={1,2,3};
        int last= arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];

        }

        arr[arr.length-1]= last;

        System.out.println(Arrays.toString(arr));

    }

}
