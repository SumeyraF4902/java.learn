package j36_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task13 {
    public static void main(String[] args) {


        // Task ->Verilen bir Stringdeki harfleri sayısını return  eden method create ediniz
        //  Input : Hellooo   output : H=1, e=1, l=2, o=3


        String input = "Hellooo";
        Map<String,Integer>maptenGelenMap=harfSayısınıBul(input);//[H, e, l, l, o, o, o]--{e=1, H=1, l=2, o=3}
        harfSayısınıBul(input);
    }

    private static Map<String,Integer> harfSayısınıBul(String str) {
        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        Map<String,Integer> map=new HashMap<>();
        for( String str1 : arr ){
            if(map.containsKey(str1)){
                map.put(str1,map.get(str1)+1);
            }else{
                map.put(str1,1);
            }
    }
        System.out.println(map);


return map;

    }
}