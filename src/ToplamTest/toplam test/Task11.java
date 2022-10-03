import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
Scanner sc=new Scanner(System.in);
        System.out.println("adınızı soyadınızı giriniz:");
        String adsoyad=sc.nextLine();
        System.out.println("adınız:"+adsoyad.substring(0,adsoyad.indexOf(" "))+"\nsoyad:"+adsoyad.substring(adsoyad.indexOf(" ")+1));
    }
}
