package j34_Iterators;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        /*
        task
        Bir listedeki istenen sayı aralığında olmayan elementleri silip print eden code create ediniz
        (2. liste oluşturmadan geçerli liste üzerinde iterator ile işlem yapınız
        örn:[2,13,56,23,45,14,40] istenen aralık 20 ile 40 arasında (sınırlar dahil)
        output: [23,40]
        (20den küçük ,40 dan büyükleri silindi)

       */
      List<Integer> liste= new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        Iterator<Integer> x= liste.iterator();

        while (x.hasNext()) {
            int istenenSayı= x.next();
            if (istenenSayı<20 || istenenSayı>40){
                x.remove();
            }
        }
        System.out.print(liste+" ");


    }}


