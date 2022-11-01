package j23_varargs_String_Builder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method toplamı
         */
        int arr[]={24,42,33,19,34,45,58,38};

        //TRİCK--=>varargs method parametreleri array gibi tanımladığı için varargs methoda parametre olarak array de verilebilir
        System.out.println( "varargs array değer Toplam = " + varargsTopla(arr));

        // Task  1-->Verilen array elemanları toplamı print eden method create ediniz.
        // Task 2-->task1 varargs ile çalışınız.
        System.out.println("arrToplam(arr)"  +arrTopla(arr));
        System.out.println("varargsTopla() = " + varargsTopla(24,42,33,19,34,45,58,38));

    }
    public static int arrTopla(int[]a) {
        int toplam = 0;
        for (int w : a) {
toplam += w;
        }
        return toplam;
    }
    public static int varargsTopla(int...b) {
        int toplam = 0;
        for (int s : b) {
            toplam += s;
        }
        return toplam;
    }
}
