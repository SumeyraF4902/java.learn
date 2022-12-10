package day15.Day05;

import java.util.*;

public class Q03_CollectionsMethodsTask {
    public static void main(String[] args) {
        // part 1: create list of 5 numbers from user input
        // sort the list in reverse order and print it
        // shuffle the list and print it
        // rotate right by 3 places and print it

        // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
        // listeyi ters sırada sırala ve yazdır
        // listeyi karıştır ve yazdır
        // 3 yer sağa döndür ve yazdır

        // part 2: find the max number and min number, print them
        // replace all max number with min number

        // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        // tüm maksimum sayıları minimum sayı ile değiştir
   // Scanner sc=new Scanner(System.in);
       // ArrayList<Integer> list1=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           // System.out.println("1. sayıyı giriniz");// 1 bolum
          //  list.add(sc.nextInt());

        }
        ArrayList<Integer> list=new ArrayList<>(List.of(10,20,55,87,14,2,9,3));
      //  System.out.println(list);
      //  Collections.reverse(list);// ters sırala
       // System.out.println(list);//ters yazdir
      //  Collections.sort(list);//kucukten  buyuge
      //  Collections.shuffle(list);//rastgele karıstir
       // System.out.println(list);
        Collections.rotate(list,3);//belirtilen listedeki degerleri kaydirir.distance hangi no ise ordan baslar sondan ucunu basa yazdirdi
        System.out.println(list);
        // bolum 2
        int max=Integer.MIN_VALUE;
        for (int w:list) {
            if(w>max) {
                max=w;
            }



        }
        System.out.println(max);
        // kisa yol
        Integer max1=Collections.max(list);
        Integer min=Collections.min(list);
        System.out.println(max1);
        System.out.println("min = " + min);
        Collections.replaceAll(list,max,min);
        System.out.println(list);

    }


    }

