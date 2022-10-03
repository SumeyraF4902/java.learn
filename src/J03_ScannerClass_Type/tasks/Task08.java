package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

Scanner sc=new Scanner(System.in);
        System.out.println("vize bir notunuzu giriniz:");
        int vize= sc.nextInt();
        System.out.println("vize  iki notunuzu giriniz:");
        int vize2= sc.nextInt();
        System.out.println("final notunuzu giriniz:");
        int f= sc.nextInt();
        System.out.println("geçme notunuz:"+ ((vize2+vize)/2*0.30+f*0.70));


    }
}
