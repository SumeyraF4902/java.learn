package day15.Day04;

import java.util.ArrayList;
import java.util.Arrays;

public class Q13_DuplicateValue {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.
        bir dizideki tekrarlayan karakterleri girin
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */
        String str="Javaisalsoeasy";
        char [] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));// her karakteri arraye donusturdu [J, a, v, a, i, s, a, l, s, o, e, a, s, y]
        ArrayList<Character> list=new ArrayList<Character>();
        for (int i=0; i<arr.length; i++){// arraydaki herbir elemana bakar
            for(int j=i+1; j<arr.length; j++){// her bir elemana bakarken bir sonraki ile karsılastırır
                if( arr[i]==arr[j]&& !list.contains(arr[j])){// ayni elemandan varsa ve istedigin listte yoksa
                    System.out.println( arr[j]);// o elemanı yazdır
                    list.add(arr[j]);// liste ekle
                }
            }
        }
        System.out.println( list);
    }
}
