package day09.day1_ınterwiew_soruları;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /* INTERWİVE SORUSU
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("string giriniz");
        String str = sc.nextLine();
        //split
        String[] arr = str.split("");//herbir karakteri ayırır.
        System.out.println(Arrays.toString(arr));

        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //count:sayaç oluştur

        int counter = 0;
        // karakterleri karşılaştırmak için for loop


        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {//birden fazla sayıdaki karakter için

                counter++;
            } else {//tek sayıdaki karakter için
                System.out.println(arr[i - 1] + "  sayısı  " + (counter + 1));
                counter = 0;// yeni bir karaktere geçtiğinde yeniden 0 dan başlasın.
            }
            if (i == arr.length - 1) {// en son karakter benzersiz ise  çalışır
                System.out.println(arr[i]+"  sayısı  " + (counter + 1));
            }

        }


    }
}