package day16;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);

        System.out.println("negatifKareToplam(intL) = " + negatifKareToplam(intL));//[93]
        System.out.println("pozitifKüpMax(intL) = " + pozitifKüpMax(intL));//l[3375]
        tekleriBoslukluYazdir(intL);//-5 5 7 15
        System.out.println("ciftlerinCarpımı(intL) = " + ciftlerinCarpımı(intL));//0 0 cift sayı oldugu icin sonuc 0
        intL.stream().filter(Methods::ciftMi).forEach(t-> System.out.print(t+" "));//-2 -8 2 6 6 8
    }
    // S2: ciftlerin carpimini bulalim
    private static Integer ciftlerinCarpımı(List<Integer> intL) {
        return intL.stream().filter(Methods::ciftMi).reduce(1,(x,y)-> (x*y));
    }


    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    private static void tekleriBoslukluYazdir(List<Integer> intL) {
        intL.stream().filter(Methods::tekMi).forEach(t-> System.out.print(t+" "));
    }

    // S4: poziflerin kuplerinden max olani yazdiralim
    private static Optional<Integer> pozitifKüpMax(List<Integer> intL) {
       return intL.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Math::max);
               //REDUCE -->TEK sonuc versin diye
        // yol
       // return intL.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Integer::max);
    }
    // S3: negatiflerin kare toplamlarini  bulalim

    private static Optional<Integer> negatifKareToplam(List<Integer> intL) {
      return   intL.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Methods::toplam);
      //sonuc belli olmadıgı icin belki listede negatif sayı yoktur diye optional yapayım mı diye soruyor hata vermesin diye yap diyoruz.
    }









    }

