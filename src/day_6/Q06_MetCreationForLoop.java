package day_6;

import java.util.Scanner;

public class Q06_MetCreationForLoop {
    public static void main(String[] args) {
        /* Interview Question
 Write a Java program to reverse a string. Use for loop and create a method called
  reverseString tersini yaz */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str = sc.nextLine();
        reverseString(str);

        System.out.println(reverseString(str));
    }
    private static String reverseString(String str) {
        String tersiStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersiStr +=str.charAt(i);
        }
        return tersiStr;
    }

}
