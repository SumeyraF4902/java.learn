package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
//contains();-> method list'te istenen elemanın varlığını kontrol eder. true/false return eder,
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println("listSehir.contains(\"Münih\")= " + listSehir.contains("Münih"));//true
        System.out.println("listSehir.contains(\"angara\")= " + listSehir.contains("angara"));//false

    }
}
