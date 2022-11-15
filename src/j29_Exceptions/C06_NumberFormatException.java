package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        //NumberFormatException--> Sayı formatında olmayan bir datayı parseInt() method runn ederek ınteger e çevrillir
        // Java da String içinde ki rakam karakterler parseInt() method ile integer değer atanabilir

        String str="1453";
        System.out.println("str+5 = " + str+5);//14535--> concat edildi
        int sayi=Integer.parseInt(str);// str deki rakam karakterler sayı variable atandı
        System.out.println("sayi = " + sayi);//1453
        System.out.println("sayi+5 = " + (sayi+5));//1458

        String id="57l622";//1 yerine l girilmiş
       // System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (NumberFormatException   e) {
            System.out.println("Agam l den 1 yazmamı istirsen:)");
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatıldı  komut  handle edildi ");
        }
        System.out.println("********");
        try {
            System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));//KOD ÇALIŞTI HATA VERMEDİ
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (NumberFormatException   e) {
            System.out.println("Agam l den 1 yazmamı istirsen:)");
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatıldı  komut  handle edildi ");

        }
        System.out.println("Agam sorun handle edildi DEWAMKEE  :)");//Bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.
    }
}
