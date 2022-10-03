package j10_StringManipulasions;

import java.util.Scanner;

public class C07_İndexOf_lastindezOf {
    public static void main(String[] args) {
        /*İndexOf()
        * char karakter yada string metnin kaçıncı indexden başladığını veren bir methodtur. sonuç integer dir
        * Bu method index i sorulan char in strin içindeki ilk görünümünün index ini return eder.
        contains den farklı indexini verir. contains(kapsar mı) ise true  false
         */

        String str="Good";
        System.out.println("ilk görülen o nun yeri index nosu:" +str.indexOf('o'));
        System.out.println("d nin yeri index nosu:"+str.indexOf('d'));
        System.out.println("d nin yeri index nosu:"+ str.indexOf("D"));
        //OLMAYAN KARAKTER İNDEXİ SORGULANIRSA -1 RETURN EDER.
        System.out.println("od nun yeri index nosu:"+ str.indexOf("od"));
        /** lastIndexOf()
         * String içinde aranan karakter(ler)in sondan itibaren ilk indexini verir.
         * indexOf un sondan olan hali fakat index numaraları değişmez.
         * lastIndexOf() Methodu index i sorulan chracterin son görünümünün index ini return eder.
         * indexOf() methodunda birden fazla character in index i sorulursa ilk character in index i return edilir.
         */
String name="mustafa nizamoğlu";
        System.out.println(name.indexOf('a'));// 4 musta buradaki a yı verir
        System.out.println(name.lastIndexOf('a'));//11 nizamoğlu buradaki a yı verir.
        System.out.println(name.lastIndexOf("fa") );//5 fa nın başladığı yeri verir.
        System.out.println(name.indexOf("fa"));//5 sondanda baştanda aynı yerdedir. sağdan sayar  0 dan başlayıp numara verir. bu numaralar hiç değişmez.
        /* Task --> girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz.
        1-girilen cümle java içermiyor
        2-girilen   cümle 1 tane java içeriyor
        3-girilen   cümlede birden fazla java var
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("kafi miktar bir cümle giriniz:");
        String cumle=sc.nextLine();
        if (cumle.indexOf("java")==-1) {
            System.out.println("girilen cümle   java içermiyor");
        }else if (cumle.indexOf("java")==cumle.lastIndexOf("java")){// baştanda sondanda aynı yerde demek o zaman bir tane olduğu anlaşılır.
            System.out.println("girilen cümle bir tane  java içeriyor");
        } else System.out.println("girilen cümle birden  java içeriyor");









    }
}
