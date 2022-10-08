package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("bir string giriniz:");
		String k = sc.nextLine();


		int sayi=0;

		for (int i = 0 ; i<=k.length()-1 ; i++  ){
			if (k.charAt(i)>='0' && k.charAt(i)<='9'  ){
				sayi++;
			}

		}
		System.out.println(sayi);



	}


		}
