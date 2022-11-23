package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
         /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1, "New jersey");
        map.put(2, "New York");
        map.put(3, "London");
        map.put(4, "Paris");
        Scanner in = new Scanner(System.in);
        System.out.println("agam sayı giresin");//3 giri-dim
        int sayi=in.nextInt();

        System.out.print("agam sehir giresin");//miami girdim sonuc 3 dekileri benim girdiğimle değiştirdi
        String sehir=in.next();

        System.out.println("update(map,sayi,sehir) = " + update(map, sayi, sehir));//{1=New jersey, 2=New York, 3=miami, 4=Paris}


    }

    private static HashMap<Integer,String> update(HashMap<Integer, String> map, int sayi, String sehir) {
        if(map.containsKey(sayi))
            map.put(sayi, map.get(sayi) + sehir);


        map.put(sayi,sehir);
        return map;
    }
}
