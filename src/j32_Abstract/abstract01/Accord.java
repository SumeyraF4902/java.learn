package j32_Abstract.abstract01;

public class Accord extends  Honda{
    @Override
    public void motor() {// implement edilen abs methot
        System.out.println("Agam 2.0 turbo ateşle hız felakat");
    }

    @Override
    void koltuk() {// implement edilen abs methot
        System.out.println("Agam deri koltuk ter yapar");
    }

    @Override
    void kapı() {// implement edilen abs methot
        System.out.println( "Agam vakumlu kapı çarpılmayasan");

    }

    @Override
    void sunrooff() {// renk farklı alsanda olur almasanda ama diğerlerini almazsak olmaz. ovirride edilen method
        System.out.println("Agam sigara yakınca camı açma");
    }
}
