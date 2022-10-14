package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */


		Scanner sc = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {

			System.out.println(a + "*" + i + "=" + (a * i));
		}
	}


}
