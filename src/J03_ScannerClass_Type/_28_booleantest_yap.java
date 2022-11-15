package J03_ScannerClass_Type;

import java.util.Scanner;

public class _28_booleantest_yap {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
Scanner sc=new Scanner(System.in);
        System.out.println("Bir banka hesabınız varmı E/H");
        char cevap=sc.next().toUpperCase().charAt(0);
         boolean varmı=true;
         if (cevap=='E'){
             varmı=true;
         }else varmı=false;
        System.out.println(varmı);







    }
}
