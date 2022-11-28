package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        cittKarePrint(sayi);//576 1444 1764 4356 2116 256
        System.out.println("sayi = " + sayi);//[24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16]
        System.out.println("\n   ***   ");
        tekKüpPrint2(sayi);
        System.out.println("\n   ***   ");
        ciftKareKök(sayi);
        System.out.println("\n   ***   ");
    }//main sonu

    //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.


    //// Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
    public static void cittKarePrint(List<Integer> sayi) {
        sayi.
                stream().//list elemanlar akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki çift elemanlar filtrelendi
                map(t -> t * t).//akışta fitrelenen çitf elemanlar alınarak update edildi akışa sokuldu.
                forEach(C01_LambdaExpression::yazdir);//akışta filtrelenmiş çift elemanlar karsı alınıp işaretlenen akıştan print edildi.
    }

    //Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void tekKüpPrint2(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 1).map(t -> t * t * t + 1).forEach(C01_LambdaExpression::yazdir);

        //map(t -> t * t * t+1) yerine --->map(t->(int)Math.pow(t,3)+1).   double verir. cast int yapmamız gerekir
        sayi.stream().filter(t -> t % 2 == 1).map(t -> (int) Math.pow(t, 3) + 1).forEach(C01_LambdaExpression::yazdir);

        //Task : Functional Programming ile listin tek elemanlarinin  kuplerinin  ayni satirda aralarina bosluk birakarak print edi
        //farklı bir class da kupleri bulam methot , tekleri yazdıran method oluşrutup oradan call edebilirsin C01 de oluşturdum
        // yol methodlarla  1
        System.out.println("****");
        sayi.stream().filter(C01_LambdaExpression::tekMi).map(C01_LambdaExpression::kupBul).forEach(C01_LambdaExpression::yazdir);
    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKareKök(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(Math::sqrt).forEach(t -> System.out.print(t + " "));// en sondaki yazdır demek
    }//math double yazdır method int olduğu için ya elle yazdır yada math cast in yapmamız gerekiyordu
}