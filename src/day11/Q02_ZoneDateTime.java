package day11;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q02_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Asia/Tokyo nun saat dilimine gore saat ?
    // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
    public static void main(String[] args) {
        ZonedDateTime asiaTokyo=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(asiaTokyo);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("asiaTokyo.format(format) = " + asiaTokyo.format(format));
    }
}
