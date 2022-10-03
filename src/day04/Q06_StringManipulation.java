package day04;

import java.util.Locale;
import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        /*String girildiğinde ilk iki karekteri hariç String return eden java programı yazınız
        ancak ilk karakter 'g' ve ikinci karateri 'h' ise bu karakterler de return edilsin.(gh-g-h-:3 durum var)
        örnek
                      input              output
                       goat                gat
                        photo             hoto
                        ghost             ghost
                        kalem             lem



         */
        Scanner sc=new Scanner(System.in);
        System.out.println("kelime giriniz:");
        String str= sc.next().toLowerCase();
        if (str.startsWith("gh")){
                System.out.println(str);
        } else if (str.startsWith("g")) {
            System.out.println(str.charAt(0)+str.substring(2));
        } else if (str.charAt(1)=='h') {
            System.out.println(str.substring(1));
        }else System.out.println(str.substring(2));

        }
    }
