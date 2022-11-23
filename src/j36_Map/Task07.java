package j36_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Task07 {
    public static void main(String[] args) {
         /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */
        HashMap<String,Integer> animals=new HashMap<>();
        animals.put("Lion",1);
        animals.put("Tiger",2);
        animals.put("Elephant",3);
        animals.put("Cat",4);
        animals.put("Dog",5);
        System.out.println("returnkey(animals) = " + returnkey(animals));
    }

    private static ArrayList<String> returnkey(HashMap<String,Integer> animals) {
        ArrayList<String> keylist=new ArrayList<>(animals.keySet());
        for (String key :keylist)
            System.out.println(key + " ");
    return keylist;
}}
