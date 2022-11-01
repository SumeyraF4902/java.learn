package j22_DateTime.GirisProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {
    //public static void giris(){ bu tanımlama ile method static olduğu için classmane ile call edildi.
    public void giris(){// bu tanımlama ile method non static olduğu için obj ile call edilir.
        Scanner sc=new Scanner(System.in);
        Kayıt yeniKayıt=new Kayıt();// Kayıt clasa erişim için parametresiz contracter ile yenikayıt obj si üretildi.
        //Kayıt classdan obje olmadan method call etmek için methotlat static yapılırsa hiç üstteki açılmadan className ile  çağrılabilir
        ArrayList<Kullanıcı> kisi=new ArrayList<>();// Kullanıcı classdan üretilen obj tutulacağı boş liste.

        boolean cıkılsınMı=true;//while döngü için şart tanımlandı
        while (cıkılsınMı) {
            System.out.println("Agam ne istirsen\n 1->Kullanıcı Kayıt al\n->2 sanslı kişi Bul\n-->3 Listele\n-->4 Cıkış\n ");
            int tercih= sc.nextInt();
            switch (tercih) {
                case 1:
                    kisi= yeniKayıt.kayıtAl();//kayıt clasdan yeni kayıt obj ile kayıtAl method call edildi.
                    break;
                case 2:
                    yeniKayıt.sanslıKullanıcı(kisi);
                    break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:cıkılsınMı=false;
                    break;
                default:
                    System.out.println("Ağam adam gibi birşeyler giriniz");

            }
        }
    }


    }

