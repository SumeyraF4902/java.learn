package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
       // LocalDate date= LocalDate.of(2022,11,33);// RTE Verir ayın günü 33 olamaz.

        try{
            LocalDate date= LocalDate.of(2022,11,33);//agam ahanda hatan  Invalid value for DayOfMonth (valid values 1 - 28/31):33 hatayı gösterir
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch(DateTimeException e){
            System.out.println("  agam tarihi doğru girmedin");
            System.out.println("agam ahanda hatan  :"+e.getMessage());

        }


        System.out.println("Agam sorun handle edildi DEWAMKEE  :)");//Bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.

    }
}
