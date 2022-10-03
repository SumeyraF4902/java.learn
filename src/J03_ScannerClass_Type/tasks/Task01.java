package J03_ScannerClass_Type.tasks;

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
        System.out.println("final notunuzu giriniz");
        double  fn=sc.nextDouble();
        System.out.println("proje notunuzu giriniz");
        double  pn=sc.nextDouble();
        System.out.println("vize notunuzu giriniz");
        double  vn=sc.nextDouble();
        System.out.println("Your grade is:"+ (fn*0.50+vn*0.30+pn*0.20));
        System.out.println(fn*0.50);
        System.out.println(vn*0.30);
        System.out.println(pn*0.20);

    }
}
