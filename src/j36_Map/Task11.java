package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task11 {  /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri saydırıp prnt eden code create ediniz .
    String Str = "Ali came to school and Ayse came to school"
    Ali=            1
    came=   2
    to=         2
    school= 2
    and=    1
    Ayse=   1
*/
    public static void main(String[] args) {
    String str="Ali came to school and Ayse came to school";
    Map<String,Integer> map= new HashMap<>();
    String [] str1=str.split("");
    for (int i=0; i<str1.length; i++) {
        if (map.containsKey(str1[i])){
            map.put(str1[i],map.get(str1[i])+1);
        }else{
            map.put(str1[i],1);

        }
    }
        System.out.println("map = " + map);

    }
}
