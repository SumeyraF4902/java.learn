package Projeler.TEAM07;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    String kisiTuru;
    ArrayList<Ogrenci> ogrenciler= new ArrayList<>();
    ArrayList<Ogretmen> ogretmenler= new ArrayList<>();
     Scanner sc= new Scanner(System.in);


    public void anaMenu(){
        System.out.println("\uD83D\uDC68"+"\uD83D\uDC69"+"Öğretmen/Öğrenci Giriş Paneli"+"\uD83D\uDC66"+"\uD83D\uDC67");
        System.out.println("İşlem yapmak istediğiniz kişi türünü seciniz:\n 1-Öğretmen girişi  \n2-Öğrenci girişi\n 3- Çıkış");
        int secim=sc.nextInt();
        switch (secim) {
            case 1:
                kisiTuru="Öğretmen";
                islemleri();
            case 2:
                kisiTuru="Öğrenci";
                islemleri();
            case 3:
                System.out.println("Çıkışınız yapılmıştır");break;
            default:
                System.out.println("yanlış işlem yaptınız");
                anaMenu();


        }

    }

    private void islemleri() {
        System.out.println("Yapılacak işlemi seciniz:  \n 1-Ekleme\n2-Arama\n3-Listeleme\n4-Silme\n5-Ana Menü\n6-Çıkış");
        int secim=sc.nextInt();
        switch (secim) {
            case 1:
                ekleme();
                anaMenu(); break;
            case 2:
                Arama();
                anaMenu(); break;
            case 3:
                Listeleme();anaMenu(); break;
            case 4: Silme();
                anaMenu(); break;
            case 5:anaMenu(); break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Hatalı giriş yaptınız "+"\uD83D\uDE12");
            islemleri();

        }

    }

    private void Silme() {
        switch (kisiTuru){
            case "Öğretmen":
                System.out.print("Silinece öğretmenin sicil nosunu giriniz:");
                String ogretmenSicilNo=sc.nextLine();
                int silinecekindex=-1;
                for(int i=0; i<ogretmenler.size(); i++) {
                    if (ogretmenSicilNo.equals(ogretmenler.get(i).getSicilNo())) {
                        silinecekindex = i;
                        break;
                    }
                }
                if(silinecekindex !=-1){
                    ogretmenler.remove(silinecekindex);
                    System.out.println("Başarıyla silindi "+"\uD83D\uDC83");
                }else{
                    System.out.println("Aradığınız öğretmenin bulunamadı");
                }
                break;
            case "Öğrenci":
                System.out.print("Silinece Öğrencinin numarasını giriniz");
                int silinecekOgrenciNo= sc.nextInt();
                int silmeIndex=-1;// listede yoksa - veriyordu onun icin - adadık
                System.out.print(ogrenciler.removeIf(t-> t.okulNo==(silinecekOgrenciNo))?"Öğrenci silindi":"Silinecek öğrenci bulunamadı" );// lambda ile ikinci yol

    }}

    private void Listeleme() {
        switch (kisiTuru){
            case"Öğretmen":
                System.out.println("Öğretmen Listesi");
                for (int i=0; i<ogretmenler.size(); i++) {
                    System.out.println("********************************");
                    System.out.println("Öğretmenin adı soyadı: "+ ogretmenler.get(i).getAdSoyad());
                    System.out.println("Öğretmenin yaşı: "+ ogretmenler.get(i).getYas());
                    System.out.println("Öğretmenin sicil nosu: "+ogretmenler.get(i).getSicilNo());
                    System.out.println("Öretmenin Branşı: "+ogretmenler.get(i).getBrans());
                    System.out.println("Öğretmenin kimlik nosu:"+ ogretmenler.get(i).getKimlikNosu());
                    System.out.println("*******************************************");
                    // 2 YOL
                    System.out.println(ogretmenler.toString());
                }

            case "Öğrenci":
                System.out.println("Öğrenci Listesi");
                for(int i=0;i<ogrenciler.size(); i++){
                System.out.println("*********************");
                System.out.println(i+1+" öğrenci :");
                    System.out.println("Adısoyadı:" +ogrenciler.get(i).getAdSoyad());
                    System.out.println("Okul No:"+ ogrenciler.get(i).getOkulNo());
                    System.out.println("Sınıfı:"+ ogrenciler.get(i).getSınıfNo());
                    System.out.println("Yaşı:"+ ogrenciler.get(i).getYas());
                    System.out.println("Öğrencinin kimlik nosu:"+ ogrenciler.get(i).getKimlikNosu());
                    System.out.println("*******************************");
        }}
    }

    private void Arama() {
        switch (kisiTuru){
            case "Öğretmen":
                System.out.print("Arananak öğretmenin sicil nosunu giriniz:");
                sc.nextInt();
                String ogretmenSicilNo=sc.nextLine();
                int bulmaindex=-1;
                for(int i=0; i<ogretmenler.size(); i++) {
                    if (ogretmenSicilNo.equals(ogretmenler.get(i).getSicilNo())) {
                        bulmaindex = i;
                        break;
                    }
                }
                if(bulmaindex==-1){
                    System.out.println("Aradığınız öğretmen burada bulunmuyor");
                }else{
                    System.out.println("Aradığınız öğretmenin adı soyadı:"+ogretmenler.get(bulmaindex).getAdSoyad());
                }
                break;
            case "Öğrenci":
                System.out.print("Aranacak Öğrencinin numarasını giriniz");
                sc.nextInt();
                String arananOgrenciNo= sc.nextLine();
                int bulmaIndex=-1;// listede yoksa - veriyordu onun icin - adadık
                for (int i = 0; i < ogrenciler.size(); i++) {
                    if(arananOgrenciNo.equals(ogrenciler.get(i).getOkulNo())) {
                        bulmaIndex=i;
                        break;
                    }
                }
              if  (bulmaIndex==-1){
                  System.out.println("Aradığınız öğrenci numarasına ait birisi bulunamadı "+" \uD83D\uDE2C");
              }else{
                  System.out.println("Aradığınız Öğrencinin Ad ve Soyadı :"+ogrenciler.get(bulmaIndex).getAdSoyad());// bulma indexi -1 değilse bu öğrenciyi yazdırdık
        }}
    }

    private void ekleme() {
        if (kisiTuru.equals("Öğrenci")){
            Ogrenci ogr= new Ogrenci();
            System.out.print("Adı ve Soyadı giriniz:");
            sc.next();
            ogr.setAdSoyad(sc.nextLine());
            System.out.print("Yaşı giriniz:");

            try { int yas= sc.nextInt();
                ogr.setYas(yas);

                System.out.println("Kimlik numarasını giriniz");
                sc.next();
                ogr.setKimlikNosu(sc.nextLine());
                System.out.println("Sınıfı giriniz");
                ogr.setSınıfNo(sc.nextLine());
                ogr.getOkulNo();
                System.out.println("Ekleme işleminiz başarıyla gerçekleştirildi");


            }catch (Exception e) {
                System.out.println("hatalı giriş yapyınız "+ "\uD83D\uDE12");

            }


        }else {
            Ogretmen ogtrm= new Ogretmen();
            System.out.print("Adı ve Soyadı giriniz:");
            sc.nextLine();
            ogtrm.setAdSoyad(sc.nextLine());
            System.out.print("Yaşı giriniz:");
            try { int yas= sc.nextInt();
                ogtrm.setYas(yas);

                System.out.println("Kimlik numarasını giriniz");
                sc.next();
                ogtrm.setKimlikNosu(sc.nextLine());
                System.out.println("Branşı giriniz");
                ogtrm.setBrans(sc.nextLine());
                System.out.println("Sicil nosunu giriniz");
                ogtrm.setSicilNo(sc.nextLine());
                System.out.println("Ekleme işleminiz başarıyla gerçekleştirildi");


            }catch (Exception e) {
                System.out.println("hatalı giriş yapyınız "+ "\uD83D\uDE12");

            }
        }


    }

}