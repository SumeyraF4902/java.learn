package j23_varargs_String_Builder.Varargs;

public class task02 {
    public static void main(String[] args) {
        /* taask
        girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan Method create ediniz
         */
        System.out.println("toplaCarp(2,24,23,38,33,21,59,26,10) = " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));
        int arrTop[] = {24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println("toplaCarp(2,arrTop) = " + toplaCarp(2, arrTop));
    }//main sonu
    public static int toplaCarp(int carpilacakSayi, int... toplanacakSayılar) {
        int toplam = 0;
        for (int a : toplanacakSayılar) {
            toplam += a;
        }
        return carpilacakSayi * toplam;
    }// yol for(int i = 1; i<=a.length-1;i++) {
    //toplam+=a[i];
}
   // int sonuc = a[0]*toplam;





