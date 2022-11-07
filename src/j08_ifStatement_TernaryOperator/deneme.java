package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hızınızı giriniz ");
       int hız= sc.nextInt();
       // System.out.println("ehliyetiniz var mı");
        //char c=sc.next().toUpperCase().charAt(0);
       // System.out.println("bir notunuzu giriniz ");
       // String s2=sc.nextLine();
        if (hız%2==0){
            System.out.println("number is a EVEN number");
        }else System.out.println("number is a ODD number");


   }

}