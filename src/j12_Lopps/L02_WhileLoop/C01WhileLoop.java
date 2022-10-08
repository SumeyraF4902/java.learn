package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C01WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıc ve bitiş değerleri net(bilinen değerler)olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda While loop kullanılmalı
         */
        //TASK --> 11 den 20 ye kadar olan tamsayıları print eden code create ediniz
        //for çözümü
        for (int i=11;i<21;i++){
            System.out.print(i+" ");
        }
        // While çözümü
        int basla=11;
        while (basla<21) {// aşla 21 den küçük olduğu sürece badi aksiyon uygula
            System.out.print(basla+" ");
            basla++;

        }
//task --2> 7 kere javaCan print eden code create ediniz,
        int a=1;
        while (a<8){
            System.out.println("javaCan");
            a++;
        }
           //Task--> 3-->2 basamaklı tek sayıları yanyana print eden code create ediniz
        int b=11;
        while (b<100) {
            System.out.println(b + " ");
            b += 2;
        }// 2 yol if(b%2==1) System.out.println(b + " "); b++;
        //Task --4> girilen metni tersten while loop ile tersten print eden code create ediniz*/
              Scanner scan = new Scanner(System.in);
       System.out.println("bir metin giriniz:");
        String str= scan.nextLine().toLowerCase();
       int metinUzunluk=str.length();
        while (metinUzunluk>1){// metnin uzunluğu 0 a eşit ve büyük iken
            System.out.print(str.charAt(metinUzunluk-1));
            metinUzunluk--;
        }
   // Task--05--> girilen tam sayıya kadar tamsayıların toplamını print eden code create ediniz
        System.out.println("bir tam sayı giriniz");
        int sayi= scan.nextInt();
       int toplam=0;
        while (sayi>0) {// sayı 1 olana dek
            toplam += sayi;//her döngüde sayıyı toplama ekle
            sayi--;//her döngüde sayıyı 1 azalt ki döndükce dönmesin!!
        } System.out.println("sayıların toplamı:"+toplam);
        //Task--6> girilen tamsayıların faktöriyelini print eden code create ediniz
        System.out.println("********");
        int faktoriyel =1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println(faktoriyel);




    }
}
