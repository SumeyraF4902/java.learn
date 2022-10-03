package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    kullanıcının ismini print eden code create ediniz */

        Scanner sc=new Scanner(System.in);
        System.out.println("isminizi giriniz");
    String isim=sc.nextLine();
        System.out.println("isminiz:"+isim);

    }
}
