package j10_StringManipulasions;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

String str="Alamanya";
str.indexOf('a');
        System.out.println(str.indexOf('a', str.indexOf('a')+1));//BÜYÜK A YI KAİLE ALMAZ KÜÇÜK a LARI SAYAR
    }
}
