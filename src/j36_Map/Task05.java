package j36_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task05 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle=sc.nextLine();


        Map<Character,Integer> adet=new TreeMap<>();
        for(int i=0; i<cumle.length();i++) {
            char c=cumle.charAt(i);
            if(adet.containsKey(c)) {
                adet.put(c, adet.get(c)+1);

            }else {
                adet.put(c, 1);

            }
        }
for (Map.Entry<Character,Integer> entry: adet.entrySet()) {
    System.out.println("karakter  "+ entry.getKey()+" "+entry.getValue()+" kadar vardır");
}


    }
}
