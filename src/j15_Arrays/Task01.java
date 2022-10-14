package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Kıllanıcıdan alınan değerlerle bir int array elamanlarını büyükten küçüğe print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsunuz:");
        int arrBoyut= scan.nextInt();
        int arr[]= new int[arrBoyut];
        for (int i = 0; i < arrBoyut; i++){
            System.out.print(i + ". index elemanı giriniz: ");
            arr[i]= scan.nextInt();
        }
        System.out.println("agam istediğin array:  "+Arrays.toString(arr));
        Arrays.sort(arr);// arr küçükten büyüğe sıralanır. sortingen yapıldı.
        for (int i = arr.length-1/* en büyük sondaki elemandan başlar*/;i>0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
