package j10_StringManipulasions.yeni;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
Scanner sc=new Scanner(System.in);
        System.out.println("bir isim yazar mısınız lütfen üç harfli olsun");
        String isim= sc.nextLine().toLowerCase();
        System.out.println(isim.length()>3? "üç harli bir kelime giriniz":(isim.charAt(0) ==isim.charAt(1)&&isim.charAt(0)==isim.charAt(2))?"harfler aynı":"harfler farklı");

    }
}