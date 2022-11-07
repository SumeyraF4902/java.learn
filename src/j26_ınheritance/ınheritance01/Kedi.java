package j26_ınheritance.ınheritance01;

public class Kedi extends  Mammal {//Mammal parent class child-torun
/*
Child class obj. olmadan parent class variable ve method lara ulaşabilir.
 */
    public Kedi() {// PARAMETRESİZ CONSTRACTER
        System.out.println("Agam ahanda kedi parametresiz con...");

    }
    public void cırmalama(){
        System.out.println("kedi fena cırmalar miyavlar");

    }
}
