package day08.Gamze_Hanım;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OyunaGiris {
   static ArrayList<Integer> paraListesi= new ArrayList<>();
   static Kutular kutular=new Kutular();
   static Scanner sc =new Scanner(System.in);
   static int kutuNumaram;
   static int kutumdakiPara;

    public static void main(String[] args) {

        paraListesi.add(1);
        paraListesi.add(10);
        paraListesi.add(500);
        paraListesi.add(1000);
        paraListesi.add(5000);
        paraListesi.add(10000);
        paraListesi.add(50000);
        paraListesi.add(100000);
        paraListesi.add(250000);
        paraListesi.add(500000);
        Collections.shuffle(paraListesi);// para listesini karışrır demek
        kutularıOluştur();
        System.out.println("** YARIŞMAMIZA HOŞGELDİNİZ ");
        System.out.println("ŞANSINIZ BOL OLSUN BAŞARILAR DİLERİM");
        System.out.println("Lütfen kutunuzu seçiniz");
        kutuNumaram=sc.nextInt();
        kutumdakiPara=paraListesi.get(kutuNumaram-1);
        System.out.print("kutu numaranız:"+kutuNumaram);
        kutular.secilenKutuyuListedenKaldir(kutuNumaram);
        kutuSecmeActırma();


    }

    private static void kutuSecmeActırma() {
        System.out.println("\n Kalan kutular : "+kutular.acilmamisKutulariGoster());
        System.out.println("\n Hangi kutuyu açtırmak istersiniz");
        int secim= sc.nextInt();
        kutular.kutuActir(secim);
        if(kutular.kalanKutuSayisiniAl()==7 ||kutular.kalanKutuSayisiniAl()==4|| kutular.kalanKutuSayisiniAl()==1){
            System.out.println("Teklif   " + kutular.yapimcininTeklifAl());
            System.out.println("Kabul ediyor musun EVET=1,  HAYIR =2 BASINIZ");
            int kabul=sc.nextInt();
            if(kabul==1){
                System.out.println(" Oyun Bitti kazandığınız tutar: "+ kutular.yapimcininTeklifAl());
                System.out.println("Kutundaki para :"+kutumdakiPara+ "Tl vardı");

            }else kutuSecmeActırma();
        }else {
            if(kutular.kalanKutuSayisiniAl()>0){
                kutuSecmeActırma();
            }else {
                System.out.println("oyun bitti kutundaki para:"+kutumdakiPara);
            }
        }
    }

    private  static void kutularıOluştur(){
        for (int i=0; i<10; i++) {
            Kutu kutu= new Kutu();
            kutu.setKutuNumarası(i+1);// 1 den 10 kadar numara verecek i nin ilk değeri 0 olduğu için ekrana 1 yazdırsın diye i+1 dedik
            kutu.setParaMiktarı(paraListesi.get(i));
            kutular.kutuEkle(kutu);
           // System.out.println("Kutu no: " +(i+1)+"  Para miktarı : "+ paraListesi.get(i));
        }

    }
}
