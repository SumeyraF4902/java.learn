package j11_MethodCreation.methotcreatintest;

import java.util.Scanner;

public class UcusProjesiMethod {


     /*
        A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        Bilet tarifesi:
        km birim fiyati : 0.10$
        yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
        12 ve 24 yas arasindaysa 10% indirim,
        65 yasindan buyukse 30% indirim,
        bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */


    static double ucret;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Gitmek istefiginiz sehri secinit \n1-> B Sehri \n2-> C sehri\n3-> D Sehri");
        int sehirSecim = tryCatch(1,3);
        System.out.println("yasinizi giriniz: ");
        int yas = tryCatch(0,100);
        System.out.println("Tek yön icin -> 1\nCIft yon icin -> 2");
        int yon = tryCatch(1,2);
        ucretHesapla(sehirSecim,yas,yon);

    }
    public static int tryCatch(int min, int max){
        System.out.println("Lütfen " + min + " ve " + max + " arasinda deger giriniz");
        int secim;
        while(true){
            try{
                secim = scan.nextInt();
                if(secim>=min && secim<=max){
                    break;
                }
                else throw new Exception();
            }
            catch(Exception e){
                System.out.println("Lütfen belirtilen degerler arasinda sayi giriniz!");
                scan.nextLine();
            }
        }
        return secim;
    }

    private static void ucretHesapla(int sehirSecim, int yas, int yon) {
        ucret= sehirSecim(sehirSecim)*yasIndirimi(yas)*yonIndirimi(yon);
        System.out.println(ucret);

    }

    private static double sehirSecim(int sehirSecim){
        if(sehirSecim==1)
            ucret=500*0.10;
        else if(sehirSecim==2)
            ucret = 700*0.10;
        else if (sehirSecim==3)
            ucret = 900*0.10;
        return ucret;
    }
    private static double yonIndirimi(int yon){
        if(yon==2)
            return 2*0.80;
        else return 1;
    }

    static double yasIndirimi(int yas){
        if(yas<=12)
            return 0.50;
        else if(yas<=24)
            return 0.90;
        else if(yas >=65)
            return 0.70;
        else
            return 1;
    }


    }
    // 2 yol
