package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task06 {
    public static void main(String[] args) {
        /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
        HashSet<Integer> hashset = new HashSet<Integer>(Arrays.asList(4,2,3,1,7));


        System.out.println("totalCount(hashset) = " + totalCount(hashset));
    }

    private static  int totalCount(HashSet<Integer>hashset) {

      int sayı= hashset.size();
    return sayı;}
}
