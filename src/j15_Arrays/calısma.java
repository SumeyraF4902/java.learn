package j15_Arrays;

import java.util.*;

public class calısma {
   static ArrayList<String> gunler= new ArrayList<>(List.of("Pazartesi","salı","carşamba","Perşembe","cuma","cumartesi","pazar"));
    static ArrayList<Integer>gunlukKazanclar= new ArrayList<>();
    static int ortalama=0;
    static int toplam;
    public static void main(String[] args) {

        // Task bir listte istenen sayının varlığı kontrol eden code create ediniz
            Scanner sc= new Scanner(System.in);

        int gun=0;
        while (gun<7){
            System.out.println("bakkal efendi  "+gunler.get(gun)+ "gününün kazancını giriniz");
            gunlukKazanclar.add(sc.nextInt());
            toplam+=sc.nextInt();
            gun++;
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();
        System.out.println("haftanın cirosu  "+ toplam);
        System.out.println("haftanın ortalaması: "+getOrtalamaKazanc());
        System.out.println("ortalama üsüt günler  "+getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalama altı günler  "+getOrtalamaninAltindaKazancGünleri());
    }
    public static double getOrtalamaKazanc() {
         double ortalama=toplam/7;

       return ortalama;
    }
            private static List<String> getOrtalamaninUstundeKazancGünleri(){
       ArrayList<String>ortalamaUstu= new ArrayList<>();
                for(int i=0; i< gunlukKazanclar.size(); i++){
                     if(gunlukKazanclar.get(i)>ortalama){
                         ortalamaUstu.add(gunler.get(i));
                     }

        }
                return ortalamaUstu;

            }
            private static List<String> getOrtalamaninAltindaKazancGünleri(){
                ArrayList<String>ortalamaAltı= new ArrayList<>();
                for(int i=0; i< gunlukKazanclar.size(); i++){
                    if(gunlukKazanclar.get(i)<ortalama){
                        ortalamaAltı.add(gunler.get(i));
                    }

                }
return ortalamaAltı;
            }
    }














