package day07;

import java.util.Scanner;

public class Q07_DoWhile {
    public static void main(String[] args) {
        /*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */
        Scanner sc= new Scanner(System.in);
        char c;
        do{
            System.out.print("harf giriniz :");
            c=sc.next().toLowerCase().charAt(0);
            System.out.println("Program calisiyor");
        }while (c!='x');//x eşit olmadığı sürece üsttekidöngü devam eden
        System.out.println("Program bitti");



    }
}
