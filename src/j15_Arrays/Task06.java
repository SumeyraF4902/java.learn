package j15_Arrays;

import java.util.Arrays;



public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(buyukkucuk(arr)));

    }


    private static int [] buyukkucuk(int []arr) {
        int result[]= new int[arr.length];

        for (int i=0; i<arr.length; i++) {
                result[i] = arr[arr.length-i-1];
            }
            return result;

        }
    }

