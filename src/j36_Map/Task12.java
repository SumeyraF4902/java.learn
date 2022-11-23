package j36_Map;

import java.util.HashMap;

public class Task12 {
    // Task -> Ad ve soyad bulunduruan iki ayrı array'i bir map'de print eden code create ediniz.
    // input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
    public static void main(String[] args) {

        String[] ad ={"ahmet", "ahmet can", "haluk"};
        String [] soyAd={"şeref","erdem","bilgin"};
        HashMap<String,String> adSoyad=new HashMap<>();
        // yol
        for(int i=0; i<ad.length;i++) {
            adSoyad.put(ad[i],soyAd[i]);
        }
        System.out.println(adSoyad);


    }
}