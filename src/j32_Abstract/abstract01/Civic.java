package j32_Abstract.abstract01;

public class Civic extends Lastik {//Honda parent abstract classa extends child concrete class
    /*
    extends honda yazılarak Honda class'a concrete bir civic class tanımlandı
    çözüm:
    a) unlmlementted (uyarlanmamış)method implement edilmeli
    b) parent honda classdan abstract keyword kaldırılmalı
    c) concrete olan child civic class abstract tanımlanmalı
     */
            // concerete class da abstract method tanımlanır mı?
   // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
    //TRİCK--> child concrete class parent abs classın  abs methodlarını mutlaka implement override etmeli
    @Override
    public void motor() {
        System.out.println("Agam 1.6 eco motor az yakar çok kaçar");
    }

    @Override
    void koltuk() {
        System.out.println("agam ucuz olsun diye kumaş koltuk, temiz kullanın");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");

    }
   public void lastikEbat(){
       System.out.println("21 inc lastik");
    }
     public int vites(){
        return 5;
    }
  //  Honda obj= new Civic(); honda oğlu civic
  //  Civic obj1= new Civic(); civic oğlu civic
}
