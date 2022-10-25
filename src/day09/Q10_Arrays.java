package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_Arrays {
    public static void main(String[] args) { /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
        */
        Scanner sc = new Scanner(System.in);
        List<String> letter = new ArrayList<>(List.of("H", "G", "E"));
        System.out.println("bir harf giriniz:");
        char ch = sc.next().charAt(0);
        if (letter.contains(Character.toString(ch).toUpperCase())) {
            letter.set(letter.indexOf((Character.toString(ch)).toUpperCase()), "Got it");

        } else letter.add(Character.toString(ch));
        System.out.println();

        System.out.println(letter);
        /*
        HOCANIN YÖNTEMİ*/
        List<String>list = new ArrayList<>();
        list.add("H");
        list.add("G");
        list.add("E");
        System.out.println("list:"+list);
        Scanner input = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String s = input.next().trim().substring(0,1).toUpperCase();

         if (list.contains(s)){
             list.set(list.indexOf(s),"Got it");
         }else
             list.add(s);
    }
}
