package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Task--<<<<>
        Node değerleri "yakup","javaCAN", "javaTAR","Teykinay" olan bir linkedList creat ediniz
        Girilen bir String değeri linkedListe Varlığını kontrol eden code create ediniz.
         */

        LinkedList<String> list=new LinkedList<>(Arrays.asList("yakup","javaCAN", "javaTAR","Teykinay"));
        Scanner sc=new Scanner(System.in);
        System.out.println("Agam kime bakmıştınız ismini  giriniz");
        String aga=sc.nextLine();
        System.out.println("list  :"+ list);
        if(list.remove(aga)){// true --> istenen node varsa listeden silindi
            System.out.println("agam eleman halledildi");
            System.out.println("list  :"+ list);
        }else
            System.out.println("aradığınız kişi burada yok");


    }

}