/*
static Scanner sc= new Scanner(System.in);
 static double bSehri=500*0.10;
static double cSehri=700*0.10;
static double dSehri=900*0.10;
 static int yas;
static String rota;
 public static void main(String[] args) {

     System.out.println("JavaAirlines'e hoş geldin AGAM :)  \nB C D rotasından birisini seçiniz : ");
     rota = sc.next().toUpperCase();//rota verisi alındı
     System.out.println("agam ucus yonu için\ntek yon -> 1\ncift yon -> 2\n seçiniz");
     int ucusYonu = sc.nextInt();
     System.out.println("agam yasını gir :");
     yas = sc.nextInt();//yas verisi alındı
     secim1(ucusYonu);
 }

         public static void tekYon(){
         if (rota.equals("B")) {
             if(yas>65) {
                 System.out.println("65 yas ustu B sehrine tek  yon ucus bilet fiyatınız :  " + ((bSehri * 0.7) + " $"));
             }else if (yas >= 12 && yas < 24) {
                 System.out.println("12-24 yas arası  B sehrine tek  yon ucus bilet fiyatınız :  " + (bSehri * 0.9) + " $");
             } else if (yas < 12) {
                 System.out.println("12 yas altı  B sehrine tek  yon ucus bilet fiyatınız :  " + (bSehri * 0.5) + " $");
             }else System.out.println("herhangi bir indirim hakkınız bulunmuyor odemeniz gereken tutar="+bSehri+" $");
         }else if(rota.equals("C")){
             if(yas>65) {
                 System.out.println("65 yas ustu B sehrine tek  yon ucus bilet fiyatınız :  " + ((cSehri * 0.7) + " $"));
             } else if (rota.equals("C") && yas >= 12 || yas < 24) {
                 System.out.println("12-24 yas arası  B sehrine tek  yon ucus bilet fiyatınız :  " + (cSehri * 0.9) + " $");
             }
            else if (rota.equals("C") && yas < 12) {
                 System.out.println("12 yas altı  B sehrine tek  yon ucus bilet fiyatınız :  " + (cSehri * 0.5) + " $");
             }else System.out.println("herhangi bir indirim hakkınız bulunmuyor odemeniz gereken tutar="+cSehri);

         }else if(rota.equals("D")){
             if(yas>65) {
                 System.out.println("65 yas ustu B sehrine tek  yon ucus bilet fiyatınız :  " + ((dSehri * 0.7) + " $"));
             }else if (yas >= 12 || yas < 24) {
                 System.out.println("12-24 yas arası  B sehrine tek  yon ucus bilet fiyatınız :  " + (dSehri * 0.9) + " $");
             }
             else if ( yas < 12) {
                 System.out.println("12 yas altı  B sehrine tek  yon ucus bilet fiyatınız :  " + (dSehri * 0.5) + " $");
             }else System.out.println("herhangi bir indirim hakkınız bulunmuyor odemeniz gereken tutar="+dSehri);
         }

     }
              public static void ciftYon() {
                  if (rota.equals("B")){
                      if(yas > 65) {

                          System.out.println("65 yas ustu B sehrine cift  yon ucus bilet fiyatınız :  " + ((bSehri * 0.7 * 0.20) + " $"));
                      } else  if ( yas >= 12 && yas < 24) {
                          System.out.println("12-24 yas arası  B sehrine cift   yon ucus bilet fiyatınız :  " + (bSehri * 0.9 * 0.20) + " $");
                      }
                      else if ( yas < 12) {
                          System.out.println("12 yas altı  B sehrine cift  yon ucus bilet fiyatınız :  " + (bSehri * 0.5 * 0.20) + " $");
                      }else System.out.println("%20 indirim hakkınız bulunuyor odemeniz gereken tutar="+(bSehri*0.80)+"$");
                  } else if (rota.equals("C") ){
                  if(yas > 65) {
                      System.out.println("65 yas ustu B sehrine cift   yon ucus bilet fiyatınız :  " + ((cSehri * 0.7 * 0.20) + " $"));
                  }else if (yas >= 12 || yas < 24) {
                          System.out.println("12-24 yas arası  B sehrine cift   yon ucus bilet fiyatınız :  " + (cSehri * 0.9 * .20) + " $");
                      }
                     else  if (yas < 12) {
                          System.out.println("12 yas altı  B sehrine cift   yon ucus bilet fiyatınız :  " + (cSehri * 0.5 * 0.20) + " $");
                      }else System.out.println("%20  indirim hakkınız bulunuyor odemeniz gereken tutar="+(cSehri*0.80)+ " $");

                  } else if (rota.equals("D") ){
                  if(yas > 65) {
                      System.out.println("65 yas ustu B sehrine cift   yon ucus bilet fiyatınız :  " + ((dSehri * 0.7 * 0.20) + " $"));
                  } else if ( yas >= 12 || yas < 24) {
                          System.out.println("12-24 yas arası  B sehrine cift   yon ucus bilet fiyatınız :  " + (dSehri * 0.9 * 0.20) + " $");
                      }
                     else if ( yas < 12) {
                          System.out.println("12 yas altı  B sehrine cift   yon ucus bilet fiyatınız :  " + (dSehri * 0.5 * 0.20) + " $");
                      }else System.out.println("%20 indirim hakkınız bulunuyor odemeniz gereken tutar="+(dSehri*0.80)+ " $");
                  } else System.out.println("agam henuz o gezegene ucuslar başlamadıd :( ");//rota kontrol dısı durum

              }

 public static void secim1(int x) {
     switch (x) {
         case 1:
             tekYon();
             break;

         case 2:
             ciftYon();
             break;
     }

 */


