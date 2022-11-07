package j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {
       // C01_AccessModifier obj1= new C01_AccessModifier();// C01 AccessModifier class parametresiz cons. call edilemesi
        C01_AccessModifier obj2= new C01_AccessModifier(23,45);//public 2 parametreli cons. call edildi
            //agama public cons. selam :)
        C02_AccessModifier semra= new C02_AccessModifier();//default parametresiz cons. call edildi


        System.out.println("obj2.defaultYas = " + obj2.defaultYas);
        obj2.protectedMethod();
        System.out.println("obj2.publicYas = " + obj2.publicYas);
        System.out.println("obj2.protectedYas = " + obj2.protectedYas);
        //obj2.privateMethod();// private method call edilemez cte verir


    }
}
