package C11_MethodCreation.methotcreatintest;

import java.util.Scanner;

public class Task15_UcusProject {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine 700km D şehrine 900 km mesafededir.
    Bilet tarifesi:
    km birim fiyatı: 0,10 $
    yolcu 12 yaşından küçükse toplam fiyat %50 indirim,
    12 ve 24 yaş arasındaysa %10 indirim,
    65 yaşından büyükse %30 indirim,
    bilet gidiş dönüş alınırsa %20 indirim uygulayan bir app create ediniz*/


        /*System.out.println("A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine 700km D şehrine 900 km mesafededir.\n" +
                "    Bilet tarifesi: km birim fiyatı: 0,10 $");
        System.out.println("İndirim tarifesi:yolcu 12 yaşından küçükse toplam fiyat %50 indirim,\n" +
                "    12 ve 24 yaş arasındaysa %10 indirim,\n" +
                "    65 yaşından büyükse %30 indirim,\n" +
                "    bilet gidiş dönüş alınırsa %20 indirim ");
        System.out.println("Nereye uçmak istiyorsunuz  B şehri için B , C şehri için C, D şehri için D giriniz.");
        char yer = sc.next().toUpperCase().charAt(0);
        System.out.print("kaç yaşındasınız:");
        int age = sc.nextInt();
        if (age < 12) {
            if (yer == 'B') {
                System.out.println("ödenecek tutar:" + ((500 * 0.10) / 2) + "$ ");
            } else if (yer == 'C') {
                System.out.println("ödenecek tutar:" + ((700 * 0.10) / 2) + "$ ");

            } else System.out.println("ödenecek tutar:" + ((900 * 0.10) / 2) + "$ ");

        } else if (age>=12&& age<=24&& yer=='B') {
            System.out.println("ödenecek tutar:" + ((500 * 0.10) * 0.90) + "$ ");
        } else if (age>=12&& age<=24&& yer=='C') {
            System.out.println("ödenecek tutar:" + ((700 * 0.10) * 0.90) + "$ ");
        } else if (age>=12&& age<=24&& yer=='D') {
            System.out.println("ödenecek tutar:" + ((900 * 0.10) * 0.90) + "$ ");
        }   else if (age>65&& yer=='B') {
            System.out.println("ödenecek tutar:" + ((500 * 0.10) * 0.70) + "$ ");
        } else if (age>65&& yer=='C') {
            System.out.println("ödenecek tutar:" + ((700 * 0.10) * 0.70) + "$ ");
        } else if (age>65&& yer=='D') {
            System.out.println("ödenecek tutar:" + ((900 * 0.10) * 0.70) + "$ ");
        }else
            if (yer=='B'){
                System.out.println("ödenecek tutar:"+ (500*0.10));
            }else if (yer == 'C'){
                System.out.println("ödenecek tutar:"+ (700*0.10));
            }else System.out.println("ödenecek tutar:"+ (900*0.10));
*/
        static Scanner sc = new Scanner(System.in);//güneşimiz tüm gezegenler için ortak erişimde

