package j09_SwitchStatemen;

import java.util.Scanner;

public class C02SwitchClass {
    public static void main(String[] args) {
        //TASK--> Kullanıcının girdiği ay sırasına göre ayın ismini print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz:");
        int ayNo=scan.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziren");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("ARALIK");
                break;

            default:
                System.out.println("doğru bir ay numarası giriniz");

        }
    }
}
