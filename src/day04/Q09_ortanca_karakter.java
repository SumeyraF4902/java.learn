package day04;

import java.util.Scanner;

public class Q09_ortanca_karakter {
    public static void main(String[] args) {
/*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */

        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str= sc.nextLine();
        char ortancaKrk=str.charAt((str.length()/2));//-ortanca karakteri buluruz
        if(str.length()%2!=0 &&str.length()>=3){
            System.out.println("ortanca karakter:"+ortancaKrk);





        }else System.out.println("çift olmadığı için ortası yoktur");




    }
}