        public static void main(String[] args) {

            System.out.println("JavaAirlines'e hoş geldin AGAM :)  \nB C D roıtasından birsini seçiniz : ");

            String  rota=sc.next().toUpperCase();//rota verisi alındı

            System.out.println("agam ucus yonu için\ntek yon -> 0\ncift yon -> 1\n seçiniz");
            int ucusYonu=sc.nextInt();//ucus yonu tek cift alındı

            System.out.println("agam yasını gir :");
            int yas=sc.nextInt();//yas verisi alındı


            double fiyatB=500*0.10;//A dan B ye ucus fiyatı
            double fiyatC=700*0.10;//A dan C ye ucus fiyatı
            double fiyatD=900*0.10;//A dan D ye ucus fiyatı

            if (rota.equals("B") ||rota.equals("C")||rota.equals("D")){//rota kontrolu yapıldı

                if (yas>65){//yas kontrolu
                    if (rota.equals("B")){//rot B sartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("65 yas ustu B sehrine çift yon ucus bilet fiyatınız :  "+(fiyatB*0.7*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("65 yas ustu B sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatB*0.7)+" $");
                        }else System.out.println("agam hala yonun belli değil");


                    }else if (rota.equals("C")){//rota cCsartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("65 yas ustu C sehrine çift yon ucus bilet fiyatınız :  "+(fiyatC*0.7*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("65 yas ustu C sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatC*0.7)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else if (rota.equals("D")){//rota D sarı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("65 yas ustu D sehrine çift yon ucus bilet fiyatınız :  "+(fiyatD*0.7*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("65 yas ustu D sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatD*0.7)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else System.out.println("hatalı giriş yaptınız ");

                } else if (yas<24 && yas>=12) {
                    if (rota.equals("B")){//rot B sartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("12-24 yas arası  B sehrine çift yon ucus bilet fiyatınız :  "+(fiyatB*0.9*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("12-24 yas arası  B sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatB*0.9)+" $");
                        }else System.out.println("agam hala yonun belli değil");


                    }else if (rota.equals("C")){//rota cCsartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("12-24 yas arası  C sehrine çift yon ucus bilet fiyatınız :  "+(fiyatC*0.9*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("12-24 yas arası  C sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatC*0.9)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else if (rota.equals("D")){//rota D sarı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("12-24 yas arası  D sehrine çift yon ucus bilet fiyatınız :  "+(fiyatD*0.9*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("12-24 yas arası  D sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatD*0.9)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else System.out.println("hatalı giriş yaptınız ");
                } else if (yas<12) {
                    if (rota.equals("B")){//rot B sartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("12 yas altı B sehrine çift yon ucus bilet fiyatınız :  "+(fiyatB*0.5*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("12 yas altı  B sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatB*0.5)+" $");
                        }else System.out.println("agam hala yonun belli değil");


                    }else if (rota.equals("C")){//rota cCsartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("12 yas altı  C sehrine çift yon ucus bilet fiyatınız :  "+(fiyatC*0.5*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("12 yas altı  C sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatC*0.5)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else if (rota.equals("D")){//rota D sarı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("12 yas altı  D sehrine çift yon ucus bilet fiyatınız :  "+(fiyatD*0.5*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("12 yas altı  D sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatD*0.5)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else System.out.println("hatalı giriş yaptınız ");
                }else {//24-65 arası yas indirimi alamayan yolcu grubu
                    System.out.println("agam maalesef yas sana yaranadı 0 yas indirimi");
                    if (rota.equals("B")){//rot B sartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("24-65 arası B sehrine çift yon ucus bilet fiyatınız :  "+(fiyatB*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("24-65 arası  B sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatB)+" $");
                        }else System.out.println("agam hala yonun belli değil");


                    }else if (rota.equals("C")){//rota cCsartı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("24-65 arası  C sehrine çift yon ucus bilet fiyatınız :  "+(fiyatC*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("24-65 arası  C sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatC)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else if (rota.equals("D")){//rota D sarı
                        if (ucusYonu==1){//cift yon ucus kontrolu
                            System.out.println("   ***   ");
                            System.out.println("24-65 arası  D sehrine çift yon ucus bilet fiyatınız :  "+(fiyatD*0.8*2)+" $");
                        } else if (ucusYonu==0) {
                            System.out.println("   ***   ");
                            System.out.println("24-65 arası  D sehrine tek  yon ucus bilet fiyatınız :  "+(fiyatD)+" $");
                        }else System.out.println("agam hala yonun belli değil");
                    }else System.out.println("hatalı giriş yaptınız ");
                }

            }else System.out.println("agam henuz o gezegene ucuslar başlamadıd :( ");//rota kontrol dısı durum


        }
    }
