package j33_Interface.task1;

public class Cember implements Sekil{
    @Override
    public int cevre(int... boyut) {
        return (int) (2*PI*boyut[0]);
    }

    @Override
    public int alan(int... boyut) {// pi double olduğu için cast int yaptık yani double int e çevirdik.
        // yada parametrede int  yerine douuble yazarsak hata vermez cast int yapmak zorunda kalmayız
        return (int) (PI*boyut[0]*boyut[0]);
    }
}
