package j23_varargs_String_Builder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
                 /*
   String = > daha yavas ,Immutable==> degisemez,
   String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

   1) Java pass-by-value kullanir
   2) String Class'i immutable Class'dir.

    StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
    StringBuffer synchronized,thread safe.

   StringBuilders = mutable==>degisebilir ,
   not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

   1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
   StringBuilder isimli bir class uretmistir.
   2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
   "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
   "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
   "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
   3) Ayni anda bir cok isin yapilmasina "multi thread ing"(iplik) denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
  	Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

				 */
        //main sonu
        String str = "JavaCAN";
        System.out.println("method öncesi : "+str);//  javaCAN

        strBirlestir(str);// str makyaja gitti
        System.out.println("method sonrası : "+str);//javaCAN  inmutable  yani değişmez
        // Task--> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time surelerini karşılaştırın
        String str1="";
        StringBuilder sb1=new StringBuilder("");
        LocalTime str1Timebasla=LocalTime.now();// str1 Döngü başlama zamanı
        System.out.println("str1Timebasla = " + str1Timebasla);
        for (int i=0; i<50000;i++){
            str1+=i;
        }
        LocalTime str1Timebitis=LocalTime.now();//str1 Döngü bitiş zamanı
        System.out.println("str1Timebitis = " + str1Timebitis);

        LocalTime sb1Timebasla=LocalTime.now();//sb1 Döngü başlama zamanı
        System.out.println("sb1Timebasla = " + sb1Timebasla);
        for (int i=0; i<50000;i++){
            sb1.append(i);
        }
        LocalTime sb1Timebitis=LocalTime.now();//sb1 Döngü bitiş zamanı
        System.out.println("sb1Timebitis = " + sb1Timebitis);
    }//main sonu
    public static void strBirlestir(String str){
        System.out.println(str+" agama selam olsun");

    }

}
