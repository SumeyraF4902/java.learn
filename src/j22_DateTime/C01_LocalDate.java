package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());

        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);

        // verilen bir tarihin öncesi ve sonrasına gitme.... minus()önceki tarihe ., plas() sonraki tarihe götürür
        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));// date1 in 12 gün sonrasına götürür
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));// date2 in 3 ay sonrasına götür
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));// bugun den 6 hafta sonrası
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));// bugun den 5 ay öncesi
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));
    }
}
