package Projeler.Depo_Projesi;

public class Urunler {
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private int raf;
    static int idver = 1000;
    private int id;
    public Urunler() {
    }

    public Urunler(String urunIsmi, String uretici, int miktar, String birim, int raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
        this.id = idver++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Urunler(String urunIsmi, String uretici, String birim) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.id = idver++;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }





}
