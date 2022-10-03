package j10_StringManipulasions;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        //charAt()  methodu parametre int olarak girilen index deki char değerini return eder.
        // index değeri 0 dan başlar.chart te 5 derken 5. sıradaki değer değil . sayısı yani indexi 5 olan değer
       // gelir.ör** İSTANBUL---> İ-0,S-1,T-2,A-3,N-4,B-5,U-6,L-7 YANİ BİZE 5-B Yİ VERİR.BOŞLUK BIRAKIRSAK BOŞLUĞUDA
        // BİR KARAKTER SAYAR.
        String sehir="İstanbul";
        System.out.println("sehir.charAt(5)="+sehir.charAt(5));//b
        char besinciİndexKrkt=sehir.charAt(5);
        System.out.println(besinciİndexKrkt);//b
        ///SON İNDEX (KARAKTER)--->lenht()-1 dir. uzunluğun 1 eksiğidir.
        // CHAR  sıfırdan başladığı için.LENGHT 1 DEN BAŞLAR.


        sehir.charAt(sehir.length()-1);//son KARAKTERİ VERİR.  L Yİ VERİR.
        //İLK KARAKTERİ BULMAK İÇİN; charAt(0)
        System.out.println(sehir.charAt(0));//ı
       // TRİCK--> charAt index boyutunu geçerse hata verir.
        //****System.out.println(sehir.charAt(18));// rte hata verir. 18 karakter yok der.
        //TASK-> girilen kelimenin ortadaki karakteri print eden code create ediniz. her karakterin ortası yoktur.
        // 2 ye bölünen sayıların ortası yoktur. bölünmeyen sayıların ortası vardır. iz-m-ir gibi.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime=scan.nextLine();
        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1)/2)); //orta karakter bulma
        }else System.out.println("girilen kelimenin orta karakteri yoktur.");


    }
}
