package j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {
        //  ArithmeticException -> Matematiksel işlemlerde oluşan RTE Exception'dur
        String str = "";
        // str.charAt(2);//RTE->StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);

        System.out.print("agam 1. sayı giresen : ");
        int sayi1 = sc.nextInt();

        System.out.print("agam 2. sayı giresen : ");
        int sayi2 = sc.nextInt();

        int oran;//RTE -> ArithmeticException/ by zero

        try {//dene-> hatanın olma ihitmali oldugu code block
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz catch block try block exception hata yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynı anda  sadece bir catch block çalışabilir, hiç bir catch block çalışmaya da bilir
               3- parent - child ilişkisi olan catch lerde child önce yazılmalı aksi halde CTE verir

             */
            oran = sayi1 / sayi2;//try blokta hata yakalandığı satırdan sonra try diğer satırlar değil ilgili catch block çalışır

            System.out.println(oran);
            System.out.println("agam try block'tan selamlar :) ");
        }
        catch (ArithmeticException falanFilan) {//child exception, parent exception(Exception ebikGabık)
            System.out.println("Agam bölmede böen sıfır olamaz  :( "+ falanFilan.getMessage());//// by-zero-->Exception
            // oluştuğunda  sadece hata mesajı print etmek için getMessage() kullanılır.
            falanFilan.printStackTrace();// oluşan Exception tüm detay bilgisi print etmek için kullanılır.
            System.out.println("agam çırak catch den selemlar:)");
        }
        catch (ArrayIndexOutOfBoundsException arrayExc){
            System.out.println("Agam arrayda olmayan eleman istirsen:)");
        }
        catch (Exception ebikGabık) {//Exception Class tum exceptionların Hz Ademi parent class->bad practice
            // hata yakalndıgında yapılacak aksiyonların oldugu block

            //Exception-> olusan hata Data type
            //ebikGabık-> java'nın olusan exception'a atayacagı obj name best parctice:e
            System.out.println("agam nişledingg 0 hiç böler mi :( ");
            System.out.println("agam usta catch block'tan selamlar :) ");
        }
        finally {//catch block'lardan sonra istenirse finally block kullanılabilir
            /*
            try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
            hata d nlanır.ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hsts olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
            System.out.println("Agam finally block'tan selamlar :)");
        }
        //catch (
        //        ArithmeticException falanFilan) {//child exception parent exception(Exception ebikGabık) den sonra tanımlandığı için CTE
        //}
        System.out.println("Agam sorun handle  DEWAMKEEE :) ");//pr sonuna kadar çalıştı mesaj

    }
}
