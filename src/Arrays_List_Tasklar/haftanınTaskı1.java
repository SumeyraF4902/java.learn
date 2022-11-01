package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;

public class haftanınTaskı1 {
    public static void main(String[] args) {
        /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */
        ArrayList<ArrayList<String>> list=new ArrayList<>();
        ArrayList<String> calisanlar=new ArrayList<>(List.of("Ahmet","mehmet" ,"ali","veli"));
        ArrayList<String> isverenler=new ArrayList<>(List.of("Özen hmn"));
        ArrayList<String> sirketler=new ArrayList<>(List.of("Ford","Audi","IBM"));
        list.add(sirketler);
        list.add(calisanlar);
        list.add(isverenler);
        System.out.println(list);


    }
}
