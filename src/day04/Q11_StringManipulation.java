package day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    public static void main(String[] args) {
// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=sc.nextLine();
        int bosluk=str.indexOf(" ");// boşluk olup olmadığını kontrol eder. boşluk yoksa -1 verir.
        if(bosluk==-1 && !str.isEmpty()) {//boşluk karakteri yoksa ve string ifadem boş değilse
//isEmpty stringin içinde hiçbirşey olmaması demek
            System.out.println("sartlara uygun");
        }else System.out.println("sartlara uygun değil");



    }
}
