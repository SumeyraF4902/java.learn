package j18_Constructor;

public class C04_Teacher {

String adı;
String soyAdı;
int tecrube;
String branş;
double maas;
int id;
boolean emekli;





    public void dersSaati(){

        System.out.println(" agam haftada  20 saatten sonra extraya girer  :)");
    }

    public C04_Teacher() {//parametrenin ezdiği default cons. yerine parametresiz cons. create edildi.
    }
    //king of TRICK-->parametreli constructor default cons. ezer.

    public C04_Teacher(String adı, String soyAdı, int tecrube, String branş, double maas, int id, boolean emekli) {//
        this.adı = adı;
        this.soyAdı = soyAdı;
        this.tecrube = tecrube;
        this.branş = branş;
        this.maas = maas;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "adı='" + adı + '\'' +
                ", soyAdı='" + soyAdı + '\'' +
                ", tecrube=" + tecrube +
                ", branş='" + branş + '\'' +
                ", maas=" + maas +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}

