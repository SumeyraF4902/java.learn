package day08;

import java.util.Scanner;

public class HesapMakinesi {
    double x;
    double y;
    char secim;

    public HesapMakinesi(double x, double y, char secim) {
        this.x = x;
        this.y = y;
        this.secim = secim;
    }

    public HesapMakinesi() {
    }

    public double toplama(double x, double y) {
        return x + y;
    }

    public double cikarma(double x, double y) {
        return x - y;
    }

    public double carpma(double x, double y) {
        return x * y;
    }

    public double bolme(double x, double y) {
        return x / y;
    }

    public void giris() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz:");
        x = sc.nextDouble();
        System.out.println("2. sayıyı giriniz:");
        y = sc.nextDouble();
        System.out.println("yapmak istediğiniz işlemi giriniz : +,-,*,/");
        secim = sc.next().charAt(0);
        hesapla();
    }
    public void hesapla(){
        switch (secim){
            case '+':
                System.out.println("toplama sonucu: "+toplama(x,y));break;
            case '-':
                System.out.println("çıkarma sonucu: "+cikarma(x,y));break;
            case '*':
                System.out.println("çarpma sonucu: "+carpma(x,y));break;
            case '/':
                System.out.println("bölme sonucu: "+bolme(x,y));break;


        }
    }
}
