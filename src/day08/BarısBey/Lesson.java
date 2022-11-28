package day08.BarısBey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lesson {
    static Scanner sc = new Scanner(System.in);
    private int maxKrediSayisi = 10;
    private int kalanKrediSayisi = 10;
    private int alinanKrediSayisi = 0;
    private int dersMinKrediSayisi = 0;
    private int kullaniciTercihi;

    public int getKalanKrediSayisi() {
        return kalanKrediSayisi;
    }

    public void setKalanKrediSayisi(int kalanKrediSayisi) {
        this.kalanKrediSayisi = kalanKrediSayisi;
    }

    public int getAlinanKrediSayisi() {
        return alinanKrediSayisi;
    }

    public void setAlinanKrediSayisi(int alinanKrediSayisi) {
        this.alinanKrediSayisi = alinanKrediSayisi;
    }

    public int getDersMinKrediSayisi() {
        return dersMinKrediSayisi;
    }

    public void setDersMinKrediSayisi(int dersMinKrediSayisi) {
        this.dersMinKrediSayisi = dersMinKrediSayisi;
    }

    public int getKullaniciTercihi() {
        return kullaniciTercihi;
    }

    public void setKullaniciTercihi(int kullaniciTercihi) {
        this.kullaniciTercihi = kullaniciTercihi;
    }

    ArrayList<String> dersler = new ArrayList<>(Arrays.asList("Java", "English", "Math", "Turkish", "Science"));
    ArrayList<Integer> derslerinKredileri = new ArrayList<Integer>(Arrays.asList(4, 4, 3, 2, 3));

    ArrayList<String> alinanDersler = new ArrayList<>();
    ArrayList<Integer> alinanDerslerinKredileri = new ArrayList<>();

    public void dersEkle(Student ogr1) {
        while (getKalanKrediSayisi() >= getDersMinKrediSayisi() && dersler.size() != 0) {
            System.out.println("Alabileceğiniz kredi ve kredi sayısı");
            System.out.println("============================================================");
            int j = 1;//aldığı dersin sıra numarası
            for (int i = 0; i < dersler.size(); i++) {
                if (getKalanKrediSayisi() >= derslerinKredileri.get(i)) {
                    System.out.println(j + ")" + dersler.get(i) + " dersi " + derslerinKredileri.get(i) + " kredi. " + dersler.get(i) + " dersini seçmek için--> " + j + " giriniz.");
                    j++;
                }
            }
            System.out.println("Alabileceğiniz toplam kredi: " + getKalanKrediSayisi());
            System.out.println("Almak istediğiniz dersi giriniz: ");
            System.out.println("Üst Menüye gitmek istiyorsanız : -->  10 giriniz");
            kullaniciTercihi = sc.nextInt() - 1;//1 GİRDİĞİNDE BİZİM SİSTEM O DAN BAŞLADIĞI İÇİN 1 GİRDİĞİNDE ONU İLKİNDEX OLARAK ATAYACAK.
            setKullaniciTercihi(kullaniciTercihi);
            if (getKullaniciTercihi() == 9) {
                ustMenu(ogr1);
                break;
            } else {
                alinanKrediSayisi += derslerinKredileri.get(kullaniciTercihi);
                kalanKrediSayisi = maxKrediSayisi - alinanKrediSayisi;
                alinanDersler.add(dersler.get(kullaniciTercihi));
                alinanDerslerinKredileri.add(derslerinKredileri.get(kullaniciTercihi));
                dersler.remove(dersler.get(kullaniciTercihi));
                dersMinKrediSayisi = Collections.min(derslerinKredileri);
                alinanDersler(ogr1);
                break;

            }
        }

    }


            public  void ustMenu(Student ogr1) {
             System.out.println("yapmak istediğiniz işlemi seciniz");

            if(getKalanKrediSayisi()>=getDersMinKrediSayisi()) {
                System.out.println("Ders eklemek için--> 7  giriniz");
            }
            if (alinanDerslerinKredileri.size()!=0){
                System.out.println("Ders bırakmak için-->8\n giriniz");
                System.out.println("Ders seçme işlemini Bitirmek için -->9\n Giriniz");
            }else System.out.println("Ders seçme işlemini Bitirmek için -->9\n Giriniz");
            kullaniciTercihi=sc.nextInt()-1;
            setKullaniciTercihi(kullaniciTercihi);
            if (getKullaniciTercihi() == 6) {
                dersEkle(ogr1);
            }else if(getKullaniciTercihi()==8){
                derSeciminiBitir(ogr1);
            }
    }
    public void alinanDersler(Student ogr1){
        System.out.println("Aldığınız dersler             Ders Kredisi");
        System.out.println("===========================================");
        for(int i=0; i<alinanDersler.size(); i++){
            System.out.printf((i+1)+")"+"%-15.10s%17.2s\n",alinanDersler.get(i),alinanDerslerinKredileri.get(i));
        }
        System.out.println("======================================================");
        System.out.println("Aldığınız Toplam Kredi:        "+alinanKrediSayisi+"\nAlabileceğiniz Maxsimum kredi: "+kalanKrediSayisi+"\n");
        ustMenu(ogr1);
    }
public void dersBirak(Student ogr1){
        while (alinanDersler.size() != 0 && getKullaniciTercihi()!=8){
            System.out.println("Bırakabileceğiniz dersler ve ders kredileri");
            System.out.println("=====================================================");
            for(int i=0; i<dersler.size(); i++){
                System.out.println(i + ")" + alinanDersler.get(i) + " dersi " + alinanDerslerinKredileri.get(i) + " kredi. " + alinanDersler.get(i) + " dersini bırakmak  için--> " + i + " giriniz.");
            }
            if (getKalanKrediSayisi()>=getDersMinKrediSayisi()) System.out.println( "Ders eklemek için -->7");
            System.out.println("Ders seçme işlemini Bitirmek için -->9\n Giriniz");
            kullaniciTercihi=sc.nextInt()-1;
            setKullaniciTercihi(kullaniciTercihi);
            if(getKullaniciTercihi()==6){
                dersEkle(ogr1);break;
            }else if (getKullaniciTercihi()==8){
                derSeciminiBitir(ogr1);break;
            }else {
                alinanKrediSayisi-=alinanDerslerinKredileri.get(getKullaniciTercihi());
                kalanKrediSayisi=maxKrediSayisi- alinanKrediSayisi;
                dersler.add(alinanDersler.get(getKullaniciTercihi()));
                derslerinKredileri.add(alinanDerslerinKredileri.get(getKullaniciTercihi()));
                alinanDersler.remove(alinanDersler.get(getKullaniciTercihi()));
                alinanDerslerinKredileri.remove(alinanDerslerinKredileri.get(getKullaniciTercihi()));
                dersMinKrediSayisi=Collections.min(derslerinKredileri);
                setDersMinKrediSayisi(dersMinKrediSayisi);
                alinanDersler(ogr1);
            }
        }
}
                    public void derSeciminiBitir(Student ogr1){
                        System.out.println("\nAd soyad: "+ogr1.getAd()+ "Öğrenci No: "+ ogr1.getNo()+ "\n Ders seçme işlemini tamamladınız.\n");
                        if(alinanKrediSayisi>0){
                            System.out.println("Aldınız dersler     Ders Kredisi");
                            System.out.println("===========================================");
                            for (int i=0; i<alinanDersler.size(); i++) {
                                System.out.printf((i+1)+")"+"%-15.10s%17.2s\n",alinanDersler.get(i),alinanDerslerinKredileri.get(i));
                            }
                            System.out.println("===============================================");
                            System.out.println("Aldığınız Toplam Kredi:         "+alinanKrediSayisi);
                            System.exit(0);
                        }
                    }

}
