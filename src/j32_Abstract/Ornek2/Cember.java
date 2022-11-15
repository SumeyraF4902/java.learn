package j32_Abstract.Ornek2;

public class Cember extends Sekil{
    private double yarıCap;
    private final double pi=3.14;

    public Cember(double yarıCap) {//p'li cons.
        this.yarıCap = yarıCap;
    }

    public double getYarıCap() {
        return yarıCap;
    }

    public void setYarıCap(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    public double getPi() {// seti gelmez set değiştirmek için oluşturulur , pi yi final yaptığımız için değiştiremeyiz onun için set methodu gelmez
        return pi;
    }

    @Override
    public double alanHesapla() {
        return pi*this.yarıCap*this.yarıCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*pi*this.yarıCap;
    }
}
