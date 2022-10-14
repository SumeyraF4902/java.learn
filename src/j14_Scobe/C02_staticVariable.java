package j14_Scobe;

import static j14_Scobe.C01_InstanceVariable.staticMethod;


public class C02_staticVariable {
    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir*/


        static String firmaName="Clarusway";
         static int firmaID;
            static boolean firmaIT;//güneş


         public static void main(String[] args) {//main başı
             System.out.println("firmaID = " + firmaID);//0
             firmaID = 1001;// static variable name ile call --> best practice
             System.out.println("firmaID = " + firmaID);//1001
             C02_staticVariable.firmaIT=true;//classname ile static variable called--> bad practice
             staticMethod();//static method maine call edildi.->astral galaxy seyahat
           //  non_staticMethod();//sefil dünyalı galaxiye çekamaz
         }//main sonu
    public static void staticMethot() {//static method galaxy
             firmaID=2002;// static verable call
        System.out.println("yeni ID hayırlı olsun"+firmaID);

    }
    public void non_staticMethod(){// non-satatic method--> sefil dünyalı
             firmaName= "JavaCAN";//
        System.out.println("yeni firmanız"+ firmaName);

    }

}
