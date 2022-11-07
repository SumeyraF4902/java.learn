package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation01 {//pojo class


   private String name="Gamze Hanım";
   private int id=1001;

    public C02_Encapsulation01() {
    }

    public C02_Encapsulation01(String name, int id) {
        this.name = name;
        this.id = id;
    }
public String isimVer(){//getter methot
        return name;
    }
    public  int idVer(){//getter methot
        return id;
    }
    public void isimDegis(String isim){//setter methot
        this.name = isim;
    }
    @Override
    public String toString() {
        return "C02_Encapsulation01{" +
                "name='" + name + '\'' +
                ", id=" + id ;
    }
}
