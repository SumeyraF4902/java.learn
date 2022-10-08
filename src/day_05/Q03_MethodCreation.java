package day_05;

import java.util.Scanner;

public class Q03_MethodCreation {



    /*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen m ve km ye dönüştürmek istediğiniz sayıyı giriniz");
        double santiMeter=sc.nextDouble();
        System.out.println(metre(santiMeter));
        System.out.println(kilometre(santiMeter));
        convertFromSM(santiMeter);
    }

    private static double metre(double x) {
        return x/100;

    }
    public static double kilometre(double x){
        return x/100000;
    }
    public static void convertFromSM(double sayi){
        System.out.println("girilen santimetre değeri"+sayi/100+" metre\n"+sayi/100000+" "+"kilometredir");
    }

}






