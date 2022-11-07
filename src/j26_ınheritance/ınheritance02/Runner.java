package j26_ınheritance.ınheritance02;

import j26_ınheritance.ınheritance01.Koyun;
import j26_ınheritance.ınheritance01.Paluk;

public class Runner {


      public static void main(String[] args) {
         Kedi k1= new Kedi();
          System.out.println("k1.a = " + k1.a);//0  hayvancılık classdan call edildi
          System.out.println("k1.c = " + k1.c);// 2 hem kendinde hemde mammalda yani babada var. öncelikle kendindekini kullanır.özelden -->genele
          System.out.println("k1.d = " + k1.d);//5// kedi classdan call  edildi
          System.out.println("k1.m = " + k1.m);// 1 ---m hem dedede , hem babada varsa babadaki ni alır.
          //özellikler özelden genele gider önce çocuk sonra baba, sonrada dede.
k1.mA();//parent Hayvancık classdan call edilir
k1.mC();//kedi classdan call edildi
k1.mM();//mammal class call edildi
          /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */

/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/
Mammal k2=new Kedi("Kevser Hanım");//data type parentmammal class ama constructorı parametreli kedi class
          System.out.println("k2.c = " + k2.c);//4
          System.out.println("k2.m = " + k2.m);//0
          System.out.println("k2.a = " + k2.a);//1
//k2.d--> CTE verir obj Data Type Mammal class d variable yok call edilemezzzzz
          k2.mA();//hayvancılık class call edildi
          k2.mC();//kedi class call edildi
          k2.mM();//mammal class call edildi

          Hayvancık k3=new Kedi();
          System.out.println("k3.m = " + k3.m);//3
          System.out.println("k3.a = " + k3.a);//0
          //  k3.c -> data type hayvancık class olduğu için classda olmayan  variables call edilemezzzzzzzzzzzzzzzz
            k3.mA();//hayvancılık class call edildi
            k3.mM();//mammal class call edildi
            Mammal m1=new Mammal('$');
          System.out.println("m1.m = " + m1.m);//1
          System.out.println("m1.a = " + m1.a);//0
          System.out.println("m1.c = " + m1.c);//4
          //m1.d--> parent mammal class  child kedi classdan variable call edemez
          m1.mA();// mammal class call edildi
          m1.mM();// mammal class call edildi
          m1.mC();// mammal class call edildi

      }



}
