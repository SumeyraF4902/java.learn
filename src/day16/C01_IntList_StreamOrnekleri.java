package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C01_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        yazdiri(list);
        System.out.println("******");//;-5 -8 -2 -12 0 1 12 5 6 9 15 8
        System.out.println(negatifiYazdiri(list));//[-5, -8, -2, -12]
        System.out.println("******");
        pozitifyazdiri(list);//[1, 12, 5, 6, 9, 15, 8]
        System.out.println("******");
        System.out.println(karelisti(list));//[25, 64, 4, 144, 0, 1, 144, 25, 36, 81, 225, 64]
        System.out.println("******");
        System.out.println(karetekrarsiz(list));//[25, 64, 4, 144, 0, 1, 36, 81, 225]
        System.out.println("******");
        kucuktenBuyugeSırala(list);//-12 -8 -5 -2 0 1 5 6 8 9 12 15
        System.out.println("******");
        buyuktenKucugeSırala(list);//15 12 9 8 6 5 1 0 -2 -5 -8 -12
        System.out.println("******");
        System.out.println("sonBesBasamak(list) = " + sonBesBasamak(list));//[125, 3375]
        System.out.println("******");
        sonBasamagıBesDegil(list);//1 144 36 81 64
        System.out.println("******");
        System.out.println("listToplami(list) = " + listToplami(list));//29
        System.out.println("******");
        System.out.println("peek(list) = " + peek(list));
        System.out.println("******");
        bestenByuyukVarmi(list);// true
        System.out.println("******");
        sifirdanKucukMul(list);//false
        System.out.println("******");
        yuzeEsitElemanYokMul(list);//true
        System.out.println("******");
        sifiraEsitElemanYokMul(list);//false
        System.out.println("******");
        System.out.println(ilkBesiTopla(list));//-27//
        System.out.println("******");
        sonBesEleman(list);//
    }


    //S17: listenin son bes elemaninin  listele
    private static void sonBesEleman(List<Integer> list) {
        list.stream().skip(list.size()-5).forEach(t->System.out.println(t+" "));
      //  skip(list.size()-x) sondan x kadar elemanı verir
        // skip atla demek skip(3) ilk üc elemanı atla demek
    }
    // S16:  listenin ilk 5 elemanini topla?
    private static int ilkBesiTopla(List<Integer> list) {
       return list.stream().limit(5).reduce(0,(x,y)->(x+y));

    }

    // S15: listenin sifira esit elemani yok mu?
    private static void sifiraEsitElemanYokMul(List<Integer> list) {
        System.out.println(list.stream().noneMatch(t -> t == 0));
    }

    // S14: listenin 100 e esit elemani yok mu ?
    private static void yuzeEsitElemanYokMul(List<Integer> list) {
        System.out.println(list.stream().noneMatch(t -> t == 100));
    }

    // S13 : listenin tum elemanlari sifirdan kucuk mu?
    private static void sifirdanKucukMul(List<Integer> list) {
        System.out.println(list.stream().allMatch(t -> t < 0));
        //allMatch tamamı demek
    }

    // S12 : listeden 5 den buyuk  sayi var mi?
    private static void bestenByuyukVarmi(List<Integer> list) {
        System.out.println(list.stream().anyMatch(t -> t > 5));
        //anyMatch aradıgın sayıdan hic varmı demek
    }

    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
    private static List<Integer> peek(List<Integer> list) {
      return  list.stream().filter(t->t<0).peek(t-> System.out.println("negatifler:"+t)).map(t->t*t).
                peek(t-> System.out.println("kareleri:"+t)).collect(Collectors.toList());
       // peek yapılan islemi görmemizi saglar
    }

    // S10 :list elemanlarini toplamini bulalim
    private static int listToplami(List<Integer>list) {
       return  list.stream().reduce(0,(x,y)->(x+y));
       // reduce toplama yapar tek sonuc verir. mapte tek tek ele aldığı icin  her topladıgında sonuc verir
    }

    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    private static void sonBasamagıBesDegil(List<Integer> list) {//pozitif elemanlarının karesinin birler basamagı 5 olmayanlardan yeni liste
    list.stream().filter(t->t > 0).map(t -> t*t).filter(t->t%10!=5).forEach(t -> System.out.print(t+" "));
    }
    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    private static List<Integer> sonBesBasamak(List<Integer> list) {// pozitif elemanlar icin küplerini bulup birler basamagı 5 olanları  yeni listede yazdir
         return list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }
    //S7: listin elemanlarini buyukten kucuge siralayalim
    private static void buyuktenKucugeSırala(List<Integer> list) {// büyükten kucuge sırala
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }
    //S6: listin elemanlarini kucukten buyuge siralayalim
    private static void kucuktenBuyugeSırala(List<Integer> list) {// küçükten büyüge sırala
        list.stream().sorted().forEach(t-> System.out.print(t+" "));
    }
    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    private static List<Integer> karetekrarsiz(List<Integer> list) {// tekrarsız karelerden olussun
        return  list.stream().map(t->t*t).distinct().collect(Collectors.toList());
        //distinct -->tekrarsız yazdırır

    }
// S4: list in elemanlarin karelerinden yeni bir list olusturalim

    private static List<Integer> karelisti(List<Integer> list) {// karelerinden yeni bir liste olustur
        return  list.stream().map(t->t*t).collect(Collectors.toList());

    }
    //S3: pozitif olanlardan yeni bir liste olustur
    private static void pozitifyazdiri(List<Integer> list) {// pozitif olanları yazdır
        System.out.println(list.stream().filter(t -> t > 0).collect(Collectors.toList()));

    }
    //S2: sadece negatif olanlari yazdir

    private static List<Integer> negatifiYazdiri(List<Integer> list) {// sadece negatif yzdir
        return list.stream().filter(t->t<0).collect(Collectors.toList());
    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz //
    private static void yazdiri(List<Integer> list) {// boşluk bırakarak yazdırmak
        list.stream().forEach(t-> System.out.print(t+" "));
    }




}
