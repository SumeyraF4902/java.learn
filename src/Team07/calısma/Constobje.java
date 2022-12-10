package Team07.calısma;

public class Constobje {
    String marka;
    String model;
   private int km=10;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;
    Constobje (){}

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Constobje{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }
}
