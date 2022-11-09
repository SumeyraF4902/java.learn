package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    private static Object IdeaProjects;


/*
        1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
    kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

            2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
    FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
    FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
    Class'inin parent class Hz.Nuh
            */

    /*throws(fırlatmak) Hatayı bulduğu yerde consolda hatayı yazdırır devam etmek kod hata olan yerde kırılır ve
     kalır banka proğramları ve özel bilgilerin olduğu yerde kullanılması  yararlıdır.
    * fakat
    * try(dene)- catch(tutmak) de hatayı bulur uyarı verir çalışmaya devam eder. kendinden sonra gelenleri çaışmaya devam eder*/
    public static void main(String[] args) throws IOException {//Hz Nuh işlemleri en parent class exception
   // public static void main(String[] args) throws FileNotFoundException {//read method import öncesi child exception


        FileInputStream fis =new FileInputStream("C:\\Users\\Musin\\IdeaProjects\\java.learn\\src\\j29_Exceptions\\ebikGabık");
    //ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılacak dosya yolu (path) girildi.
        // ilgili dosyanın üzerine git sağ tıkla copy Path Referanceyi tıkla kopyala iki tırnak arasına yapıştır.

        int k;
        while ((k=fis.read())!=-1){// read o sayfadaki charları okuyor.IOException--> evde yoksa kontrolü yapıyor
            //System.out.print(k);// böyle yazarsak ascıı değerlerini getirir
            System.out.print((char)k);//k int ascıı olan file olan değeri char ici casting -->type dönüşümü
            // veya
           // System.out.print((char)fis.read());// olarakta yazdırabiliriz.
        }

    }


}


