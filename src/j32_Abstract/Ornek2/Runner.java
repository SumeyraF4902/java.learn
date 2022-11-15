package j32_Abstract.Ornek2;

public class Runner {
    public static void main(String[] args) {


        Dikdörtgen dd = new Dikdörtgen(24, 7);
        dd.setName("Dikdörtgen");
        dd.cevreHesapla();//168
        dd.alanHesapla();//62
        System.out.println("dd.ciz() = " + dd.ciz());
        //üsttekileri ayrı ayrı yazmak yerine sadece alttaki dd yazarsak hepsi gelmiş olur
        System.out.println(dd);//null şekil classında public String toString() gider buradaki(herşeyi getirir) this name hiçbirşey atamadığımız için null getirdi, cevre ve alanı hesaplayıp getirdi.

            Cember c1=new Cember(39);
            c1.setName("Cember");//objenin ismini atadık atamasaydık null verirdi
        System.out.println(c1);

    }
}