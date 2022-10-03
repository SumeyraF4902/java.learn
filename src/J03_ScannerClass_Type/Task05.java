package J03_ScannerClass_Type;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.


		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen  2 tam sayi :giriniz	");
		int tam=scan.nextInt();
		int tam1=scan.nextInt();
		int dortIşlem=(tam+tam1)*(tam-tam1)/tam1;
		System.out.println("dortIşlem = " + dortIşlem);
	}

}
