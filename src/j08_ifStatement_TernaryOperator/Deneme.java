package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
        System.out.println("Pazartesi 1\nSalı 2\nÇarşamba 3\nPerşembe 4\nCuma 5\nCumartesi 6 \nPazar  7\n Haftanın kaçıncı gününde olduğunuzu giriniz");
        int gun=scan.nextInt();
        int songun=(100%7)+gun;
        switch (songun){
            case 1:
                System.out.println("Pazartesi ");
                break;
            case 2:
                System.out.println("Salı ");
                break;
            case 3:
                System.out.println("Çarşamba ");
                break;
            case 4:
                System.out.println("Perşembe ");
                break;
            case 5:
                System.out.println("Cuma ");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("lütfen tekrar deneyiniz");





        }








    }
}





