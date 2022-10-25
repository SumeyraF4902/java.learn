package j18_Constructor;

public class C02_Arac {
        String marka;
        String model;
        int km=10;
        double motorHcm;
        boolean vitesAuto=false;
        boolean ikinciEl;
        int yıl;

    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();//DEFAULT CONS. İLE ARAÇ1 OBJ CREATE EDİLDİ.
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="XC90";
        arac1.motorHcm=2.4;
        ////  çıktı-->        volvo              XC90        50000   yılı yazmadığımız için=0  true            2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHcm);

        //task -->2. bir aracın tüm field larını atayarak print ediniz
        C02_Arac arac2= new C02_Arac();
        arac2.marka="Audi";
        arac2.model="C06";
        arac2.motorHcm=1.6;
        arac2.km=10000;
        arac2.yıl=2022;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.motorHcm+" "+arac2.km+" "+arac2.yıl);

        System.out.println("arac2 = " + arac2);//referansını verir.

    }

    @Override
    public String toString() {
        return "C02_Arac{" +
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

