package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
        /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */

     String name="merve";
        System.out.println(name);//merve
     name.concat("javaCan");
        System.out.println(name);//merve--> string name variable method sonrası aynı değerde kaldı.ımmutable olduğunu gösterir.


        List<String> isimlist = new ArrayList<>();//boş list
        System.out.println(isimlist);
        isimlist.add("fatih");
        isimlist.add("erkan");
        isimlist.add("serkan");
        isimlist.remove(1);
        isimlist.set(1,"javacan");

        System.out.println(isimlist);// [Fatih, javacan]-> list boş iken methodlar sonrası değişti
        // :mutable ArrayList de Mutable (değişebilir

    }
}
