package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = sc.nextInt();
        System.out.println("bir sayı giriniz");
        int sayı1 = sc.nextInt();
        if (sayı < sayı1) {
            for (int i = sayı; i < sayı1; i++) {
                System.out.println(i + " ");
            }
            int b=sayı;
            while(b<sayı1){
                System.out.print(b+" ");
                b++;
            }


        }
    }
}