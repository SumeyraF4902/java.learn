package day16;

import java.util.Arrays;
import java.util.stream.Stream;

public class C3_Array_StreamOrnekleri {
    // Arraylerde Stream kullanabilmek icin 2 yol vardir
    // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
    // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
    //Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
    // kullanabilmek icin donusum yapilmalidir

    Integer arr1 [] ={1,5,-5,6,12,-8,9,3,4};
    //S1: arrayin elemanlarini bir liste yazdiralim
    private  static  void arrElemanListele(Integer arr1[]){
        Stream<Integer>list=Stream.of(arr1);


    }


//S2: Arrayin elemanlarini toplamini bulalim


// S3: Array in elemanlarinin ortalamasini bulalim yazdir


}



