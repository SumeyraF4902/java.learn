package j24_AccessModifier.farkliPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {



    private String PrivateteamLead="Hakan Bey";
    String defaultName="Cebraik Bey";
    protected String protectedName="Dilek Hanım";
    public  String puublicName="Gamze Hanım";

    public static void main(String[] args) {

        C01_AccessModifier obj9=new C01_AccessModifier(23,63);//public cons.//agama public cons. selam :)
        System.out.println("obj9.publicYas = " + obj9.publicYas);//public variable//obj9.publicYas = 48
        //obj9.defaultYas//class dıışı olduğu için erişilemez
       // obj9.protectedMethod()//protected method package dışı call edilemez
    }






}
