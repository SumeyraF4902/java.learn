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
if (yas<=0){
    System.out.println("agam daha doğmamışsın be yaa doğda gel");
    System.out.println(" amanınnnn  sen doğmadıysan ben kiminlen gonuşuyom");
}else{
        System.out.println("ooooo  sen kocama olmususn be yaaa  :)");}
        System.out.println("ADI :"+ isim+ " yaşı "+ yas  +" bak herşeyin burada");

        System.out.println(" 15 tatilde yolculuk nereye bee yaa?");
        String yolculuk = sc.nextLine().toUpperCase();
        System.out.println(yolculuk + "  giderken size hayırlı yolculuklar dilerim  :)");
        System.out.println("sizinle vakit geçirmek güzeldi Helede güzel bir film bulda bizde izleyek be yaa ");
        System.out.println("Bulacak mısın E/H");
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

