package day15;

import java.util.ArrayList;

public class Task03 {
    public static void main(String[] args) {
/*
verilen arraydeki tekrar eden sayıları ilki haric silip tekrarsız sayılardan olusan bir array haline getirin
input{1,2,2,3,1,4,2,-2,5,6,7,6,-2,9,3,10,5}
out put

 */
        int arr[]={1,2,2,3,1,4,2,-2,5,6,7,6,-2,9,3,10,5};
        int ilkNum=arr[0];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=0; i<arr.length;i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }

        }  System.out.println(list);
        int array[]=new int [list.size()];
        for (int i=0; i<array.length;i++) {
            array[i]=list.get(i);
        }
    }
}
