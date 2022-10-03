package J03_ScannerClass_Type;

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
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir günde kaç saat uyuyorsunuz  :");
        int saat= scan.nextInt();
        int ay=saat*30;
        int yıl=ay*12;
        int yıl1=yıl*40;
        System.out.println("Bir ayda : "+ay+"\nbir yılda :" +yıl+"\n40 yılda  :"+yıl1+"\n gününüz uykuda geçiyor.");
    }
}
