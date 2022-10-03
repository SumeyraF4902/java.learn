package J03_ScannerClass_Type;

import java.util.Scanner;

public class Task01 {
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
        Scanner sc=new Scanner(System.in);
        System.out.print("LÜtfen sınav notunuzu  giriniz  :");
        int Midtermgrade= sc.nextInt();

        System.out.print("final notunuzu giriniz :" );
        int finalNotu=sc.nextInt();
        System.out.print("lütfem poje notunuzu giriniz");
        int projeNotu= sc.nextInt();


        System.out.println("genel ortalama durumunuz  : " +(Midtermgrade*30/100+finalNotu*50/100+projeNotu*20/100));




    }
}
