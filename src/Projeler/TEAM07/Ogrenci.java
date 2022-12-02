package Projeler.TEAM07;

public class Ogrenci  extends Kisi{
    int okulNo;
    String sınıfNo;
    private static int no=100;

    @Override
    public String toString() {
        return "Ogrenci[" +
                "okulNo=" + okulNo +
                ", sınıfNo='" + sınıfNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", kimlikNosu='" + kimlikNosu + '\'' +
                ", yas=" + yas +
                "]\n";
    }

    public Ogrenci(){}
    public Ogrenci(int okulNo, String sınıfNo) {
        this.okulNo = okulNo;
        this.sınıfNo = sınıfNo;
    }

    public Ogrenci(String adSoyad, String kimlikNosu, int yas, String sınıfNo) {
        super(adSoyad, kimlikNosu, yas);
        this.okulNo = no++;
        this.sınıfNo = sınıfNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getSınıfNo() {
        return sınıfNo;
    }

    public void setSınıfNo(String sınıfNo) {
        this.sınıfNo = sınıfNo;
    }
}

