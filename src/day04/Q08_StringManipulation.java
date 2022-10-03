package day04;

import java.util.Scanner;

public class Q08_StringManipulation {
    public static void main(String[] args) {
  /*
name1 ve name2 degiskenlerini olusturun.
name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
*/
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine().toLowerCase();
        String name1=sc.nextLine().toLowerCase();
        System.out.println("bir isim giriniz");
        System.out.println("bir isim giriniz");

        if(name.length()%2==0){
            System.out.println(name.substring(0,name.length()/2).concat(name1).concat(name.substring(name.length()/2)));
        }else System.out.println("name çift sayı olmadığı için birleştirme yapamadık");






    }
}
