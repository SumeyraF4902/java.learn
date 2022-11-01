package j22_DateTime.GirisProjesi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı> kullaniciKisiler=new ArrayList<Kullanıcı>();//kullanıcı class dan oluşturulacak obj. tutulacağı boş liste.
    // Task 2. stepp
    public ArrayList<Kullanıcı> kayıtAl(){//aray listi return etmek için void yerine
        // ArrayList yaptık kullanıcı classtan obj üretmek için cons. a gereken name ve kayıt zamanını alır. oluşan obj listeye ekler.
        Scanner sc=new Scanner(System.in);
        System.out.println("Adınızı giriniz:");
        String ad=sc.nextLine();// kullanıcıdan obj için name alındı
        Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());// K1 obj si name kullanıcıdan kayıt zamanı LocalDateTime.now buradan alacak
        kullaniciKisiler.add(k1);//oluşturulan k1 obj liste eklendi.

        return kullaniciKisiler;//kullanıcı kişiler listi method cıktısı return olarak tanımlandı.

    }// 3 Stepp
    public void sanslıKullanıcı(ArrayList<Kullanıcı>kllObj){//kullanıcı listindedi objerin kayıt  zamanını 10 saniyeden az olup olmamasına göre şanslı kullanıcıyı print edecek
        for(Kullanıcı k:kllObj){//kullanıcı classdan kayıtal() method ile üretilip kullanıcıKişi listine eklenen objeler döngüye alındı.
            if(k.kayıtZamanı.getSecond()<=10){//döngüye giren her bir kullanıcı objesinin kayıt zamanı datasındaki saniye verisi 10 dan küçük olma şartı.
                System.out.println(k.name+"şanslı kişisiniz 5 kilo bal kazandınız:) sisteme giriş zamanın:"+k.kayıtZamanı);
            }else   System.out.println(k.name+"şanslı kişi değilsiniz:( sisteme giriş zamanın:"+k.kayıtZamanı);
        }
    }public  void listele(ArrayList<Kullanıcı>kllObj){
        System.out.println(kllObj);//objeleri kullanıcı classta ki toString print eder
    }
}
