package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner sc= new  Scanner(System.in);

		System.out.println("isim ve soyisimnizi giriniz");
		String str = sc.nextLine();
			int a=0;
			while (a<=str.length()-1){
				System.out.print(str.charAt(a)+" ");
				a++;
			}



	}

}
