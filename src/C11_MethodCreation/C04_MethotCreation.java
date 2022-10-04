package C11_MethodCreation;

import static C11_MethodCreation.C04_MethodDepo.gecmeNotu;

public class C04_MethotCreation {// motor

    public static void main(String[] args) {
        String name="ali";
        C04_MethodDepo.gecmeNotu(24);//depo classtan class name ile method call edildi
        C04_MethodDepo.topla(3,5);//diğer köyün amelesi
        /*
        farklı classtan method call etmek için,,
        1. method static>gökteki güneş gibi
        2. ClassName.methotName()şeklinde call edilir.
        aynı classdaki method doğrudan methodName ile call edilir
         */
        selamVer();//aynı classdan methodname ile call edildi,--kendi köyünün amelesi
    }//MAİN DIŞI
    public static void selamVer(){
        System.out.println("agam selamlar :)");
    }
}
