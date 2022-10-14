package day05;

import java.util.Scanner;


public class alıstırma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nereye gitmek istiyorsunuz:B şehri için --1\nC şehri için --2\nD şehri için --3 giriniz");
        int rota = sc.nextInt();
        System.out.println("kaç yaşındasınız");
        int yas = sc.nextInt();
        System.out.println("tek yön bilet için--->1, gidiş dönüş için --2 giriniz");
        int yon = sc.nextInt();
        double fiyatB = 500 * 0.10;
        double fiyatC = 700 * 0.10;
        double fiyatD = 900 * 0.10;


        if (rota == 1 || rota == 2 || rota == 3) {
            if (yas > 65) {
                if (rota == 1) {
                    if (yon == 1) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.70 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.70) + "  $");
                    } else System.out.println("yönünüz hala belli değil");

                } else if (rota == 2) {
                    if (yon == 1) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.70 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.70) + "  $");
                    } else System.out.println("yönünüz hala belli değil");

                } else if (rota == 3) {
                    if (yon == 1) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatD * 0.70 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatD * 0.70) + "  $");
                    } else System.out.println("yönünüz hala belli değil");

                } else System.out.println("hatalı giriş yaptınız");

            } else if (yas > 12 && yas <= 24) {
                if (rota == 1) {
                    if (yon == 1) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.90 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.90) + "  $");
                    } else System.out.println("yönünüz hala belli değil");

                } else if (rota == 2) {
                    if (yon == 1) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.90 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.90) + "  $");
                    } else System.out.println("yönünüz hala belli değil");

                } else if (rota == 3) {
                    if (yon == 1) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatD * 0.90 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatD * 0.90) + "  $");
                    } else System.out.println("yönünüz hala belli değil");


                } else if (yas < 12) {
                    if (rota == 1) {
                        if (yon == 1) {
                            System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.50 * 0.8) + "  $");
                        } else if (yon == 2) {
                            System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.50) + "  $");
                        } else System.out.println("yönünüz hala belli değil");

                    } else if (rota == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.50 * 0.8) + "  $");
                    } else if (yon == 2) {
                        System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.50) + "  $");
                    } else System.out.println("yönünüz hala belli değil");

                } else if (rota == 3) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatD * 0.50 * 0.8) + "  $");
                } else if (yon == 2) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatD * 0.50) + "  $");
                } else System.out.println("yönünüz hala belli değil");
            } else System.out.println("sizin için bir indirim kampanyası yoktur");
            if (rota == 1) {
                if (yon == 1) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatB * 0.8) + "  $");
                } else if (yon == 2) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatB) + "  $");
                } else System.out.println("yönünüz hala belli değil");

            } else if (rota == 2) {
                if (yon == 1) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatC * 0.8) + "  $");
                } else if (yon == 2) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatC) + "  $");
                } else System.out.println("yönünüz hala belli değil");

            } else if (rota == 3) {
                if (yon == 1) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatD) + "  $");
                } else if (yon == 2) {
                    System.out.println("Toplam bilet fiyatınız:" + (fiyatD*0.8) + "  $");
                } else System.out.println("yönünüz hala belli değil");


            } else System.out.println(" henüz o yöne uçuşlarımız yok");


        }


    }}


