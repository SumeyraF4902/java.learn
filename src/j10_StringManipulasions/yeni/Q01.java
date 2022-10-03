package j10_StringManipulasions.yeni;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
String kelime= scan.nextLine().toLowerCase();
        System.out.println(kelime.contains(" "));
    }
}

