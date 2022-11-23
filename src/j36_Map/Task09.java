package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task09 {
    public static void main(String[] args) {
         /*
     Task-> aşağıdaki çıktıyı print eden code create ediniz.
     Kiraz 100
     İncir 200
     Enginar 150
     Üzüm 145
     Nar 250

     */
        Map<String,Integer> meyvelist = new HashMap<String,Integer>();
        meyvelist.put("Kiraz", 100);
        meyvelist.put("İncir",200);
        meyvelist.put("Enginar",150);
        meyvelist.put("Üzüm",145);
        meyvelist.put("Nar",250);
        for(Map.Entry<String,Integer> liste: meyvelist.entrySet()) {
            System.out.println(liste.getKey() + ": " + liste.getValue());
}

    }
}
