package day08;

import java.util.Arrays;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("İsminizi giriniz:");
        String isim = sc.nextLine().toUpperCase();
        System.out.println("Cinsiyetinizi giriniz E/K");
        char c = sc.next().toLowerCase().charAt(0);
        if (c == 'k') {
            System.out.println("Hoşgeldiniz   " + isim + " Hanım");
            System.out.println("****** En büyük  "+ isim + "  Hanım Başka büyük yok***********");
        } else if (c == 'e') {
            System.out.println("Hoşgeldiniz   " + isim + " Bey");
            System.out.println("****** En büyük  "+ isim + " Bey Başka büyük yok***********");
        } else {
            System.out.println("Arkadaşım cinsiyetini bilmeyen adam mı olur?");
            System.out.println("Bence gözlük tak tekrar bakıp dene ");}

        System.out.println("yaşınızı giriniz:");
        int yas = sc.nextInt();

        System.out.println("ooooo  otobüsle yalnız yolculuk yapacak kadar büyümüşsünüz  :)");
        System.out.println("ADI :"+ isim+ " yaşı "+ yas  +" olan biri hiç yalnız yolculuk etmekten korkar mı");

        System.out.println("yolculuk nereye?");
        String yolculuk = sc.nextLine().toUpperCase();
        System.out.println(yolculuk + "  giderken size hayırlı yolculuklar dilerim  :)");
        System.out.println("sizinle vakit geçirmek güzeldi Helede Poğaçalar gene gel emi herzaman bekleriz ");
        System.out.println("Gelecekmisin E/H");
        char b= sc.next().toLowerCase().charAt(0);
        if (b=='e') {
            System.out.println("Muhsin çok sevinecek");
        }else if (b=='h') {
            System.out.println(" Muhsin çok üzülecek");
        }else System.out.println("Kararsızlık iyi değildir.... AGAAAM");
        System.out.println(" kardeşiniz var mı E/H");
        char s = sc.next().toLowerCase().charAt(0);
        if (s == 'e') {
            System.out.println("kardeşin var derdin var");

        } else if
            (s == 'h'){ System.out.println(" Bütün aile sana kaldı iyisin gene  :)");

        }else System.out.println(" kardeş ya vardır yada yoktur. ne dedin anlamadım kardeşin varda sen mi kabul etmiyorsun :( ");
    }


    }

