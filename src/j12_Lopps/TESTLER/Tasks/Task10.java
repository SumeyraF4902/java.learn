package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
Scanner sc= new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayı= sc.nextInt();
        int a=1;
        while (a<=sayı){
            System.out.print(a+ " ");
            a+=2;
        }


    }
}
