package j10_StringManipulasions;

public class C01_Concatenation {
    public static void main(String[] args) {
        /* concat medodu içine (parametre) aldığı string variable i çalıştığı stringin sonuna ekler.
        javada + işlemi yapılırken eğer enaz bir string variable varsa java toplama değil concat yapar.
         */
        String name="Nur";
        String meslek="Qa tester";
        System.out.println(name.concat(meslek));//Nur Qa tester
        System.out.println(name );//Nur
        //TRİC-->String metodları variable gecici değişiklik yapar.
        //ama değişken atama yapılırsa kalıcı değişir.
        name=meslek.concat(name);
        System.out.println("name = " + name);//Qa tester Nur
        System.out.println(name.concat(true+ " :)"));//Qa tester Nurtrue:)
      //  TRİCK--> Concat metodu parametre olarak tüm dataları Stringe çevirip concat (birleştirme)eder.


    }
}
