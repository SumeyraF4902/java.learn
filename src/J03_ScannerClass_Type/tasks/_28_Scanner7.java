package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner sc =new Scanner(System.in);
        System.out.println("banka  hesabınız var mı?\n" + "varsa E, yoksa H deyiniz  ");
        String cvp = sc.next().toUpperCase();
        if (cvp.charAt(0) == 'E') {
            System.out.println("True");


        } else System.out.println("Frue");
    }
}
