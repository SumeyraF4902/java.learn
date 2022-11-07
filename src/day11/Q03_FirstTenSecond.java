package day11;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Q03_FirstTenSecond {
    // Local time ile  her dakikanın ilk 10 saniyesi
    public static void main(String[] args) {
        LocalDateTime suan=LocalDateTime.now();
        System.out.println("suan zaman:  "+suan);
        if(suan.getSecond()<=10){
            System.out.println("ilk on saniye içinde");
        }else
            System.out.println("ilk on saniye dışında");
    }
}
