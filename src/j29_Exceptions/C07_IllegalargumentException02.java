package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException02 {
    public static void main(String[] args) {
        /*
        Ahnada trick köşesinde bugün:)
        "throw "- throws" farkları
        1- "throws" -->main method kapanış parantezi ile method badi açılış parantezi arasına yazılır
           "throw "--> method badi içinde tanımlanır
        2-"throws"-->  keywordden sonra birden fazla exception tanımlanır
        "throw" -->   keyword den sonra sadece bir tane exception tanımlanır
        3- "throws" --> keywordden sonra sadece exception class name yazılır
        "throw" --> keyword den sonra  exception obj tanımlanır.
        4- "throws" --> keyword method ilk satırda sadece bir kez tanımlanır
        "throw " - keyword istenildiği kadar method bady de tanımlanabilir
         */
        //IllegalargumentExcateption--> kullanılması istenmeyen değerlerde pr hata vermesi isteniyorsa bu except fırlatıver.
        // örnek:yas datası için negatif değer girildiğinde pr kırılmadan run olması ama girilen değer için excep fırlatması için kullanılır

        Scanner sc=new Scanner(System.in);
        System.out.println("Agam yaşını giresin");

        int age=sc.nextInt();

        try {
            if(age<0){
                throw new IllegalArgumentException();//throw keyword ile excp obj oluşturularak hata tanımlanır ve fırlatılır, catch bloğun çalışmasını sağlar.
                // if elsede  throw olmazsa  catch çalışmaz  böylece şartımıza uymayan değer için de catch block a düşürerek daha pratic code yazıldı
            }else System.out.println("agam yaşın hayırlı olsun  " + age );
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (IllegalArgumentException e) {
            System.out.println(" nittin agam milattan önce mi kaldın adam gibi yaşını gir");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı  komut  handle edildi ");

        }
        System.out.println("Agam sorun handle edildi DEWAMKEE  :)");//Bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.
    }/*  // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..
​
        Scanner sc = new Scanner(System.in);
        System.out.print(" agam yasını giresen : ");
​
        int age = sc.nextInt();
​
       // if (age<18){
       //     System.out.println("yasınız : "+age+" ehliyet için uygun değil ");
       //     throw new IllegalArgumentException();//throw komutu try-catch block olmadan da istenen method body'de tanımlanabilir.
       // }
       // else System.out.println("yasınız : "+age+" ehliyet için uygun");
​
        try {
            if (age < 18) {
               throw new IllegalArgumentException();//throw keyword ile Excp obj olusturularak hata tanımlanır ve fırlatırlır
                // böylece sartımıza uymayan  değer için de catch block'a düşürerek daha pratik code yazıldı
              //  System.out.println("ehliyete basvurman için daha  : " + (18 - age) + "yıl var ...");
            } else System.out.println("agam ehliyete başvurabilirsin hayırlı lsun  " + age);
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (IllegalArgumentException e) {
            System.out.println("agam nidddin bu yaşda ehliyet mi alınır  !!!");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}*/
}
