package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
// task -> urun fiyatları toplamını hesaplayan code create ediniz..
                int sum=0;
                for(Integer w:map.values()) {//296,301,326,340,320
                    sum+=w;
                }
        System.out.println(sum);//1583
                // 2 yol
        int toplam=0;
        for(Map.Entry<String, Integer> a:map.entrySet()) {//296,301,326,340,320
            toplam+=a.getValue();

        }
        System.out.println("agamın toplamı:"+toplam);//1583
    }
}
