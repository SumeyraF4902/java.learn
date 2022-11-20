package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task05 {
    public static void main(String[] args) {
        /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
        String s="Germany";
        String d="USA";
        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList("Germany", "France", "France", "USA","Kanada","Mexico"));

        System.out.println(removing(hs,s,d));
    }

    private static LinkedHashSet removing(LinkedHashSet<String>h,String s,String d) {
        if(h.contains(s)|| h.contains(d)) {
            h.remove(s);
            h.remove(d);
        }
return h;
    }
}
