package j32_Abstract.Ornek2;

public abstract class Sekil {

    private String name;

    public Sekil() {// PARAMETRESİZ parent  CONSTRACTER
    }

    public Sekil(String name) {// PARAMETRELİ parent constructor
        setName(name);// eğer okul ismi olsaydı değişmesini istemeseydik başınafinal koyardık
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();

    public abstract double cevreHesapla();

    public String ciz() {
        return this.name + "  Çİzildi.";
    }

        public String toString() {//obj value'leri print eder.
            return
                    " şekil name='" + this.name + '\'' +
                            "\n şekil alan :" + this.alanHesapla() +// method call
                            "\n şekil cevre :" + this.cevreHesapla() +
                            "\n şekil" + this.ciz();// this method call edildi
        }

    }



