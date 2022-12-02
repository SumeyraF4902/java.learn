package j13_Break_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ebob {
    public static void main(String[] args) {
/*--->>> EBOB
    En az biri sıfırdan farklı iki veya daha fazla tam sayının pozitif ortak bölenlerinin en büyüğüne bu sayıların
    en büyük ortak böleni kısaca “EBOB“u denir.
    18 ve 24 sayılarının en büyük ortak bölenini bulalım.
     */
        int a= 18;
        int b = 24;
        int ebob=0;
        for(int i = 2; i<Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                ebob = i;
            }
        }
        System.out.println(ebob);
        for(int i= Math.min(a,b); i>=2; i--){
            if(a%i==0 && b%i==0){
                ebob=i;
                break;
            }
        }
        System.out.println(ebob);
// listedeki sayilardan 5 elemani haric diger elemanlarini 5 arttiralim
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i)==5)
                continue;
            list.set(i, list.get(i)+5);
        }
        System.out.println(list);

    }
}
