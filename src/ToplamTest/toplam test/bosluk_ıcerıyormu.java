import java.util.Scanner;

public class bosluk_ıcerıyormu {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
Scanner sc=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s=sc.nextLine().toLowerCase();
        System.out.println(s.contains(" "));

    }
}

