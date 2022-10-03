package j09_SwitchStatemen;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
//TASK Girilen haftanın gününü hafta içi veya sonu olduğunu print eden code create yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gün giriniz");
        String gün= scan.next().toLowerCase();//PazAR GİRİLSE BİLE GİRİLEN HARFLER KÜÇÜK HARFE ATANIR.
        switch (gün){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe"://YUKARIDAKİ TÜM CASELERE BREAK ATANMADI ÇÜNKÜ HEPSİBİRYERE ATANDI.
            case "cuma":
                System.out.println("haftaiçi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu ");
                break;
            default://SWİTCH HİÇBİR CASE EŞLEŞMEZSE YAZILIR
                System.out.println("bugün o gün değil");

        }



    }
}
