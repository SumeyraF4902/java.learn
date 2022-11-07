package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Q01_LocalDate {
    public static void main(String[] args) {
        //Q01_LocalDate
// Bugunun tarihi aliniz, yazdiriniz...
// Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
// Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..


        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
      LocalDate  degisenTarih=bugun.plusDays(1).plusMonths(1).minusYears(1);
        System.out.println(degisenTarih);
        LocalDate sonTarih=degisenTarih.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println(sonTarih);
    }
}
