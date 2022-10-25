package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //// task--> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz. with for each
        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","ciğdem"};
        String arr2[]={"musty","gülsüm","ayşe","enise","cüneyt","ciğdem"};
        List<String >ortakIsim=new ArrayList<>();// ORTAK İSİMLERİN ATANACAĞI BOŞ LİST

        for(String str1:arr1){
            for (String str2:arr2){
                if (str1.equalsIgnoreCase(str2)){//her bir çekirdek eşitliği kontrol
                ortakIsim.add(str2);
                }
        }

    }
        if (ortakIsim.isEmpty()){//ortak isim list boşluk kontrol
            System.out.println("arraylerinizde ortak isim yok" +ortakIsim);
}else System.out.println(ortakIsim);
        System.out.println("***  sayıların eşitliğine örnek****");
        Integer sayi[]={5,4,3,9,14,19,60,8,21, 47};
        Integer sayi1[]={5,12,3,22,14,8,60,8,31, 47};
        List<Integer>ortakSayi= new ArrayList<>();
        for(int i:sayi){
            for(int a:sayi1){
                if(i==a){
                    ortakSayi.add(a);
                }
            }
        }
        if (ortakSayi.isEmpty()){
            System.out.println("ortak sayı yok");
        }else System.out.println("ortak sayılar "+ ortakSayi);
}}
