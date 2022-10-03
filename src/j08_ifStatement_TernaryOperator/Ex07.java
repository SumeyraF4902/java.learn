package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
           */
        Scanner sc = new Scanner(System.in);

        System.out.print("Ehliyet varmı : varsa E , yoksa H yazınız: ");
        char ehliyet = sc.nextLine().toUpperCase().charAt(0);//bütün harfleri büyük girer

        if (ehliyet == 'E') {// ehliyet varlığı kontrol edildi

            System.out.print("kaç yıldır ehliyetiniz var:");
            int yıl = sc.nextInt();
            if (yıl >= 7) {//tecrübe yılı kontrol edildi
                System.out.println("yaptığınız mesafeyi giriniz:");
                int km = sc.nextInt();
                if (km >= 100000) {//km mesafe kontrol edildi
                    System.out.println("kontak anahtarı senindir.");
                } else//km şartı sağlamazsa çalışır
                    System.out.println("kontak anahatarı almanız için :" + (100000 - km) + "yola ihhtiyacınız var");
            } else System.out.println("kontak anahtarı almanız içim önce " + (7 - yıl) + "yıla ihtiyacınız var");
// yıl 7 den büyük olma şartı sağlamadığı için

        } else if (ehliyet == 'H') {//ehliyetin yokluğu kontrol edildi
            System.out.println("önce ehliyet kursuna gidiniz.");
        } else System.out.println("agam önce adam gibi karakter giriniz");//doğru karakter girmediği zaman çalışır
    }
}
