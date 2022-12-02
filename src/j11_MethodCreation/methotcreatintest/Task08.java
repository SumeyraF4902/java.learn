package J11_MethodCreation.methotcreatintest;

import java.util.Scanner;

public class Task08 {

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
        System.out.println("öğrenmek istediğiniz yılı giriniz");
        int  yil=sc.nextInt();
        System.out.println(artikYilMi(yil));

    }

    private static boolean artikYilMi(int yil) {

    boolean artikYilMi= false;
        if((yil%4==0  && yil%100!=0) || yil%400==0){
            artikYilMi= true;
        }else artikYilMi= false;
        return artikYilMi;
    }
}
