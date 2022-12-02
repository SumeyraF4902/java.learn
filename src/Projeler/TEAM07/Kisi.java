package Projeler.TEAM07;

public class Kisi  {
    String adSoyad;
   String kimlikNosu;
    int yas;

    public Kisi() {
    }

    public Kisi(String adSoyad, String kimlikNosu, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNosu = kimlikNosu;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNosu() {
        return kimlikNosu;
    }

    public void setKimlikNosu(String kimlikNosu) {
        this.kimlikNosu = kimlikNosu;
    }

    public int getYas() {
        if(yas<0){
            yas*=-1;
        }
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
