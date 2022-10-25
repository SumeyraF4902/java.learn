package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        // list 'i Array'a çevirme-> toArray();
        // 1. yöntem-> toArray(); parametre olarak String[0] olarak yapılır.
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        String arrUlke []=listUlke.toArray(new String[0]);//ulkeList'i elemanları arrUlke olarak atandı

        System.out.println("listUlke = " + listUlke);//[Alamanya, Amerigonya, ingiltere, isvec]
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));//[Alamanya, Amerigonya, ingiltere, isvec]
        // 2. Yontem -> oluşturulan Array'in data type  Object olarak atanır.
        // Trıck-> Object class java'da tüm class'ların parent(atası:HZ ADEM)
        //Object Class java da parentii olmayan tek Classdır. (tüm vagonları çeken ama çekilemez lokomotif)
        //String Integer Classlar Object Class child olduğu için istenen durumlarda data type olarak object class kullanılabilir.
        Object arrUlkeler []=listUlke.toArray();//Object-> Hz.Adem Class'ına atandı
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));//[Alamanya, Amerigonya, ingiltere, isvec]

    }
}
