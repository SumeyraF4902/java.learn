package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

        List<String> menu = new ArrayList<>(Arrays.asList("küşleme","soğanlı","trilice","soğanlı","küşleme","bicibici","buryan","küşleme","melemen","cacix","kokareç","yağlama","güveç","arabAşı","tantuni"));
        alfBkTkszPrint(menu);//ARABAŞI BURYAN BİCİBİCİ CACİX GÜVEÇ KOKAREÇ KÜŞLEME MELEMEN SOĞANLI TANTUNİ TRİLİCE YAĞLAMA
        System.out.println("\n   ***   ");
        chrSysTersSıraPrint(menu);//8 7 6 5
        System.out.println("\n   ***   ");
        chrSysBkSıra(menu);//cacix güveç buryan küşleme soğanlı trilice soğanlı küşleme küşleme melemen kokareç yağlama arabAşı tantuni bicibici
        System.out.println("\n   ***   ");
        sonHarfiPrint(menu);//soğanlı soğanlı arabAşı kokareç güveç cacix buryan melemen bicibici tantuni küşleme trilice küşleme küşleme yağlama
        System.out.println("\n   ***   ");
        ciftKareBkSırala(menu);//64 36
        System.out.print("\n   ***   ");
    }
    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBkTkszPrint(List<String> menu){
        menu.stream().map(String::toUpperCase).// büyük harf yaptı
                sorted().//sıraladı a-->z ye
                distinct().//farklı(benzersiz,tekrarsız)akış düzenler
                forEach(t-> System.out.print(t+ " "));
        //  forEach(C01_LambdaExpression::yazdir); CTE VERİR data typr int

    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrSysTersSıraPrint(List<String> menu) {
        menu.stream().map(String::length).//akıştaki string elemanlar karakter sayısına update edildi.
                sorted(Comparator.reverseOrder()).// ters sıra
                distinct().forEach(t -> System.out.print(t + " "));
    }
    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void chrSysBkSıra (List<String> menu) {
        menu.stream().sorted(Comparator.comparing(String::length)).//akıştaki string elemanlar lenght ine göre değil doğal sıraladı
                forEach(t->System.out.print(t+" "));// ters sıra
    }

// Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static  void sonHarfiPrint(List<String>menu) {
        menu.stream().sorted(Comparator.
                // karşılastırma klası
                comparing(t->t.toString().//larşılastıma methodu
                charAt(t.toString().length()-1)).//harfine son karaktere göre karşılaştır
                reversed()).forEach(t -> System.out.print(t+" "));

    }
    //Task : listin elemanlarin karakterlerinin cift olanlarının   karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
    public static void ciftKareBkSırala(List<String>menu){
        menu.stream().filter(t->t.length()%2==0).sorted().distinct().map(String::length).map(t->t*t).forEach(t -> System.out.print(t+" "));
    }
}