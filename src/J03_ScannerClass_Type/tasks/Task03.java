package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("günde kaç saat uyuyorsunuz:");
        int saat=sc.nextInt();
        System.out.print("Ayda :"+saat*30+ " "+"yılda"+ " "+saat*365 +" "+"40 yılda :"+saat*365*40+" "+"saat uyuyorsunuz");


    }
}
