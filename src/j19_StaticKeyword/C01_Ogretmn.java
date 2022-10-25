package j19_StaticKeyword;
/*
   =>Class 'in icinde methodların dışında oluşturulan variablera "instance variable" denir.
   =>Class'ın içinde methodların dışında oluşturulan static variable 'lara "Class variable" denir.
   =>Instance variable 'lar gibi class variable (static variable )lar initial edilmezse (ilk değere ataması)default value ataması yapılır.
   =>Static variable'lar call etmek için object oluşturmaya gerek yoktur.
   =>Bulunduğu class içinden static yapılara ulaşılabilir. farklı class'lardan ClassName static yapı class name ile call edilir.
   farklı class'da obj name ile değil class name ile call edilir.
   =>Instance variable (Object Variable )'lar call etmek için object create edilmesi zorunludur. Object oluşturmadan
   instance variable 'a ulaşılamaz.
   => Static variable 'lara object ile call edilebilir ama tavsiye edilmez.
   =>Eğer static variable'lara object ile call edilirse Java sarı alt cizgi ikaz eder. -->BAD PRACTİCE
   =>Static keyword hafıza optimizasyon için kullanılır ve memory'de 1 kez oluşturulur.

   bir obj static variable değeri değişirse tüm obj variable değeri değişir.
   static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

   Trick--> bir variable , methoda doğrudan class name ile obj olmadan call etmek için static olmalıdır.
    */
public class C01_Ogretmn {
    // fields
    String isim;//inst. variable
int tecrube;//inst. variable
   static String okul;
    public C01_Ogretmn(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;

    }
    public static void maasHesapla(){// static
        System.out.println("agam helali hoş olsun afiyetle maaşı harca");
    }
    public void evlilikYıldonumu(){//static olmayan
        System.out.println("agam bir yastıkta enaz kırk yıl :) ");
    }
}
