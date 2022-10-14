package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir karakter giriniz:");
        char a = sc.next().charAt(0);

        while (a == 'x') {

            System.out.println("JAVATAR");
            a++;
        }
        System.out.println("javacan");





    }
}
