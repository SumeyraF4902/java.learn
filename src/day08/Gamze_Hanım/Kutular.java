package day08.Gamze_Hanım;

import java.util.ArrayList;
import java.util.List;

public class Kutular {

   private List<Kutu> kutuListesi= new ArrayList<>();

    public void kutuEkle(Kutu gelenKutu){
        kutuListesi.add(gelenKutu);

    }
       public int  kalanKutuSayisiniAl(){

        return kutuListesi.size();
    }
       public int  kutulardakiToplamParaMiktari(){
        int toplamPara=0;
        for(Kutu kutu: kutuListesi){
            toplamPara+=kutu.getParaMiktarı();
        }
        return toplamPara;
    }
        public void secilenKutuyuListedenKaldir(int kutuNumarasi){
        for(Kutu kutu : kutuListesi){
            if(kutuNumarasi==kutu.getKutuNumarası()){
                kutuListesi.remove(kutu);break;
            }
        }
    }
       public String acilmamisKutulariGoster(){
        String acılmamıslar="";
        for(Kutu kutu : kutuListesi){
            acılmamıslar+=" "+kutu.getKutuNumarası();

}        return  acılmamıslar;
    }
        public void kutuActir(int kutuNumarasi){
        for(Kutu kutu : kutuListesi){
            if(kutuNumarasi==kutu.getKutuNumarası()){
                System.out.println(" Kutudaki para miktarı :"+kutu.getParaMiktarı());
                kutuListesi.remove(kutu);break;
            }

        }
    }
        public int yapimcininTeklifAl(){

        return kutulardakiToplamParaMiktari()/4;
    }
}
