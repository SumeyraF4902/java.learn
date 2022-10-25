package j19_StaticKeyword;


    /*
        1.static block yapıları static variable'rı değer ataması update için kullanılır
        2.statik block Class oluşturulduğunda bütün methodlardan (main method dahil )önce çalışır.
        3. birden fazla static blok varsa yukarıdan aşağıya sıralama ile çalışır.
         */
    public class C02_StaticBlock {//güneş misali static var
        static String isim;
        static{//ilk çalışacak static block
            System.out.println("agam 1. static blok çalıştı. :)");
            isim="dilek hanım";
            System.out.println("isim = " + isim);//
        }
    public static void main(String[] args) {// MAİN BAŞI
        System.out.println("main method başladı....");
        isim="kerim bey";
        System.out.println("isim :"+isim);
        System.out.println("main methot bitti  :( ");

    }// MAİN SONU
        static{// 2. çalışacak static block
            System.out.println("agam 2. static blok çalıştı. :)");
            isim="Uğur JAVACAN";
            System.out.println("isim = " + isim);//
        }
}
