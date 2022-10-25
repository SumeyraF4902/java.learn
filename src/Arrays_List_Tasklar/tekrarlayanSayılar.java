package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Arrays;

public class tekrarlayanSayılar {
    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int []arr={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> yenilist = new ArrayList<Integer>();
        for(int i=0; i< arr.length;i++){

            if(!yenilist.contains(arr[i])){
                yenilist.add(arr[i]);
                }
            }System.out.println(yenilist);
        }

    }


