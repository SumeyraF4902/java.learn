package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task04 {
    public static void main(String[] args) {
        /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */
        ArrayList<String> a=new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        String s1="blue";
        String s2="yellow";
        System.out.println("changeInArraylist() = " + changeInArraylist(a,s1,s2));
        //örnek 2 3 sıradan oluşuyor
        ArrayList<String> a1=new ArrayList<>(List.of("sarı" , "kırmızı" , "blue" , "kırmızı" , "blue"));//1
       Collections.replaceAll(a1,"kırmızı","sarı");//2
        System.out.println(a1);//3
    }

    private static ArrayList<String> changeInArraylist(ArrayList<String>a,String str, String str2) {

            Collections.replaceAll(a,str,str2);
            return  a;
        }

    }

