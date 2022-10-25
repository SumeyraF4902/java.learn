package j16_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ödev_Bakkal {
    static ArrayList<String> gunler= new ArrayList<>(Arrays.asList("Monday","Tuesday","Wendesday","Thursday","Friday","Saturday","Sunday"));// 1.adım
    static ArrayList<Double>gunlukKazanclar= new ArrayList<>();// 2 adım
    static Scanner sc= new Scanner(System.in);
    static double haftaCirosu=0;
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
         int gun=0;
         while (gun<7){// 3. adım
             System.out.println("agam hele "+ gunler.get(gun)+ " günün hasılatını gir");
             double gunKazancı=sc.nextDouble();
             gunlukKazanclar.add(gunKazancı);
             haftaCirosu+= gunKazancı;
             //haftaCirosu+=gunlukKazanclar.get(gunlukKazanclar.size()-1);
             gun++;

         }
        getOrtalamaninAltindaKazancGünleri();
        getOrtalamaninUstundeKazancGünleri();
         getOrtalamaKazanc();
        System.out.println("haftanın cirosu:"+haftaCirosu);
        System.out.println("haftanın ortalaması:"+getOrtalamaKazanc());
        System.out.println("ortalamanın altında kazanç günler"+getOrtalamaninAltindaKazancGünleri()+" ");
        System.out.println("ortalamanın üstünde kazanç günler"+getOrtalamaninUstundeKazancGünleri()+" ");

    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaAltıGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {//günlük hasılat döngüsü
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {//günlük hasılat haftanın ortalaması ile kontrol
                ortalamaAltıGun += gunler.get(i);//ortalamanın üstünde olan gün ortalama üstü gene eklendi
            }

        }
        return ortalamaAltıGun;
    }

    private static String getOrtalamaninUstundeKazancGünleri() {// 5 adım
        String ortalamaUstüGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {//günlük hasılat döngüsü
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {//günlük hasılat haftanın ortalaması ile kontrol
                ortalamaUstüGun += gunler.get(i);//ortalamanın üstünde olan gün ortalama üstü gene eklendi
            }

        }
        return ortalamaUstüGun;
    }
    private static double getOrtalamaKazanc() {// 4. adım
        double ortalama = haftaCirosu / 7;
        return ortalama;
    }
}
