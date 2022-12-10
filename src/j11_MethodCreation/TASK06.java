package j11_MethodCreation;

import java.util.Scanner;

public class TASK06 {
    public static void main(String[] args) {


    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
    Scanner sc= new Scanner(System.in);
        System.out.println("öğrenmek istediğniz yılı giriniz");
    int yil=sc.nextInt();
        System.out.println(artikYılMi(yil));
}

    private static boolean artikYılMi(int a) {
        boolean   artıkYıl=false;
        if((a%4==0 && a%100!=0)||(a%400==0)) {
            artıkYıl=true;
        }else artıkYıl=false;
        return artıkYıl;
    }

}
