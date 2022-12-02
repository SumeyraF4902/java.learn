package Team07_OkulYonetimi;

import java.util.ArrayList;

public class Task01 {

        //Constructor--> bir obje üretilirken çalışan kod bloğudur.
    //Constructor tanımlanmazsa java default constructor kullanır


    public Task01(String isim, String soyisim, int yas, String sinif) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.sinif = sinif;

    }

    //Fieldlar(Public private static)(Encapsulation) isim soy isim, yas,sınıf, öğrenci id,notlar--> değer tutar-- sınıf geçtimi


  private   int ogrenciNo;// static olmamalı çünkü her öğrencinin numarası kendisine özeldir. private yapılır

   private String isim;// değiştirilemez

   private String soyisim;// değiştirilemez

  private   int yas;//değiştirilebilir

  private    String sinif;//değiştirilebilir

  private    ArrayList<Double> notlar;//değiştirilebilir

  private    boolean gectiMi;//değiştirilebilir


        //Methodlar (Public private static)(getter, setter)--> aksiyon vardır . ortalama hesapla, bilgi yazdır.

    public int getSinifMevcudu=0; {

    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public String getSinif() {
        return sinif;
    }

    public ArrayList<Double> getNotlar() {
        return notlar;
    }

    public boolean isGectiMi() {
        return gectiMi;
    }

    public void setSinifMevcudu(int sinifMevcudu) {
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public void setNotlar(ArrayList<Double> notlar) {
        this.notlar = notlar;
    }

    public void setGectiMi(boolean gectiMi) {
        this.gectiMi = gectiMi;
    }
}

