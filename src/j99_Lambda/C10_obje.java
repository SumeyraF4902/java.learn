package j99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_obje {
    public static void main(String[] args) {
        /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
       Universite u01=new Universite("Bogazici", "Matematik", 571, 73);
       Universite u02=new Universite("Istanbul", "Matematik", 622, 77);
       Universite u03=new Universite("Marmara", "Hukuk", 1453, 52);
       Universite u04=new Universite("Itu", "uçak muh.", 333, 63);
       Universite u05=new Universite("Yıldız Teknik", "Gemi ", 216, 55);

        List<Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03, u04,u05));

        System.out.println("TASK 1 notOrt74Byk( unv) = " + notOrt74Byk(unv));//FALSE
        System.out.println("\n   *****");
        System.out.println("02 task ogrcSys110azMih( unv) = " + ogrcSys110azMih(unv));//true
        System.out.println("\n   *****");
        System.out.println("Task03 nAzBirMathVarMi( unv) = " + enAzBirMathVarMi(unv));//true
        System.out.println("\n   *****");
        System.out.println("TASK 4 ogrcSaysıTersSıra(unv) = " + ogrcSaysıTersSıra(unv));//[universite='Marmara', bolum='Hukuk', ogrcSayisi=1453, notOrt=52, universite='Istanbul', bolum='Matematik', ogrcSayisi=622, notOrt=77, universite='Bogazici', bolum='Matematik', ogrcSayisi=571, notOrt=73, universite='Itu', bolum='uçak muh.', ogrcSayisi=333, notOrt=63, universite='Yıldız Teknik', bolum='Gemi ', ogrcSayisi=216, notOrt=55]
        System.out.println("\n   *****");
        System.out.println(" Task 05 notOrtTersSıra(unv) = " + notOrtTersSıra(unv));//[universite='Istanbul', bolum='Matematik', ogrcSayisi=622, notOrt=77, universite='Bogazici', bolum='Matematik', ogrcSayisi=571, notOrt=73, universite='Itu', bolum='uçak muh.', ogrcSayisi=333, notOrt=63]
        System.out.println("\n   *****");
        System.out.println(" task 06 enAzOgrcSayısı2Unv(unv) = " + enAzOgrcSayısı2Unv(unv));//[universite='Itu', bolum='uçak muh.', ogrcSayisi=333, notOrt=63]
        System.out.println("\n   *****");
        System.out.println(" task07 notOrt63BykOgrcSayısıl(unv) = " + notOrt63BykOgrcSayısıl(unv));//1193
        System.out.println("\n   *****");
        System.out.println("task08 ogrcSayısı333BykNotOrtOrt(unv) = " + ogrcSayısı333BykNotOrtOrt(unv));// OptionalDouble[67.33333333333333]
        System.out.println("\n   *****");
        System.out.println("matematikBolum(unv) = " + matematikBolum(unv));//2
        System.out.println("\n   *****");
        System.out.println("ogrcSayıs571BykEnBykNotOr(unv) = " + ogrcSayıs571BykEnBykNotOr(unv));//77
        System.out.println("\n   *****");
        System.out.println("ogrcSayıs107AzEnKckNotOrt(unv) = " + ogrcSayıs107AzEnKckNotOrt(unv));
        System.out.println("\n   *****");

    }//main sonu
    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrt74Byk( List<Universite>unv) {// task01
        return unv.stream().allMatch(t->t.getNotOrt()>74);
    }
    //TASK 02--> Ogrenci sayılarının 110 den az olmadigini kontrol eden method create ediniz
    public static boolean ogrcSys110azMih( List<Universite>unv){
        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110);
    }
    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean enAzBirMathVarMi( List<Universite>unv){
        return unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains("mat"));
    }
//task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
public static List<Universite> ogrcSaysıTersSıra(List<Universite>unv){
         return    unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                    collect(Collectors.toList());//akısdaki elemanlar liste atandı
    //collectorct(Collectors.coll)--> collector classdan call edilen coll meth ile akış elemanları atanır
}
//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

            public static List<Universite> notOrtTersSıra(List<Universite>unv){
    return    unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
            limit(3).
            collect(Collectors.toList());//akısdaki elemanlar liste atandı
    //collectorct(Collectors.coll)--> collector classdan call edilen coll meth ile akış elemanları atanır
}
            //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
             public static List<Universite> enAzOgrcSayısı2Unv(List<Universite>unv) {
             return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).
                limit(2).//ilk 2yi kestik
                        skip(1).//ilkini  atla
                        collect(Collectors.toList());//akısdaki elemanlar
    }
    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static int notOrt63BykOgrcSayısıl(List<Universite>unv) {
        return unv.stream().filter(t -> t.getNotOrt() > 63).
                mapToInt(t -> t.getOgrcSayisi()).// akıştaki elemanlarının data type nı parametre öğrenci sayısı int cevrildi
                        sum();//toplar
    }
       // average()   -->ortalamasını bulur
    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static double ogrcSayısı333BykNotOrtOrt(List<Universite>unv){

        return  unv.stream().filter(t->t.getOgrcSayisi()>333).
                mapToDouble(t->t.getNotOrt()).//akışdaki elemanların data type nı parametredeki değere göre updateeder
                average().getAsDouble();//akıştaki elemanlar ortalaması hesaplandı
    }
    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static long matematikBolum(List<Universite>unv){
       return unv.stream().filter(t -> t.getBolum().contains("Matematik")).count();
      // return unv.stream().filter(t -> t.getBolum().contains("Matematik")).collect(Collectors.toList()); dersek hangi üniversitelerde matematik var onları sıralar
//unv.stream().filter(t->t.getBolum().toLowerCase().equals("matematik")).forEach(t-> System.out.println(t)); 3 yol
    }
//task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static double ogrcSayıs571BykEnBykNotOr(List<Universite>unv){
       return unv.stream().filter(t->t.getOgrcSayisi()>571).mapToDouble(t->t.getNotOrt()).max().getAsDouble();
       // 2 YOL
        //unv.stream().filter(t -> t.getOgrcSayisi() > 571).
        // sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(1).collect(Collectors.toList()));
    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static double ogrcSayıs107AzEnKckNotOrt(List<Universite>unv){
       return unv.stream().filter(t -> t.getOgrcSayisi()<1071).mapToDouble(t->t.getNotOrt()).min().getAsDouble();
       // 2 yol
        //unv.stream().filter(t -> t.getOgrcSayisi() < 1071).
        // sorted(Comparator.comparing(Universite::getNotOrt)).limit(1).collect(Collectors.toList()));
    }

}

