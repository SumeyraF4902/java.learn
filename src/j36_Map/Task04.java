package j36_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task04 {
    /*                  KELİME ANALİZİ
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 4. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */

    static HashMap<String,Integer> kelimeListesi= new HashMap<>();// 1. adım
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("metin giriniz");// 2 adım metin girilecek
        String metin=sc.nextLine();
        String  [] cumle=metin.split("\\.");// cümleleri elde ettik.
        System.out.println(Arrays.toString(cumle));

        for (int i=0; i<cumle.length; i++){
            String kelimeler[]=cumle[i].trim().split(" ");//kelimeleri elde ettik sonda ve baştaki boşlukları kaldırdık.
            System.out.println(Arrays.toString(kelimeler));

// 3 ADIM
          for(int j=0; j<kelimeler.length; j++){
          if(kelimeListesi.get(kelimeler[j])==null){
              kelimeListesi.put(kelimeler[j],1);

              }else{ int sayi=kelimeListesi.get(kelimeler[j]);
              kelimeListesi.put(kelimeler[j],sayi+1);
          }
          }
        }// 4 ADIM
for(String eleman: kelimeListesi.keySet() ){// 4.ADIM
    System.out.println(eleman+" : "+kelimeListesi.get(eleman));
}
        for(Integer w:kelimeListesi.values()){//value
            System.out.print(w+" : "+kelimeListesi.get(w));
        }
    }
}
