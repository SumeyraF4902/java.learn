package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ödev_Ogretmen {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        List<String>notlar=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String cıkıs="";
        do {
            System.out.println(" sayı girişi yapınız çıkmak için \"C\" giriniz");
            cıkıs = sc.next();
            notlar.add(cıkıs);
        }while (!cıkıs.equalsIgnoreCase("C"));
        notlar.remove("c");
        notlar.remove("C");
        System.out.println("notlar: " + notlar);
        System.out.println("Ortalamadan Buyuk sayilar : " + ortbuyuk(notlar));
    }
    public static List<Integer>ortbuyuk(List<String>strlist) {
        List<Integer> ortalamadanBuyuk = new ArrayList<>();
        int toplam = 0;
        for (int i = 0; i < strlist.size(); i++) {
            toplam += Integer.parseInt(strlist.get(i));
        }
        double ortalama = toplam / strlist.size();
        System.out.println("ortalama: "+ ortalama);
        for (int i = 0; i < strlist.size(); i++) {
            if (Integer.parseInt(strlist.get(i)) > ortalama) {
                ortalamadanBuyuk.add(Integer.parseInt(strlist.get(i)));
            }
        }

        return  ortalamadanBuyuk;
    }





}
