package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //map.size();->Girilen  map'in entry(giriş: eleman) sayısını  return eder.
        //map.clear();->Girilen  map'in  tum entry(giris: eleman)siler .
        //map.isEmpty();->Girilen  map'in entry(giris: eleman) varlığını kontrol eder boolean return eder.
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);// {Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.size() = " + hm.size());//6
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//silmeden önce  boş mu? --> false

        hm.clear();//siler
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//sildikten sonra  boş mu-->true
        System.out.println("hm.size() = " + hm.size());// 0
    }
}
