package day08;

import java.util.Arrays;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
       /*
Count the frequency of the letters in a given String as the format below:
Input: String str = "Java is so Good";
Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
 */

String str = "Java is so Good";
String yeni="";
for (int i=0;i<str.length();i++) {
    int say=0;
    for (int j=0; j<str.length();j++) {
        if(str.charAt(j)==str.charAt(i)){
            say++;
        }
    }
    if(!yeni.contains(String.valueOf(str.charAt(i))) ){

        yeni+=""+str.charAt(i)+say+" ";}
}
        System.out.println(yeni);
    }


    }

