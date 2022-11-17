package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
        Verilen bir integer listin  tek elemanlarının karesini tersten ITERATOR kullanarak print eden code create ediniz
        input =1,2,5,
        output=25,1
         */
        List<Integer> l=new ArrayList<>(Arrays.asList(2,9,56,3,5,14,40));
        ListIterator<Integer> w=l.listIterator();
        while ((w.hasNext())) {
           int sayı=w.next();
           if (sayı%2==1){
               w.set(sayı*sayı);
           }else {
               w.remove();
           }
    }while(w.hasPrevious()){
            System.out.println(w.previous()+" ");
        }

    }
}
