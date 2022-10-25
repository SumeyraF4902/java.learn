package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;

public class task02 {
    public static void main(String[] args) {
        /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */
        ArrayList<Integer>list=new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("sum = " + getSum(list));
    }

    private static Integer getSum(ArrayList<Integer>a) {
        int sum=0;
        for (int value:a){
            sum+=value;
        }return sum;
    }
}
