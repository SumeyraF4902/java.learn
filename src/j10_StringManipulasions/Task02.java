package j10_StringManipulasions;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String kelime=scan.nextLine();
        if (
                (kelime.charAt(0) >='A' && kelime.charAt(0) <= 'Z')&&//a şartı
                        (kelime.charAt(kelime.length()-1)>='0'&&kelime.charAt(kelime.length()-1)<='9')&&//b şartı
                        (kelime.length()>=6))// c şartı
        { System.out.println("kelime geçerli");

        }else
            System.out.println("kelime geçersiz");






    }
}
