package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calısma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir harf firiniz");
        String a=sc.nextLine().toUpperCase();
        List<String>list=new ArrayList(List.of("H","G","E"));
        if(list.contains(a)){
            System.out.println("listede bu harfden var");
        }else
            list.add(a);
        System.out.println(list);

    }
}
