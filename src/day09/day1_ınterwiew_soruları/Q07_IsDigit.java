package day09.day1_ınterwiew_soruları;

import java.sql.Array;
import java.util.Arrays;

public class Q07_IsDigit {
    public static void main(String[] args) {
        /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
        String str = "J4\\/4 1$ 34$¥";
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine();
        sumOfDigits(str);*/
sumofDigits(str);
    }   public static void sumofDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
       if (Character.isDigit(str.charAt(i))){
           sum+=Integer.valueOf(""+str.charAt(i));
       }

            }
        System.out.println("Sum of digits:"+sum);
    }
}
