package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class task01 {
    public static void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */
        int arr[] = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        List<Integer> list = new ArrayList<>();
        int x[] = {};
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);

            }
        }
        System.out.println(list);//tekrarsız  liste tanımlamdı [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10] liste olarak listelendi
        int[] tekrarsızarr = new int[list.size()];//arraylisti tekrar arraya çeviriyoruz
        for (int i = 0; i < tekrarsızarr.length; i++) {
            tekrarsızarr[i] = list.get(i);
//2. for döngüsü olmadan list i arraye convert edebiliyorduk  tekrar for açmak yerine bunu yapabiliriz
            Integer[]arr2=list.toArray(new Integer[0]);
            System.out.println(Arrays.toString (arr2));
        }
        System.out.println(Arrays.toString(tekrarsızarr));//[1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10] array olarak listelendi

        // 2. YOL
        HashSet<Integer> liste = new HashSet<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10));
        System.out.println(liste);//[1, -2, 2, 3, 4, 5, 6, 7, 8, 9, 10] karışık yazdı ve daha hızlı
    }
}
