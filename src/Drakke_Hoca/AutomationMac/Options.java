package Drakke_Hoca.AutomationMac;

import java.util.Scanner;



public class Options {
    /*Gelen talebe göre müşterimizin kullanmış olduğu yiyecek-içecek makinesinin yazılım alt yapısı yapılacaktır.  Müşterimizin talepleri doğrultusunda user makineden yiyecek-içeçek alabilmeli, para üstü alabilmeli, bakiyesine para ekleyebilmelidir.
Üç farklı class oluşturulmalıdır.
Class:
1	Urun
2	Options
3	Runner
Urun Class ı Nitelikler:
•	1kraker=2.5;
•	2cips=2.2;
•	3cocaCola=2.2;
•	4fanta=2.0;
•	5su=1.0;
•	6cay=1.5;
•	7filtreKahve=1.99;
•	8productNum;
•	9price;
•
Urun Class ı Metotları:
•	toString()  → Konsola ilgili ürünlerin fiyatları ile birlikte gösterebilecek bir metot oluşturunuz.

Options Class ı Metotları
•	select(Urun product) →  Parametre olarak Urun classından oluşturulan bir obje alınarak, ilgili ürünlere göre seçim yapması beklenir.
 Kullanıcı seçim yapabilmek için öncelikle ürünleri görmelidir.
•	balance(double price, double accountBalance, Urun product) → Parametre olarak, urunun fiyatı, mevcut bakiye,
 Urun classından oluşturulmuş bir obje alınarak satın alınmak istenen ürünün fiyatı kullanıcının bakiyesinden az ise
  ekleme yapmasına olanak sağlayan ve ya ekleme yapmak istemiyorsa programdan çıkışını sağlayabilecek bir metot oluşturunuz.
•	purchase(double price, double accountBalance, Urun product)-->  Parametre olarak, urunun fiyatı,
 mevcut bakiye, Urun classından oluşturulmuş bir obje alınarak, bakiye satın alınmak istenen üründen daha fazla
 ve ya eşit ise satın alınma işlemi yapılmalı, kullanıcıya kalan bakiye gösterilmeli ve başka bir ürün alınıp alınmak
 istenmediği sorularak ilgili aksiyonlar alınmalıdır.  Kullanıcı başka bir ürün satın almak istiyorsa tekrardan ürünlerin
 gösterildiği metoda gitmelidir.
Runner Class ı Nitelikleri;

accountBalance = 3 cebindeki parası
ANALİZ EDİLİŞ;
    Urun urun= new Urun();
    1) Kullanıcıya ürünleri göstermeliyiz--->urun clasında bir obj.toString()
    2)Scanner---> Scanner clasından bir obje create ediniz (prodactNum set edilmeli)
    3) Loop --> Do-While Loop --> Kullanıcı 0 -7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
             1 den küçük ve 7 den büyük ise döngü devam etmeli ve kullanıcı1-7 arasında bir seçim yapmaya farce(zorlanmalı) edilmeli
    4) Kullanıcı 0 basarak menüden çıkabilmeli. Yine bekleriz yazısı konsola yazdıralım
    5) Kullanıcıdan prodac number(1-7 arası rakam(kullanıcı 1 rakamını seçerse kraker,
            2 rakamını secerse cips etc...(esaytın)) switch case yapısı kurmalıyız
    6) switch benden prodacnumber. alınan prodacnum a göre ilgili ürünün price(ücreti) alınmalı. urun.getKraker(), urun.getcips(),urun.getcay() etc....
            (price set edebilmek için ben price setPrice() methodunu kullanmalıyım...)
     7) return olarak bana price dönmeli. return getPrice() (double)
     */

    public double select(Urun urun){

        System.out.println("****Ürünler ve Fiyatları***");
        System.out.println(urun.toString());// kullanıcıya ürünleri göstermiş oldum
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Lütfen 1 ile 7 arası bir rakam girerek almak istediğiniz ürünü seçiniz.");
        System.out.println("Çıkış için '0' ");
        urun.setProductNum(scanner.nextInt());//kullanıcıdan aldığım değeri productNum a değer olarak atadım.
        if (urun.getProductNum()<0  || urun.getProductNum()>7){
            System.out.println("Lütfen belirtilen aralıkta bir rakam giriniz");
        }

        }while(urun.getProductNum()<0 || urun.getProductNum()>7);// true olduğu sürece çalışır(0 dan büyük ve 7 dahil 7 den küçük olduğu sürece çalışır 0,1,2,3,4,5,6,7)
        switch(urun.getProductNum()){
            case 0:
                     System.out.println("Yine bekleriz");
                     System.exit(0); break;
            case 1:  urun.setPrice(urun.getKraker());break;
            case 2:  urun.setPrice(urun.getCips());break;
            case 3:  urun.setPrice(urun.getCocaCola());break;
            case 4:  urun.setPrice(urun.getFanta());break;
            case 5:  urun.setPrice(urun.getSu()); break;
            case 6:   urun.setPrice(urun.getCay()); break;
            case 7:    urun.setPrice(urun.getFiltreKahve()); break;
        }

        return urun.getPrice();
    }
    public double balance(double price, double accountBalance, Urun urun){

        double fonlama;
       /* try {
            System.out.println("Helloooo.....");//Run time error--> RTE çalışınca konsolda verir.

        }catch (Exception e){
            System.out.println("Catchhhhh.....");
        }*/

        while(accountBalance<price){// kişinin bakiyesi (yatırdığı para) küçükse alacağı üründen;
            Scanner scanner= new Scanner(System.in);
            System.out.println("Yeterli bakiyeniz bulunmamaktadır... Ekleme yapmak istiyor musunuz (Y/N");
            char confirm=scanner.next().toLowerCase().charAt(0);

            if(confirm=='n'){
                System.out.println("Mevcut bakiyeniz : "+ accountBalance);
                System.out.println("Yine bekleriz...");break;
            }else{
                System.out.println("ne kadar ekleme yapmak istiyorsunuz");
                fonlama=scanner.nextDouble();
                accountBalance=accountBalance+fonlama;
                System.out.println("Yeni bakiyeniz: "+ accountBalance);
                price=select(urun);
            }

        }
        return accountBalance;
    }
    public void purchase(double price, double accountBalance, Urun urun){
       while(accountBalance>=price){
           accountBalance=accountBalance-price;
           System.out.println("Kalan bakiye: "+ accountBalance);

           Scanner scanner= new Scanner(System.in);
           System.out.println("Başka bir ürün almak istiyor musunuz (Y/N");
           char confirm=scanner.next().toLowerCase().charAt(0);
           if (confirm=='n'){
               System.out.println("Yine Bekleriz");break;

           }else {
               urun.setPrice(select(urun));
               accountBalance=balance(urun.getPrice(),accountBalance,urun);
           }


       }

    }

}
