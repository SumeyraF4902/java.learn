package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task08 {
    public static void main(String[] args) {
 /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */
        ArrayList<Integer>max2=new ArrayList(List.of(5,3,4,6,7));
        System.out.println(secondMax(max2));
    }

    private static int  secondMax(ArrayList<Integer> max) {
        int maxsayı2=0;
        Collections.sort(max);
        maxsayı2=max.get(max.size()-2);

        return maxsayı2;
    }
}
