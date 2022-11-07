package day11;

import java.util.ArrayList;

public class Q05_Varargs01 {
    // istediğimiz kadar sayi giridğimizde toplamları bize veren bir method yazalım
    public static void main(String[] args) {
          sumAll(5,9,-12,0,100,8);
    }private static void sumAll(int ...a) {
        int toplam=0;
        for(int w:a) {
            toplam += w;
        }
        System.out.println(toplam+"toplam");
    }


}
