package J06_LOgical_Mantıksal_Operators.test1;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		
Scanner scan=new Scanner(System.in);
		System.out.println("üç basamaklı bir sayı giriniz.");
		int t=scan.nextInt();
		int toplam=((t/100)+t%10);
		System.out.println("toplam = " + toplam);

		
	}

}
