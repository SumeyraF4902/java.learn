package Projeler;

import java.util.ArrayList;
import java.util.Random;

public class Renkler {
    public static void main(String[] args) {
        ArrayList<String> renkler = new ArrayList();
        renkler.add("\u001B[35m");
        renkler.add("\u001B[30m");
        renkler.add("\u001B[31m");
        renkler.add("\u001B[32m");
        renkler.add("\u001B[33m");
        renkler.add("\u001B[34m");
        renkler.add("\u001B[35m");
        renkler.add("\u001B[36m");
        renkler.add("\u001B[37m");
        // Random sınıfından bir nesne oluşturuyoruz .
        Random rnd = new Random();
        for(int i = 1 ; i <= 100; i++){
            /* Burada rnd.nextInt metodu ile dizi boyutundan bir eksik olan sayıya kadar rastgele bir sayı üretip ,
            o indisteki elemanın renk kodunu yazdırıyoruz. */
            System.out.print(renkler.get(rnd.nextInt(renkler.size()-1))+ " "+ i);}

        //proje hazırlarken en üstte böle bir yapı oluşturabilirsin
     /*   public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_SIYAH = "\u001B[30m";
        public static final String ANSI_KIRMIZI = "\u001B[31m";
        public static final String ANSI_YEŞİL = "\u001B[32m";
        public static final String ANSI_SARI = "\u001B[33m";
        public static final String ANSI_MAVI = "\u001B[34m";
        public static final String ANSI_MOR = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_BEYAZ = "\u001B[37m";*/
    }
}
