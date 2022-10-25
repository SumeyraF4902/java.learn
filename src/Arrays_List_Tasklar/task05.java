package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task05 {
    public static void main(String[] args) {
         /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

        ArrayList<String>list=new ArrayList(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
       System.out.println(rotateList(list));
    }

    private static ArrayList<String> rotateList(ArrayList<String> a) {

        for(String value:a)
        Collections.reverse(a);
        return a;
    }/*ArrayList<String> newcities = new ArrayList<>(); boş liste açılır
        for(int i = cities.size()-1; i>=0 ; i--){
            newcities.add(cities.get(i));
        }
        return newcities;*/


}
