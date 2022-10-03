package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
         /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

          */
        /*Scanner sc=new Scanner(System.in);
        System.out.print("sınav notunuzu giriniz:");
        int c=sc.nextInt();
        System.out.print("final notunuzu giriniz:");
        int a=sc.nextInt();
        System.out.println("proje notunuzu giriniz:");
        int proje=sc.nextInt();
       double grade=(c*0.30)+(a*0.50)+(proje*0.20);
        System.out.println("your grade is: " +grade);
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is a EVEN number");
        }
        else {
            System.out.println("number is odd number");
        }
    }
}