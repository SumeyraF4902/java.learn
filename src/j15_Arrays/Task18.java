package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task--> sayı arr deki iç arr'lein toplamını yeni bir arr'ya atayıp print eden code create ediniz
        int arr[][] = {{1, 2, 3,}, {19, -8}, {24, 10, -41}};
        //input  int sayi[][] = {{1, 2, 3,}, {19, -8}, {24, 10, -41}};
        // output  int yeniArr[] = {6,11,-7};
        int yeniArr[] =new int [arr.length];
        System.out.println(yeniArr.length);
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr[i].length; j++) {
                max += arr[i][j];
                yeniArr[i]=max;
            }

        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
