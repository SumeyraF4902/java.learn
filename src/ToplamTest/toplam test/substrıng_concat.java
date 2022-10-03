import java.util.Scanner;

public class substrıng_concat {
    public static void main(String[] args) {
        //BİTTTTİİİİİİ
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String kelime= sc.nextLine();
        System.out.println("bir kelime giriniz:");
        String kelime1= sc.nextLine();
        System.out.println(kelime.substring(1).concat(kelime1.substring(1)));


    }
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


}
