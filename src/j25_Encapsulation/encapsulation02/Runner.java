package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("umit","K","umıtK33",33);//obj
        System.out.println("obj1.ad = " + obj1.ad);
        obj1.ad="Güzel insan Ümit Bey";
        System.out.println("obj1.ad = " + obj1.ad);
        System.out.println("obj1.soyAd = " + obj1.soyAd);
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setYas(-34);
        System.out.println("obj1.getYas() = " + obj1.getYas());//-34 if yapmadan önce - 34 verir

    }
}
