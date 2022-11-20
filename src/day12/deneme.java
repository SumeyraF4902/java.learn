package day12;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
         /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
        5 basamakli : 54748 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        String strsayi= scan.next();
        armstrongMethodi(strsayi);

    }
    private static void armstrongMethodi(String strsayi) {
        String [] basamak=strsayi.split("");
        int toplam=0;

        }


    }

