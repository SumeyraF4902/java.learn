package J11_MethodCreation;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        //task girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        int  sayı1=sc.nextInt();
        System.out.print("2.sayıyı giriniz:");
        int  sayı2=sc.nextInt();
        System.out.print("işleminizi giriniz : ");
        char islem=sc.next().charAt(0);
        islemMenü(islem,(int)sayı1,(int)sayı2);







    }//main sonu
    public static void islemMenü(char ch, int x,int y){
        switch(ch){
            case '+':
                topla(x,y);
                break;
            case '-':
                cıkar(x,y);
                break;
            case '*':
                carp(x,y);
                break;
            case '/':
                böl(x,y);
                break;
            default:
                    System.out.println("hatalı seçim yaptınız");
        }

    }
    public static void topla(int a,int b) {
        System.out.println("a+b=" + (a + b));
    } public static void cıkar(int a,int b) {
        System.out.println("a-b=" + (a - b));
    } public static void carp(int a,int b) {
        System.out.println("a*b=" + (a * b));
    } public static void böl(int a,int b){
        System.out.println("a/b="+(a/b));




    }}