package j33_Interface.task1;

public class Runner {
    public static void main(String[] args) {
        Cember c= new Cember();//method tanımlarken sout demediğimiz için  bunların hepsini sout içine alırız
        c.alan(4);
       c.cevre(4);
        System.out.println("cember alan= " + c.alan(4));
        System.out.println("cember cevre = " + c.cevre(4));

        Dikdortgen d= new Dikdortgen();

        System.out.println("d.alan(4,5) = " + d.alan(4, 5));
        System.out.println("d.cevre(4,5) = " + d.cevre(4, 5));
        System.out.println("d.cevre(24,38) = " + d.cevre(24, 38));

        Kare k= new Kare();

        System.out.println("k.alan(5) = " + k.alan(5));
        System.out.println("k.cevre(8) = " + k.cevre(8));

    }
}