package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
        /*
        Girilen ifadenin polindrome olmasını kontrol eden method create ediniz
        polindrome: her iki yönde okunduğunda eşit olan ifadeler ör/ ey edip adanada pide ye. gibi
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str=sc.nextLine();
        polindrome(str);//string parametreli method call



    }//main dışı

    private static void polindrome(String str) {
        String tersStr="";//boş bir string kutu
        for(int i=str.length()-1; i>=0; i--){//length -1 son karakterden başla demektir
            tersStr+=str.charAt(i);//str nin i.ci karakterini tersstr ye ekler(concat)
        }
        System.out.println("girilen ifadenin tersi:"+ tersStr);
        if (str.equalsIgnoreCase(tersStr)){//str ile tersStr eşitlik kontrolu
            System.out.println("girilen ifade POLİNDRONE");
        }else System.out.println("girilen ifade POLİNDRONE DEĞİL");
    }


}
