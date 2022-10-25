package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Arrays;

public class kareleriBul {
    public static void main(String[] args) {
          /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2, 6, 4, 5, 8, 9));
        ArrayList<Integer>karelist=new ArrayList<>();
            int toplam=0;
            for (int i=0;i<list.size(); i++){
                karelist.add(list.get(i)*list.get(i));
                toplam+=list.get(i)*list.get(i);

            }
        System.out.println(karelist);
        System.out.println(toplam);
        }
    }

