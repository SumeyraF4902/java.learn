package J03_ScannerClass_Type;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner scan=new Scanner(System.in);
        System.out.print("daha önce yaşağıgız şehir:");
        String sehir= scan.nextLine();
        System.out.println("Şehir:"+sehir);
    }
}
