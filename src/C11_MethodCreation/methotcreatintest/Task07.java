package J11_MethodCreation.methotcreatintest;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

int a=14;
int b=24;
int c=34;
        System.out.println(enkucuk(a, b, c));


    }

    private static int enkucuk(int a, int b, int c) {
        return (Math.min(a, Math.min(b, c)));
    }


}

