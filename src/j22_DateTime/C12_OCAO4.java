package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C12_OCAO4 {
    public static void main(String[] args) {
        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDate date = LocalDate.of(2018, Month.APRIL, 28);
        date.plusDays(2);
        date.plusYears(3);

        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
/*  CEVAP A. TANIMLANMIŞ AMA ATAMA YAPILMADIĞI İÇİN DEĞİŞTİRMEDİ
        date=date.plusDays(2); böyle yapmış olsaydı yeni değerleri yazardık o zaman cevap E olurdu
        date=date.plusYears(3);
            A. 2018 APRIL 28
            B. 2018 APRIL 30
            C. 2018 MAY 2
            D. 2021 APRIL 2
            E. 2021 APRIL 30
            F. 2021 MAY 2
            G. A runtime exception is thrown.
 */

    }
}
