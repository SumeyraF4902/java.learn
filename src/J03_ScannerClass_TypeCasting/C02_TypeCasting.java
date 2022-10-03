package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
byte b=127;
int i=b;
        System.out.println("i = " + i);
        int num=1453;
        double d1=17;
        System.out.println("d1 = " + d1);
double db=d1/num;
        System.out.println("db = " + db);
        double g=14.53;
        int ga= (int) g;
        System.out.println("ga = " + ga);
        int num3=150;
        byte b1= (byte) num3;
            System.out.println("b1 = " + b1);
            double d3=333;
            long l= (long) d3;
            System.out.println("d3 = " + d3);
            double d4=571.4444;
            long l2= (long) d4;
            System.out.println("l2 = " + l2);


            Scanner sc=new Scanner(System.in);
            System.out.println("Ascii değerini bulmak istediğiniz karakter giriniz :");
            char ch=sc.nextLine().charAt(0);
            int chasciideğeri=ch;
            System.out.println("chasciideğeri = " + chasciideğeri);


    }
}
