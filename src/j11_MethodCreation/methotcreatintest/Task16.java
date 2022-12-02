package j11_MethodCreation.methotcreatintest;

import java.util.Scanner;

public class Task16 {
  static   Scanner sc=new Scanner(System.in);
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
    public static void main(String[] args) {

        System.out.println("bir kelime giriniz:");
        String word1= sc.next().toLowerCase();
        System.out.println(word1);
        System.out.println("kelimeyi kabul ediyor musunuz ediyorsanız E \n etmiyorsanız H yzdırın");
        String cevap= sc.next().toLowerCase();

if (cevap=="e"){
    int puan=0;
    int puan1=word1.length();
    System.out.println("önceki oyuncunun hanesine"+(puan1)+" "+"eklendi");
    System.out.println("devam etmek istiyor musunuz? E/H");
    String cvp= sc.next().toLowerCase();
        if (cvp=="e"){
        System.out.println("kelime giriniz. kelimeyi başamı  B, sona mı S mı ekleyeceksiniz");
        String klm= sc.next().toLowerCase();
        if (klm=="b"){
            System.out.println(klm.concat(word1));

        }else System.out.println(word1.concat(klm));

    }else System.out.println("oyun bitti ");
    System.out.println();





}else System.out.println("yanlış kelime girdiniz.oyunu kaybettiniz. önceki oyuncu kazandı. Oyun Bitti");








    }//main sonu

}
