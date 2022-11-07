package j26_ınheritance.ınheritance02;

public class Mammal extends Hayvancık { //(memeli demek)--> Hayvancılık parent classın child class-baba
    public Mammal() {// PARAMETRESİZ CONSTRACTER
        this ('Y');// bu classın p'li classı call edildi
        System.out.println("Agam ahan da MAMMAL P siz cons...");
    }
    public Mammal(char c){//  p'li cons.'
        super(17);// parent hayvancılık clası call edildi
        System.out.println("Agam ahan da MAMMAL P li cons...");
    }
   public void mC(){
       System.out.println("mC--> Mammal class method call..");
   }
    int m=1;
    int c=4;

    @Override
    public void mM() {//parennten ezen method
        System.out.println("mM--> Mammal class method call..");//
    }
}//Class sonu
