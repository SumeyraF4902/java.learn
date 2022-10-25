package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;

public class task06 {
    public static void main(String[] args) {
         /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */
       ArrayList <Integer>a=new ArrayList(List.of(5,4,6,2,1));

        System.out.println(hillNum(a));
    }

    private static int hillNum(ArrayList<Integer> a) {
        int flag=0;
        for (int i=1; i<a.size()-1;i++){
            if(a.get(i)<a.get(i-1) && a.get(i)>a.get(i+1)){
               flag=a.get(i);
            }
        }return flag;
    }
}
