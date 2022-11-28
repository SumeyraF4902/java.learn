package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    public static void main(String[] args) {
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür. sıralamaktır
//Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        ciftKarePrint(sayi);//256 576 1444 1764 2116 4356
        System.out.println("\n   ***   ");
        buyktenKcuge(sayi);//5625 4489 3025 2401 2025 1225 1089 625 49 9
        System.out.println("\n   ***   ");
    }// main sonu
    //// Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftKarePrint(List<Integer>sayi){
       sayi.
               stream(). //list elemanları akışa alındı
               filter(C01_LambdaExpression::ciftMi).//akıştaki elemanlar çift sartına göre filtrelendi
               map(t->t*t).//çiftlerin karesi ile update edildi
               sorted().//küçükten büyüğe sıralandı
               forEach(C01_LambdaExpression::yazdir); //print
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
//Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
    }
    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz. ters sıra büyükten küçüge
    public static void buyktenKcuge(List<Integer>sayi){
        sayi.stream().filter(C01_LambdaExpression::tekMi).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(C01_LambdaExpression::yazdir);
        //Comparator.reverseOrder() meth call. ters sıra meth sorted mth. parametre
        //reverseOrder() => Comparator Class’ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
        // bir Comparator (karşılaştırıcı) return eder.

    }
}
