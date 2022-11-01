package Arrays_List_Tasklar;

import java.util.Scanner;

public class elektrik_Runner {
    /*
    Task 02 -> elektrkHesapla, elektrik müşteri, ve elktrik Runner adında 3 class açıldı
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
     */
    public static void main(String[] args) {
        elektrkHesapla hesapla=new elektrkHesapla();
        eletrik_Musteri musteri=new eletrik_Musteri("Muhsin",hesapla);
        hesapla.tuketimEkle(5000);
        hesapla.tuketimEkle(1000);
        System.out.println(musteri.name+"in toplamTuketimi= " + hesapla.toplamTuketim);
        System.out.println("2 aylık faturanız:"+hesapla.ödenecektutar());
    }
}
