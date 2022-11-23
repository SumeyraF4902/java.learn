package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskProject {
     /*
                     1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                     2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

                     saveInfo() method olusturun:
                     3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                     4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                     5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

                	 getInfo() method olusturun:
          		     1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                     2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

                     removeInfo() method olusturun:
                     1)Kimlik numarasini girerek data silin.
                     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                     3)Collection bos ise kullaniciya hata mesaji verin.

                     selectOption() method olusturun:
                     1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
               */
     Scanner sc=new Scanner(System.in);
     public static void main(String[] args) {
          saveInfo();
     }
     public static void saveInfo() {
          Map<Integer,String> map=new HashMap<>();
          Scanner sc=new Scanner(System.in);
          System.out.println("isminizi giriniz");
          String ad=sc.nextLine();
          System.out.println( "tc nizi giriniz");
          int tc=sc.nextInt();
          System.out.println("adresinizi giriniz");
          String adres=sc.nextLine();
          sc.nextLine();
          System.out.println("telefon numaranızı giriniz");
          String telNo=sc.nextLine();
          String concat=ad+" "+adres+" "+telNo;

}
}
