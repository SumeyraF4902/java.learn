package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive (Class array list--> refrans) data türlerinde objenin  kendisi değilde dataları değişirse
        objenin referans ve kendisi değişmediği için dataların değişikliği kalıcı yapar.
         */
        //Task--> listin elemanları 24,20,87  iki farklı methodile list elemanlarını
        // update edip print eden code cretae ediniz.
        // 1 methot --> with for each , 2. method -->set (index,value) (set atamaktı şu indexe şu değeri ata demek)
        List<Integer>list = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi list = " + list);
        Update1(list);
        Update2(list);
        System.out.println("method sonrası list = " + list);//48,40,147 Pass By referans. array ve list de değer değişir
        //değişiklik kalıcı oldu bu javanın istisnasıdır array ve list dışında java by Pass dır değişmez
        // // update2 de set ettiğimiz için değer  kalıcı olarak değişti.

    }
    public static void Update1(List<Integer> list){
        for (Integer v:list) {
            v *= 2;

        }
        System.out.println(list);
    }
    public static void Update2(List<Integer>list){
        for (int i=0; i<list.size(); i++){
            list.set(i,list.get(i)*2);//list get i>list git i elemanını getir sonra *2,sonra sonucu i indexsine ata.
            System.out.println("list = " + list);// ;
        }

}}
