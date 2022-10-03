package j09_SwitchStatemen;

import java.util.Scanner;

public class C03_SwitchClass {
    public static void main(String[] args) {
        //TASK---> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz:");
        int a=scan.nextInt();
        switch (a){

            case 1:


            case 3:

            case 5:

            case 7:

            case 8:
            case 10:
            case 12:
                System.out.println(" girilen ay 31 gün içerir");
                break;
            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("girilen ay 30 gün içerir");
                break;
            case 2:
                System.out.println(" yılınızı giriniz :");
                int yıl=scan.nextInt();
                if(yıl%4==0){
                    System.out.println(" girilen ay Şubat ayı 29 gün içerir");
                }else System.out.println("girilen ay şubat ayı 28 gün içerir");
                break;

            default:
                System.out.println("sizin memlekette kaç ay var");
        }





    }
}
