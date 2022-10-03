package j10_StringManipulasions;

public class C02_LenghtUzunluk {
    public static void main(String[] args) {
       /* lenght metodu girilen stringin uzunluğunu:içinde bulunan karakter sayısını return(çıktı-geridönüş)
        eder. bütün karakterleri(boşluk vs.) sayıp adedini verir.
        */
        String str="madem geldin dünyaya otur çalış javaya";
        int strKrtsayısı=str.length();
        System.out.println(strKrtsayısı);//38
        System.out.println(str);//madem geldin dünyaya otur çalış javaya
        String str1="";
        System.out.println(str1.length());//0 hiçlik,içinde hiçbirşey yok.string iki tırnak içine konan herşeydir.
        String str2=" ";
        System.out.println(str2.length());//1 boşluk bir karakterdir.
        String str3=null;
        System.out.println(str3.length());//çift tırnak içinde olmadığı için sayım yapmadı ,uzunluk almadı.




      /* TRİCK   System.out.println(str3.length());//burada hata verir.çift tırnak yok.Run time.

        null case sensitivedir. yani Null veya NULL yazılamaz, null bir değer değildir.(dutluk)
        sadece hiçliği gösteren bir pointer(giriş  noktası.işaretci).

       ***TRİCK null atanan stringler String metod çalışmaz.*/
      //  String name;  deklare edilmiş ama atanmamış string.ÖRNEK HEMEN ALTINDA.
       // name.concat(str1);//çalışmaz CTE VERİR.







    }
}
