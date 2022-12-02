package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");
        ilkHarficveyad(list);//cok da
        System.out.println("*******");
        yildizEkleme(list);//*Java**ogrenmek**cok*......devamke
        alfabetikSirala(list);//Cok Daha Eglenceli Java Oldu cok da eglencelidi gelince lambda ogrenmek
        System.out.println("*******");
        tumLsil(list);//Java ogrenmek cok egenceidi ambda geince Daha da Cok Egencei Odu
        System.out.println("*******");
        icindeEolanlariListele(list);//[ogrenmek, eglencelidi, gelince, Eglenceli]
        System.out.println("*******");
        ilkHarfiUckereYaz(list);//JJJava ooogrenmek cccok eeeglencelidi lllambda gggelince DDDaha ddda CCCok EEEglenceli OOOldu
        System.out.println("*******");
        ilkHarfBuyuk(list);//Java Ogrenmek Cok Eglencelidi Lambda Gelince Daha Da Cok Eglenceli Oldu
        System.out.println("*******");
        uzunlukDortVeAltıHaric(list);//[ogrenmek, cok, eglencelidi, gelince, da, Cok, Eglenceli]






    }
    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    private static void uzunlukDortVeAltıHaric(List<String> list) {
        System.out.println(list.stream().filter(t -> t.length() != 4 && t.length() != 6).collect(Collectors.toList()));
    }

    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    private static void ilkHarfBuyuk(List<String> list) {
        list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t->System.out.print(t+" "));

    }

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    private static void ilkHarfiUckereYaz(List<String> list) {
        list.stream().map(t->t.substring(0,1)+t.substring(0,1)+t).forEach(t-> System.out.print(t+" "));

    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz
    private static void icindeEolanlariListele(List<String> list) {
        System.out.println(list.stream().filter(t -> t.contains("e")).collect(Collectors.toList()));
    }

    //S4: tum 'l' leri silelim yazdiralim
    private static void tumLsil(List<String> list) {
        list.stream().map(t->t.replaceAll("l","")).forEach(t-> System.out.print(t+" "));
    }

    //S3: alfabetik  olarak siralayalim list olarak
    private static void alfabetikSirala(List<String> list) {
        list.stream().sorted().forEach(t-> System.out.print(t+" "));
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    private static void yildizEkleme(List<String> list) {
        list.stream().map(t->"*"+t+"*").forEach(t-> System.out.println(t));
    }

    // S1: ilk harfi d ve ya c olanlari listeleyelim
    private static void ilkHarficveyad(List<String> list) {
        list.stream().filter(t->t.startsWith("d")||t.startsWith("c")).forEach(t-> System.out.print(t+" "));
    }
}
