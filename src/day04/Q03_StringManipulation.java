package day04;

public class Q03_StringManipulation {
    public static void main(String[] args) {
//String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz
        //String str1="$13.99"
        //String str2="$10.55"
        //ipucu Double parseDouble() methodunu kullanabilirsiniz.
        /* Regular Expression (regex): Belli türdeki karakterleri secebilmemize yarar.
        1-\\d ==>TÜM RAKAMLAR
        \\D ==>tüm rakam dışı karakterler
        2-\\w ==> A--Z   a--z  0--9
        \\W ==>A--Z   a--z  0--9 dışındaki herşey
        3-\\s ==>space
        \\S ==>space dışındaki herşey
         */
        String str1="$13.99";
        str1=str1.replaceAll("\\D","");


        String str2="$10.55";
        str2=str2.replaceAll("\\D","");
        //str1 ve str2 içeriği sayı olan String ifadelerdir
        //Eğer içeriğinin tamamen sayı olduğunu bildiğimiz
        // string varsa parseDouble() veya parseInteger() methodu kullanabiliriz.
        //kelimeyi sayıya dönüştür methodu.

        double sayi1=Double.parseDouble(str1);//String olan str1 , sayı olan sayi1 e dönüştü
        double sayi2=Double.parseDouble(str2);//String olan str2 , sayı olan sayi2 e dönüştü
        double toplam=(sayi1+sayi2)/100;//virgüllü sayı olduğu için böldük.
        System.out.println("$"+toplam);


    }
}
