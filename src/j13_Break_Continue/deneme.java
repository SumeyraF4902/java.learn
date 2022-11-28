package j13_Break_Continue;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        String pin="sadalsşls@öaaafcdlfkşdlf";

int sayı=0;
         for (int i=0;i<pin.length();i++){
             if (pin.charAt(i)=='a' ){
                 sayı++;
             }else if (pin.charAt(i)=='c')
                     break;
         }
        System.out.println(sayı);
    }
}
