package j33_Interface;

public class Runner {
    public static void main(String[] args) {

        Sahin dgshn= new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        System.out.println("dgshn.sisLamp() = " + dgshn.sisLamp());// default concaret method obje ile call edilir
        dgshn.yakıt();
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
       // System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);-> aynı isimli variable interface name ile call edilir

       // icDonanım.KUMAS="deri"; CTEVERİR FİNAL vARİABLE ATAMA YAPILMAZZ
        System.out.println("icDonanım.RENK = " + icDonanım.RENK);
        System.out.println("icDonanım.KUMAS = " + icDonanım.KUMAS);
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        dısDonanım.anten();// Static concaret method ınterface name ile call edilir

    }
}
