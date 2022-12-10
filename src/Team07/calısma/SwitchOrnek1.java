package Team07.calısma;

import java.util.Scanner;

public class SwitchOrnek1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Girdiğiniz günün hafta içinde mi yoksa hafta sonunda mı ");
        System.out.println("gün giriniz");
        String gun=sc.next().toLowerCase();
        switch (gun) {
            case "pazartesi":
                case  "salı":
            case    "çarsamba":
            case    "perşembe":
            case    "cuma":
                System.out.println("girdiğiniz  gün hafta içidir");break;

            case   "cumartesi":
            case   "pazar":
                System.out.println("hafta sonu");  break;
            default:
                System.out.println( "tekrar deneyiniz");
        }

    }
}
