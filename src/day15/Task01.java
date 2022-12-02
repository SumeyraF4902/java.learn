package day15;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
 /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String str=sc.nextLine();
        int charSayısı=0;
        String arr[]=str.split("");
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++) {
            if (arr[i - 1].equals(arr[i])) {// birden fazla karakter icin
                charSayısı++;
            } else {// tek sayıda karakter icin
                System.out.print(arr[i - 1] + " =" + (charSayısı + 1+" "));
                charSayısı=0;
            }
            if (i == arr.length - 1) {// enson karakter benzersiz ise calışır
                System.out.println(arr[i] + "=" + (charSayısı + 1));
            }
        }
}}
