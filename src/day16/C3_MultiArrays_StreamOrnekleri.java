package day16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        //multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"} };
        System.out.println("listelle(arr) = " + listelle(arr));//[Elma, Muz, Portakal, Cilek, Limon, Havuc, Erik]
        System.out.println("*********");
         doubleYaz(arr);//ElmaElma ErikErik
        System.out.println("*********");
     EileBaslayanlistele(arr);//[Elma, Erik]
        System.out.println("*********");
        kIleBitenlerinSonunaYildiz(arr);//Cilek*  Erik*
        System.out.println("*********");
    }
    //S4 : k ile bitenlerin sonuna '*' ekleyelim
    private static void kIleBitenlerinSonunaYildiz(String[][] arr) {
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.endsWith("k")).forEach(t-> System.out.print(t+"*  "));
    }

    // S3: E ile baslayan elemanlari liste olarak yazdiralim
    private static void EileBaslayanlistele(String[][] arr) {
        System.out.println(Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).filter(t -> t.startsWith("E")).collect(Collectors.toList()));
    }

    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
  private static void doubleYaz(String[][] arr) {
     Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).map(t -> t + t).filter(t -> t.startsWith("E")).forEach(t-> System.out.print(t+" "));
     //2 yol  bir alttaki methodu cagırarak yaptık
      listelle(arr).stream().filter(x->x.startsWith("E")).map(t -> t+t).forEach(t -> System.out.print(t+" "));

  }


//    }

    // S1 : tum elemanlari list yapalim
         private static List<String> listelle(String[][] arr) {
        return Arrays.stream(arr)
                .flatMap(t->Arrays.stream(t)).// arrayleri al tek boyutlu yap demektir.  hepsi bir streamde , bu method ile yeni bir streamde tek duzleme alıyoruz
                collect(Collectors.toList());// yeni liste yap demek
        //flatMap yöntemi kullanmak zorundayız neden, iki boyutlu arrayi tek boyutlu yapmak icin kullanılır

    }















}
