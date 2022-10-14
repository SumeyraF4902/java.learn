package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Array elemanı varlığını kontrol etme,...
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};
        int sayi=34;
        boolean flag=false;// bayrak aşağıda
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("aradığınız sayı array de var." );

    }else {
            System.out.println("aradığınız sayı array de yok");
        }
        Arrays.sort(arr);//array elemanları küçükten büyüğe sıralandı
        System.out.println(Arrays.toString(arr));// sıralanmış halini yazdırdı.
        System.out.println(Arrays.binarySearch(arr, 34));//5  binarySearch=ikili arama= (arr,34);-->method aranan elamanı arrayda arayıp index return eder,
        System.out.println(Arrays.binarySearch(arr, 16));//1  binarySearch=ikili arama= (arr,34);-->method aranan elamanı arrayda arayıp index return eder,
        System.out.println(Arrays.binarySearch(arr, 21));//-5
        System.out.println(Arrays.binarySearch(arr, 99));//-13
        System.out.println(Arrays.binarySearch(arr, 5));//-1
//trick--> binarySearch() methodu arrayda olmayan elemanı çalısırsa sonuç olarak; eğer bu eleman arrayde olsaydı hangi indexte (sırada)olacağını - verevek gösterir
    }}
