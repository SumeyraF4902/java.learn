package Projeler.Kitapcı_Projesi;

import java.util.ArrayList;

public class KitapEkle {
    static int count=1000;
   public static   ArrayList<EklenenKitaplar> liste=new ArrayList<>();
     public void kitapEkle() {
        /* boolean flag = true;
         do {
             Scanner sc = new Scanner(System.in);
             System.out.println("Lütfen kitap adını, yazarınıve fiyatını giriniz\n kitap ekleden çıkmak için 0 'a basınız:");
             String kitapAd = sc.nextLine();
             if (kitapAd.equals("0")) {
                 flag = false;
                 break;
             }
             String yazarAdı = sc.nextLine();
             int fiyat = sc.nextInt();
        EklenenKitaplar eklenenKitap=new EklenenKitaplar(count,kitapAd,yazarAdı,fiyat);
        liste.add(eklenenKitap);
             System.out.println("kitaplar başarıyla eklendi");
             count++;

         }while (flag);
         return liste;
     }
     public static void kitapNoIleKitap(){
         boolean kitapVarmı = true;
         do {
             Scanner sc = new Scanner(System.in);
             System.out.println("Kitap numarası giriniz:\n Kitap no ile sorgulamadan çıkmak için 0 'a basınız");
             int kitapNu=sc.nextInt();
             if (kitapNu==0) {
                 kitapVarmı = false;break;
             }
             //String a= sc.nextLine();//Dummy
             boolean KitapVarmı=false;
             for(EklenenKitaplar kitap:liste){
                 if (kitap.kitapNo==kitapNu){
                     System.out.println("kitap No:"+kitap.kitapNo+", Kitap Adı:"+kitap.kitapAdı+",Yazar Adı:  "+kitap.yazari+",fiyatı: "+kitap.fiyati);
                     kitapVarmı=true;
                 }


             }if (kitapVarmı==false){
                 System.out.println("lütfen geçerli bir kitap numarası giriniz:");
             }
         }while (true);
     }
     public static void bilgiIleKitap(){
         Scanner sc = new Scanner(System.in);
         do{
             String yazar1=" ";
             String ykitap=" ";
             int fiyat=0;
             boolean flag=true;
             while (flag==true){
                 System.out.println(""+"Ne sorgulamak istiyorsun?\n "+" Yazar Adı için  :1\n"+
                         "Kitap adı için:  2\n"+ "Kitap fiyatı için :3 'e basın ");
                 String sorgu= sc.nextLine();
                 switch (sorgu){
                     case "1": System.out.println("Lütfen yazar adı giriniz:");
                     yazar1=sc.nextLine();
                     flag=false;break;
                 }
             }
         }*/
     }
}
