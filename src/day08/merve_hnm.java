package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class merve_hnm {
    public static void main(String[] args) {
        /*  Örnek 1:
        Java N ve M boyuutlu dizinin satırlarının toplamını bulma
        Bu örnekte N ve M değerlerini kullanıcıdan alıp iki boyutlu dizi oluşturacağız
        daha sonrada dizinin elemanlarını kullanıcıdan alıp her satırın sonuna o satırın toplamını yazdıracağız
        örn:
        12     12    24
         5     15    20
         12     18   30
         */

        Scanner sc=new Scanner(System.in);
        int toplam=0;
        System.out.println("dizinin satır sayısını giriniz");
        int satır= sc.nextInt();
        System.out.println("dizinin sütun sayısını giriniz");
        int sutun=sc.nextInt();
        int sayi[][]=new int [satır][sutun];//iki boyutlu arrin satır ve sutun uzunlukları tanımlandı.
        for(int i=0;i<satır;i++){
            for(int j=0; j<sutun;j++){
                System.out.println("sayı giriniz");
                sayi [i][j]=sc.nextInt();// burada artık boş arrayim dolduruldu.
            }
        }
        System.out.println(Arrays.deepToString(sayi));// iki boyutlu array olduğu için deepToString ile ekrana yazdırırz/
        // tek boyutlu array Arrays.toString ile yazdırırız
        System.out.println("Girilen dizi:\n");
        for (int i=0; i<satır;i++){
            toplam=0;// kullanıcının girdiği değerleri toplamak için 0 değerinde integer toplam tanımlandı.
            // bunu araya koyduk ki hepsini toplamasın satır ve sutunu toplasın.ikinci satır ve sutun geçtiğinde toplamı sıfırlasın
            // yeni boyutu kendi arasında toplasın.
            for(int j=0; j<sutun; j++){

                toplam+=sayi[i][j];
                System.out.print(sayi[i][j]+"\t");// arrayın elemanlarını bir tab boş bırakarak yazdırır

            }
            System.out.println(toplam+"\n");//en sonda ise satırdaki topladığımız sayıları satırın sonuna yazdırdık.
        }
        /* ÖRNEK 2:
        Write a java to separate odd-tek and even-çift nunber s of a given array of integers
        put all odd numbers first and then even numbers.
        example: int sayı[] ={20,12,23,17,7,8,10,2,1,0};
        bir array oluştur tek sayıları öne yazdır , çift sayılar ondan sonra gelsin diyor.
         */
        int sayı[] = {20,12,23,17,7,8,10,2,1,0};
        System.out.println(" sayımız: "+ Arrays.toString(sayı));
        System.out.println();// güzel gözüksün diye boşluk oluşturma= dummy
        ArrayList<Integer> yenilist= new ArrayList<>();
        System.out.println("tek cift ayrıldıktan sonra = " + tekciftayırma(sayı, yenilist));
    }

    private static ArrayList<Integer> tekciftayırma(int []sayı ,ArrayList<Integer>yenilist) {
        for (int a : sayı) {
            if (a%2==1){
                yenilist.add(a);
            }
        }
        System.out.println("yenilist = " + yenilist);
        for (int b:sayı){
            if(b%2==0){
                yenilist.add(b);
            }
        }
        return yenilist;

    }
}
