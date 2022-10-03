package day04;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        // girilen string içinde "xyz" dizimi var ise true değilse false return eden method giriniz,
        Scanner sc=new Scanner(System.in);
        System.out.println("bir string giriniz:");
String s= sc.next().toLowerCase();
boolean xyzIçeriyorMU=false;
if (s.contains("xyz")){
    xyzIçeriyorMU=true;
    System.out.println(xyzIçeriyorMU);
}else {xyzIçeriyorMU=false;
    System.out.println(xyzIçeriyorMU);

    }
}}

