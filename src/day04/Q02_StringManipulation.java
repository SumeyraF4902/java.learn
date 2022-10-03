package day04;

import java.util.Scanner;

public class Q02_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayrı değer giriniz ve bu iki kelimeyi methhod kullanarak birleştiriniz.
        //yukarıdaki örnekte verilen ilk ve ikinci değişkenlerinin ilk harflerini atıp birleştiriniz.
        Scanner sc=new Scanner(System.in);
        System.out.println(" lütfen bir kelime giriniz:");
        String kelime1= sc.nextLine();
        System.out.println(" lütfen bir kelime giriniz:");
        String kelime2= sc.nextLine();
        String birleşim=kelime1.substring(1).concat(" "+kelime2.substring(1));
        System.out.println("birleşim = " + birleşim);
    }
}
