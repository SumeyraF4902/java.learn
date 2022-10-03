package C11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //TASK--->GİRİLEN ÜÇ NOTUN ORTALAMASINI HESAPLAYAN METHOD CREATE EDİNİZ.
        Scanner scan=new Scanner(System.in);
        System.out.println(" üç sınav notunuzu giriniz");
        double not1=scan.nextInt(),not2= scan.nextInt(),not3= scan.nextInt();
        double ortalama=(not1+not2+not3)/3;
        System.out.println(ortalama);
        ///veya 2 yol metod açarak yapıldı
      double  ortalamaHesaplamamız=ortalamahesapla(not1,not2,not3);
        System.out.println("ortalama notunuz=" +ortalamaHesaplamamız);

    }
    public static double ortalamahesapla(double not1,double not2,double not3) {
        return (not1+not2+not3)/3;
    }
}
