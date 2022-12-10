package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int adet=1;
        int maxnum=0;
        while (adet<=5){
            System.out.println("sayı giriniz");
            int num=sc.nextInt();
            adet++;
            maxnum=Math.max(maxnum,num);
        }
        System.out.println(maxnum);

    }

}
