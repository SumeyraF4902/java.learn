package day15.Day04;

import java.util.Scanner;

public class Q09_AtbashCode {
    public static void main(String[] args) {
         /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */ Scanner sc = new Scanner(System.in);
        System.out.println("sifrelenecek ifadeyi giriniz");
        String ifade=sc.nextLine().toLowerCase();
        for (int i=0;i<ifade.length();i++) {
            int index='z'-ifade.charAt(i);// tersten bakacagı icin sondan cikardik,bir nevi kayma miktarini bulduk
            System.out.println((char) (('a')+index));
        }
        System.out.println();
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";
        System.out.println("sifrelenecek ifadeyi giriniz :");
        String str3 =sc.nextLine().toLowerCase();
        for (int i = 0; i < str3.length(); i++) { //str3 icin index->i
            for (int j = 0; j<26; j++){ //str1 ve str2 icin index -> j
                if (str3.charAt(i)==str1.charAt(j)){
                    //kullanicidan aldigim str3 deki herhangi bir karakter str1 deki bir karaktere esit ise
                    System.out.print(str2.charAt(j)); //ayni indexte str2 deki karsiligini yazdir
                }
            }
        }
    }
}
