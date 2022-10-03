package j09_SwitchStatement_TEST;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/* BİTTTİİİ
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas = sc.nextInt();
        System.out.println("kilonuzu giriniz");
        int k = sc.nextInt();
        if (yas < 18) {
            System.out.println("kan bağışı yapamazsınız.");
        } else {
            if (k < 50) {
                System.out.println("kan bağışı yapamazsınız.");
            } else System.out.println("kan bağışı yapabilirsiniz.");

        }
    }
}