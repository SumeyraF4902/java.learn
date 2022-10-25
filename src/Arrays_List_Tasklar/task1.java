package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
         /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */
        ArrayList<String>listeMeyve=new ArrayList<>(List.of("banana" ," orange","kiwi","peach","orange"));
        System.out.println("tekrarlı meyvelerin sayısı"+ getCounts(listeMeyve,"orange"));

    }

    private static Integer getCounts(ArrayList<String>a,String str) {
        int count=0;

        for(String valua:a){
            count+=valua.contains(str)?1:0;


        }return count;
    }
    /* for (int i = 0; i < listmeyve.size(); i++) {
        if (listmeyve.get(i)==Meyve) {
        say++;
        }
        }
        return say;*/
}
