package j10_StringManipulasions;

public class C05_Start_EndWith {
    public static void main(String[] args) {
/**
 * startsWhith()
 * Metnin baş kısmının istenilen dizi ile eşleşip eşleşmediğini kontrol eder.
 * sonucunda boolean değer verir.
 * Stringin başladığı characteri doğrular.
 * endWith()
 * Metnin son kısmının istenilen dizi ile eşleşip eşleşmediğini kontrol eder.sonucu boolean dir.
 */

String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));//i le başlarmı?//true
        System.out.println(sehir.startsWith("is"));//is le başlarmı/true
        System.out.println(sehir.startsWith("s"));//s ile başlarmı/false
        System.out.println(sehir.startsWith("e,3"));//3. indexten itibaren e ile mi başlar//false
        System.out.println(sehir.startsWith("a",3 ));//3. indexten itibaren a ile mi başlar//true
        System.out.println(sehir.endsWith("l"));// l ile bitermi/true
        System.out.println(sehir.endsWith("bul"));// bul ile bitermi/true
        System.out.println(sehir.endsWith("bu"));// bu ile bitermi/false
        String str="bul";
        System.out.println(sehir.endsWith(str));//true
        int yas=48;
        //System.out.println(sehir.endsWith(yas));//cte --verir. int değer alamaz sadece string değer alır.



    }
}
