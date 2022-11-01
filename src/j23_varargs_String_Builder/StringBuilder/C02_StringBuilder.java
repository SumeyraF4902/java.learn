package j23_varargs_String_Builder.StringBuilder;

import javax.print.DocFlavor;

public class C02_StringBuilder {
    public static void main(String[] args) {


        // String builder obj create etme
        //1. YOL
        StringBuilder sb1=new StringBuilder();// default capacity 16 bit olan value'su olmayan boş stringbuilder

        System.out.println("sb.length="+sb1.length());//-->0 sb deki karakter sayısını return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("JAVATAR");//JavatarI sb1 EKLENDİ
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

       sb1.append("Selam").append("olsun").append(" ").append(24).append(" ").append(" true");
        System.out.println("sb1 = " + sb1);//JAVATAR Selam olsun 24 true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34--> capacity aşma durumunda
        // yeni capacity: eski capacity*2+2-->16*2+2= 34 değeri atanır
        sb1.append("Başarı gayrete aşıktır:)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70 capacity aşma durumunda
       // yenicapacity: eski capacity*2+2=>34*2+2=70 değeri atanır
        // 2. YOL
        StringBuilder sb2=new StringBuilder("kevser hanıma selamlar");// ilk değer ataması yapılmış sb2 stringbuil. obj.
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//38--> 22 karakter ilk değer atamasında oluştu +16 default hafıza yeri atandı.

        //trimToSize()--> fazladan ayrılan capacity silinir

        System.out.println("sb2.capacity() = " + sb2.capacity());//capacity:38
        sb2.trimToSize();
        System.out.println("sb2 = " + sb2.capacity());//capacity:22
        //sb2.trimToSize() yapılınca yeni sb2 capacity==sb2.length();
        //3 YOL
        StringBuilder sb3=new StringBuilder(11);// hafızada 11 karakterlik yer ayrılan boş sb tanımlandı.
        System.out.println("sb3.length = " + sb3.length());// boş sb3 karakter sayısı =0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24


        //istenen bir karakter index i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//o

        //Belirli aralıktaki karakterleri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//3.4.5.....12 index karakterleri alır ekrana yazdırır
        System.out.println("sb1.subSequence(17) = " + sb1.substring(17));// 17. karakter ve sonrasını yazdırır
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//3.4.5.....12 index karakterleri alır ekrana yazdırır

        //Belirli indexdeki karakterleri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));// 3. indexteki karakter silindi
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3.4.5.6. index karakterler silindi
        System.out.println("sb1 = " + sb1);

        //istenen karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));
        String s="güzel insan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));// 9 indexe s  stringi eklendi
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));// sb3 valuesinin 1. indexine
        // s valuesinin 3.4.5.6 indexi eklendi.
        StringBuilder sb4=new StringBuilder("nihan hanım");
        System.out.println("sb4.insert(5,\"QA team lead\",0,2) = " + sb4.insert(5, "QA team lead", 0, 2));//sb4 nin 5. indexine
        //QA team lead ın 0 ve 1 karakterleri eklendi. nihanQA OLDU

        //İSTENEN İNDEX DEKİ KARAKTERİ DEĞİŞTİRME
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);
        System.out.println("sb4.insert(5,\" \") = " + sb4.insert(5, " "));

        //İstenen indexe karakter yerine birden çok karakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        // StringBuilder  obj Stringe çevirme ---> toString

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//strinbuilderi stringe çevirerek toUpperCase meth çalıştı.


        //String ile StringBuilder karşılastırması
        /*
        compare iki sb i eşit mi diye kontrol etmek için
        iki harften başlayarak tüm karakterleri karşılaştırır.
        Aynı olan karakterler için bir şey return etmezken
        farklı olan ilk karakter için ascii tablosuna göre kaç değer geride veya ileride olduğunu print eder.
        tamamen aynı ise bize 0 return eder.

        bir sb ile bir stringi compare etmek istersek (yani karşılaştırmak) java CTE verir
         */
StringBuilder sb5=new StringBuilder("JavaCAN");
StringBuilder sb6=new StringBuilder("JavaCAN");
String str1="JavaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6)); // aynı olduğu için 0 verir
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//str1 i stringbuilder e dönüştürdük
        // onlarda aynı olduğu için 0 verir
      //  sb6.compareTo(str1);  CTE verir-- ELMA ARMUT KIYASI OLMAZ StringBuilder ve String farklı şeylerdir
        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//// stringbuilder eguels  == çalışır hem valua hemde referans değerine bakar onun için false verir
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//// true verir
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));// true veriri ikiside string olduğu için true verir


    }
}
