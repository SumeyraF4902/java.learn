package day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {

// Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("");
        String str=sc.nextLine();
        System.out.println(""+ str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0));




    }
}
