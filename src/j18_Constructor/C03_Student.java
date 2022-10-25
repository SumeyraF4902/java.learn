package j18_Constructor;

public class C03_Student {
    //main olmayan sadece student obj create etmek için pojo-->(plan  old object java .=obje içi standart class kalıphane)
    // field
    String adı;
    String soyadı;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;
public void sosyalFaaliyet(){
    System.out.println("agam fiziksel zindelik =zihinsel zindelik. koş babam koş");
}
    @Override
    public String toString() {// obj referans değeri print etmemesi için obj datalarını stringe
        // çeviren method. tüm obj field print edilir. istemediklerini seçme.
        return "C03_Student{" +
                "adı='" + adı + '\'' +
                ", soyadı='" + soyadı + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }

    public void mezuniyet(){
        if (ortalama>=50){
            System.out.println("agam diploman hayırlı olsun");
        }else System.out.println( "agam seneye de bekleriz dewamkee");


    }
}
