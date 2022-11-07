package j26_ınheritance.ınheritance02;

public class Kedi extends Mammal {//Mammal parent class child-torun
/*
Child class obj. olmadan parent class variable ve method lara ulaşabilir.
 */
    public Kedi() {// PARAMETRESİZ CONSTRACTER
        super();
        System.out.println("Agam ahanda kedi parametresiz con...");

    }
    public Kedi(String str) {// PARAMETRELİ CONSTRACTER
        this();
        System.out.println(super.c);
        System.out.println("Agam ahanda kedi parametreLİ con...");
    }
    int c=2;
    int d=5;

    @Override
    public void mC() {//Mammal parentden ezen method

        System.out.println("mC --> Kedi class meth call.");
    }
}//Class SONU
