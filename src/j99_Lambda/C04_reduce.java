package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {//azaltma

    public static void main(String[] args) {
        // Lambda --> Stream API
        /*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        List<Integer> sayi1 = new ArrayList<>(Arrays.asList( 3, 5, 4, 6, 12, 8));
        cittKareMaxPrint1(sayi);
        System.out.println("\n   ***   ");
        elTopla(sayi);
        System.out.println("\n   ***   ");
        ciftElCarpPrint(sayi1);
        System.out.println("\n   ***   ");
        minBul(sayi1);
        System.out.println("\n   ***   ");
        bkBul(sayi);
        System.out.println("\n   ***   ");
    }//MAİN SONU

    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void cittKareMaxPrint1(List<Integer> sayi) {// filter işlemi null değer etme riskine karşı Optional Class type data casting yapıldı.
        Optional<Integer> maxEleman = sayi.stream().                                              //list elemanlar akışa alındı
                filter(C01_LambdaExpression::ciftMi).                                   //akıştaki çift elemanlar filtrelendi
                map(t -> t * t).                                    //akışta fitrelenen çitf elemanlar alınarak karesi ile update edildi akışa sokuldu.
                reduce(Math::max);          // akıştaki max elemanı verir, max elemana göre reduce --> azaltıldı.

        System.out.println(maxEleman);
        /*   System.out.println(maxEleman);
        System.out.println(sayi.
                stream().//list elemanları akısa laındı
                        filter(C01_LambdaExpression::ciftMi).//akısdaki list elelmnalrı cift fitrelendi
                        map(t -> t * t).//fitrelenen cift akıs elemanları karesi ile update edildi
                //reduce(Math::max));
                        reduce(Integer::max));//specific class daha hızlı çalışır*/

        // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    }

    public static void elTopla(List<Integer> sayi) {
        System.out.println(sayi.stream().reduce(Integer::sum));// normal yazdırdım [626]
        Optional<Integer> toplam = sayi.stream().reduce(Integer::sum);// cıktıyı dataya bağladım
        System.out.println(toplam);//Optional [626]
        System.out.println("lambda exp   " + sayi.stream().reduce(0, (a, b) -> a + b));//Lambda expression   626
        /*
        a: ilk değerini herzaman identity değerden alır.indentity 0 yazan yerden alır--a=0 dı (üste var 0 atanmış), a=24  a=72
        b: değerini herzaman stream() akıştan alır. listemdeki sayılardan akışa göre alır akış yukarıdan aşağı olur. ilk  b:24 olur sonra a+b 0+24=24, 24+38
        a:ilk değerden sonraki değerlerini action(işlem body)'den alır.  a--24 oldu, a=72 oldu
        listedeki sayılar bitene kadar devam eder.
         */

    }
        //// Task : List'teki cift elemanlarin carpimini  yazdiriniz.
                 public static void ciftElCarpPrint(List<Integer>sayi) {
                     System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));//math classdan meth refere...
                     System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1,(t,u)->t*u));//lamb.exp.../2304

                        // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    }
    public static void minBul(List<Integer>sayi) {
        System.out.println(sayi.stream().reduce(Math::min));//1 .YOL
        System.out.println(sayi.stream().reduce(Integer::min));//2. YOL
        System.out.println(sayi.stream().reduce(C04_reduce::byHalukMinBul));//3. YOL
        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u));//3. YOL
    }
    public static int byHalukMinBul(int a,int b){
        return a<b?a:b;
    }
    // Task : List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void bkBul(List<Integer>sayi) {
        System.out.println(sayi.stream().filter(t -> t > 24 && t%2==1).reduce(Math::min));//Optional[25] başlangıc değeri vermediğimiz için optional yaptı. optional null için bir tedbirdir
       // System.out.println(sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::tekMi).reduce(Math::min));CTE  : exp. ve meth ref aynı parametrede olamaz
    }
}