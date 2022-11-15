package day12;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("array uzunluk :");
        int uzunluk = scanner.nextInt();
        int[] arr = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " + (i + 1) + ".elemani :");
            arr[i] = scanner.nextInt();

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("differance :" + (arr[uzunluk - 1] - arr[0]));
        }
    }}