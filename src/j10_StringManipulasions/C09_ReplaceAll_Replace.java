package j10_StringManipulasions;

import java.util.Scanner;

public class C09_ReplaceAll_Replace {
    public static void main(String[] args) {
        //replace
        //Metin içersindeki karakter yada bir parçasının , istenilen karakter yada metinle değiştirilmesini
        //(update-set) sağlar. sonuç Stringdir.
        String str="JavaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', 'b'));
        System.out.println(str.replace("can", "kan"));
        /**ReplaceFirs
         * replace ile aynı sadece ilk bulunanı değiştir.
         */
        System.out.println(str.replaceFirst("a", "@"));
        // replaceAll() methodu raplace() methodu   na benzer ama 2 farkı vardır.
        //1-replace() methodu char kabul eder ama replaceAllkabul etmez.
        //2-replaceAll() methodu regex kullanımına izin verir.(regular expression)
        //(REGULAR   Expression)
        // \\s BOŞLUK (
        // \\S BOŞLUK dizisindeki tüm karakterler
        // \\w BOŞLUK harfler ve rakamlar( a z A Z 0 9 )
        // \\W BOŞLUK ( HArfler ve rakamlar dizisindeki tüm karakterler
        // \\d BOŞLUK ( RAKAMLAR 0-9
        // \\D BOŞLUK (RAKAMLAR Dizisindeki tüm karakterler
        str="      JavaCAN'lara selam olsun :) java ile 123455544 offer ***  ";
        System.out.println(str.replaceAll("\\s", "+"));// tüm boşluklara + koyar.//++++++JavaCAN'lara+selam+olsun+:)+java+ile+123455544+offer+***++
        System.out.println(str.replaceAll("\\S", "+"));// boşluk hariç tüm karakterleri + yapar.++++++++++++ +++++ +++++ ++ ++++ +++ +++++++++ +++++ +++
        System.out.println(str.replaceAll("\\w", "+"));//+++++++'++++ +++++ +++++ :) ++++ +++ +++++++++ +++++ ***
        System.out.println(str.replaceAll("\\W", "+"));//++++++JavaCAN+lara+selam+olsun++++java+ile+123455544+offer++++++
        System.out.println(str.replaceAll("\\d", "+"));//JavaCAN'lara selam olsun :) java ile +++++++++ offer ***
        System.out.println(str.replaceAll("\\D", "+"));//+++++++++++++++++++++++++++++++++++++++++++123455544++++++++++++
        /*TASK girilen ismini soyismini ve 16 haneli kredi kartı no bilgilerini aşağıdaki formatta print eden code create  ediniz.
        //isi-soyisim:M******  B*****
        // kart no:*************1234
             */
    String ad="sumeyra";
    String soyad="özturk";
    String kartno="1234567891236547";
       String yeniIsım=ad.charAt(0)+ad.substring(1).replaceAll("\\w", "*");
       String  yenisoyad=soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");

        String yenikartno="**** **** **** ****"+kartno.substring(12);
        System.out.println("isim -soyisim:"+yeniIsım+yenisoyad+"kart no: "+yenikartno);//isim -soyisim:s******ö*****kart no: **** **** **** ****6547
    }
}
