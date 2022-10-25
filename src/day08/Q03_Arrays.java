package day08;

import java.util.Arrays;

public class Q03_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
//1 adım str tanımladık
            String str="HeySiri";
  //2 adım   HeySiri yi ByeSiri ye dönüştür.//
  str=str.replace("Hey","Bye");
        System.out.println("str = " + str);
        // 3 ADIM string array dönüştür.
        String arr[]=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));
        //String  arr [] = {"HeySiri"};
        //System.out.println(Arrays.toString(arr).replace("Hey", "Bye")); farklı bir yol
      //  System.out.println(arr.replaceAll("Hey", "Bye"));// farklı yol
                //a.replace("Bye",a.substring(0,3)); değişik bir yol
/// 2. yol
        String str1="HeySiri";
        String yenistr[]=str1.split("y");// y den böl
        yenistr[0]="Bye";
        str1=yenistr[0]+ yenistr[1];
        System.out.println("str1 = " + str1);
        String arr2[]=new String[1];
        arr2[0]=str1;
        System.out.println(Arrays.toString(arr2));
    }
}
