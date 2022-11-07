package j26_ınheritance.ınheritance01;

public class Mammal extends Hayvancık { //(memeli demek)--> Hayvancılık parent classın child class-baba
    public Mammal() {// PARAMETRESİZ CONSTRACTER
        System.out.println("Agam ahan da MAMMAL P siz cons...");
    }
    public void sutBeslenme(){
        System.out.println("bebeleri süt ile beslenir");
    }
    public void dogum(){
        System.out.println("nur topu gibi yavrusu olur.");
    }
}
