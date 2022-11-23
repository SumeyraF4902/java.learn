package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class task03 {
    public static void main(String[] args) {
// Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

        hackerDili("java ile hersey guzel");//j4v4 1l3 h3r53y guz3l 1.yol
        hackerDili2("java ile hersey guzel");//2.yol
    }

    private static void hackerDili2(String str) {
        String [] arr= new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] =str.substring(i,i+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j =0;j<str.length();j++) {
            if(arr[j].contains("s")){ arr[j] = "5";}
            if(arr[j].contains("a")){ arr[j] = "4";}
            if(arr[j].contains("e")){ arr[j] = "3";}
            if(arr[j].contains("i")){ arr[j] = "1";}
            if(arr[j].contains("o")){ arr[j] = "0";}
            System.out.print(arr[j]);
        }
    }




    private static void hackerDili(String str) {
        System.out.println(str.replaceAll("s","5").replaceAll("a","4").replaceAll("e","3").replaceAll("i","1").replaceAll("o","0"));
    }
}