package day15.Day04;

import java.util.Scanner;

public class Q02_PrintEvenNumber {
    public static void main(String[] args) {
/*
bir tam sayı bagımsız değişkenini kabul eden iseven adlı yontem yazin
arguman cift ise yontem true donsun, aksi halde false donsun
 */
        Scanner sc=new Scanner(System.in);
        System.out.println( "sayı giriniz");
        int sayi= sc.nextInt();
        System.out.println(isEvenn(sayi));
    }

    private static boolean isEvenn(int sayi) {
        boolean  flag=false;
        if(sayi%2==0){
            flag=true;
        }else flag=false;
        return flag;
    }
    /* KISA YOL
    if(sayi%2==0) return true;
    else return false;
    */


}
