package j26_ınheritance.task01;

public class Runner {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);//Agama A classtan hürmetler  obje ile call edildi ama bu bed practistir.
        B b=new B();
        System.out.println("b.mesaj = " + b.mesaj);//b.mesaj = static variable inheritance da classname olmadan doğrıdan call edilir
        System.out.println("A.mesaj = " + A.mesaj);//A class name ile static mesaj variable call edildi

    }
}
