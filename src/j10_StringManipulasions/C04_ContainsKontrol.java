package j10_StringManipulasions;

public class C04_ContainsKontrol {
    public static void main(String[] args) {
        // String içersinde ,istenen stringin varlığını kontrol eder. boolean return eder.İÇERMEK
        String s1="Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım"));//false küçük büyük harfe duyarlı.
        System.out.println(s1.contains("E"));//TRUE
        System.out.println(s1.contains(" ")); //TRUE
        String s2="Qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false










    }
}
