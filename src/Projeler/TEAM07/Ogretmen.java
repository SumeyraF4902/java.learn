package Projeler.TEAM07;

public class Ogretmen extends Kisi{
    String brans;
    String sicilNo;

    public Ogretmen(String brans, String sicilNo) {
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen[" +
                "brans='" + brans + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", kimlikNosu='" + kimlikNosu + '\'' +
                ", yas=" + yas +
                "]\n";
    }

    public  Ogretmen(){}
    public Ogretmen(String adSoyad, String kimlikNosu, int yas, String brans, String sicilNo) {
        super(adSoyad, kimlikNosu, yas);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}
