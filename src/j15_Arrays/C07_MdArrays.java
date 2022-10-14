package j15_Arrays;

import java.util.Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
        //task --> arr elemanlarını toplayan code create ediniz
        int arr[][]={{1,2,3,},{10,20},{101}};// 3 katlı apartman
        /* int arr[][]={
        {1,2,3,},  //0. kat
        {10,20},   // 1.kat
        {101}};   // 2.kat alt altada yazılabilir
         */
        int toplam=0;
        System.out.println(Arrays.deepToString(arr));
        for (int  kat=0; kat<arr.length; kat++){
            for (int daire=0; daire < arr[kat].length; daire++){
                toplam+=arr[kat][daire];
        //arr yi apartman olarak düşün
            }
        }
        System.out.println(" arr deki yüm elemanlar toplamı  : "+toplam);//137
    }
}
