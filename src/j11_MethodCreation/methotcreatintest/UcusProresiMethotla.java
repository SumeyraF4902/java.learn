package C11_MethodCreation.methotcreatintest;

import java.util.Scanner;

public class UcusProresiMethotla {
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
                } else if (rota.equals("C") && yas < 12) {
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
    }public static void ciftYon() {
                     if (rota.equals("B")){
                         if(yas > 65) {
                             System.out.println("65 yas ustu B sehrine cift  yon ucus bilet fiyatınız :  " + ((bSehri * 0.7 * 0.20) + " $"));
                         } else  if ( yas >= 12 && yas < 24) {
                             System.out.println("12-24 yas arası  B sehrine cift   yon ucus bilet fiyatınız :  " + (bSehri * 0.9 * 0.20) + " $");
                         } else if ( yas < 12) {
                             System.out.println("12 yas altı  B sehrine cift  yon ucus bilet fiyatınız :  " + (bSehri * 0.5 * 0.20) + " $");
                         }else System.out.println("%20 indirim hakkınız bulunuyor odemeniz gereken tutar="+(bSehri*0.80)+"$");
                     } else if (rota.equals("C") ){
                     if(yas > 65) {
                         System.out.println("65 yas ustu B sehrine cift   yon ucus bilet fiyatınız :  " + ((cSehri * 0.7 * 0.20) + " $"));
                     }else if (yas >= 12 || yas < 24) {
                             System.out.println("12-24 yas arası  B sehrine cift   yon ucus bilet fiyatınız :  " + (cSehri * 0.9 * .20) + " $");
                         } else  if (yas < 12) {
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
                break;}
    }
    }


