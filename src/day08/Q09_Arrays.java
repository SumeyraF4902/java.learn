package day08;

import java.util.Arrays;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int arr[][]={{1,3,6},{2,8},{5,7,9,14}};
        int toplam=0;
        System.out.println(Arrays.deepToString(arr));
        for (int  kat=0; kat<arr.length; kat++){
            for (int daire=0; daire < arr[kat].length; daire++){
                if(arr[kat][daire]%2==0){

                    toplam+=arr[kat][daire];
                }

        }
}System.out.println(" arr deki tüm çift  elemanların toplamı  : "+toplam);
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30

        int multiArr [][] = {{1,3,6},{2,8},{5,7,9,14}};
        System.out.println("multidimensional arrayin cift elemanlari toplami = " + ciftElToplam(multiArr));
    }
    public static int ciftElToplam(int arr [][]) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                if(arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }*/

}}
