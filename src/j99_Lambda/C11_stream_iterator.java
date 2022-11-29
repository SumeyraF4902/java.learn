package j99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    public static void main(String[] args) {
        System.out.println("TASK01 = " + toplaAmele(10));//55
        System.out.println("     *****     ");
        System.out.println("toplaCincix( 10) = " + toplaCincix(10));//55
        System.out.println("     *****     ");
        System.out.println("TASK02 = " + toplaCift(24));//156
        System.out.println("     *****     ");
        System.out.println("Task03 = " + toplaIlkCift(10));//110
        System.out.println("     *****     ");
        System.out.println("Task04 = " + toplaIlkTek(10));//100
        System.out.println("     *****     ");
        System.out.println("TASK05 ****");
        ikininIlkXkuvvetiPrint(7);//2 4 8 16 32 64 128
        System.out.println("     *****     ");
        System.out.println("Task08= " + istenenSayıXKuvveti(7, 5));//16807
        System.out.println("Task08= " + istenenSayıXKuvveti(3, 5));//243
        System.out.println("Task08= " + istenenSayıXKuvveti(2, 3));//8
        System.out.println("Task08= " + istenenSayıXKuvveti(10, 2));//100
        System.out.println("     *****     ");
    }//main sonu
    //map collection değildir. nasıl yapacağını söylemeyiz ne yapacağını söyleriz
    //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil)
    // endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.(başlangıç dahil bitiş dahil değildir
            // rangeClosed ---> başlangıç ve bitiş dahil demek



    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    //Structured programing(amele coding.....)
    public static int toplaAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }
    //Functional Programming(cincix code...)
    public static int toplaCincix(int x) {
     return IntStream.///manuel akış tanımlandı.
             range(1,x+1).//1 dahil , x+1 hariçtir. yani x de alsın diye   x+1 yazdık.1,2,3,...x int sayılarından aralık tanımlandı. unutma başlangıc değeri dahil , bitiş değeri hariçti methodlarda.
   sum();//akısdaki sayıları topladı.

    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift(int x){
      return   IntStream.range(1,x+1).filter(C01_LambdaExpression::ciftMi).//akıştaki sayıların çift olanları
        sum();
      /// 2 YOL

         /*  IntStream.rangeClosed(1,x).  rangeClosed ---> başlangıç ve bitiş dahil demek
                   filter(C01_LambdaExpression::ciftMi).//akıştaki sayıların çift olanları
                sum();*/
    }
            //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkCift(int x){
        return IntStream.
                iterate( 2,t->t+2).// 2 den başlayıp 2 arttıran tekrar işlemi tanımlandı-->2,4,6,8,.... tekrar  işlemi
        limit(x).//akıştaki ilk x eleman akışa alındı.
        sum();//akıştaki ilk x eleman toplanır.
    }
    //TASK 04 --> Ilk x pozitif tek sayiyi toplayan program  create ediniz.
    public static int toplaIlkTek(int x) {
        return IntStream.
                iterate(1, t -> t + 2).// 1 den başlayıp 2 arttıran tekrar işlemi tanımlandı-->1,3,5,.... tekrar  işlemi
                        limit(x).//akıştaki ilk x eleman akışa alındı.
                        sum();//akıştaki ilk x eleman toplanır.
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininIlkXkuvvetiPrint(int x){/// Iterater---= tekrar demek
        IntStream.iterate(2,t->t*2).// 2 den başlayıp 2 ile  çarparak x kadar tekarla çarpma işlemini
                limit(x).forEach(C01_LambdaExpression::yazdir);
    }
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ilkXkuvvetiPrint(){

    }

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.

        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static OptionalInt istenenSayıXKuvveti(int istenensayi, int x){
        return IntStream.iterate(istenensayi,t->t*istenensayi).// istenen sayıdan başlayıp istenen sayıyla çarpılarak tekar eder. den
        limit(x).// akıştaki ilk x eleman akışa alındı
        skip(x-1).//akısdaki x den önceki selemanlar atlandı kalanlar akışa alındı
        findFirst();//akıştaki ilk eleman x alındı

        }
}
