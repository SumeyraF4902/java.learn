package j13_Break_Continue;

public class C05_OCA_type {
    public static void main(String[] args) {
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++){//apa  dış loop
            for (int col = 1; col <= 2; col++) {//daire  iç loop
                if (row * col % 2 == 0) continue ;//raw*col çift ise bekleme yapma devam et. count artma.ROW_LOOP İÇ VE DIIŞ LOP ARASINA BİR KOMUT GİRERSE ÇALIŞMAZ
                count++;
            }}

        System.out.println(count);


    }
}
