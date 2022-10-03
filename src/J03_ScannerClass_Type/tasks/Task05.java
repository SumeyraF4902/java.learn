package J03_ScannerClass_Type.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
Scanner sc=new Scanner(System.in);
		System.out.println("iki tam sayı giriniz:");
		int sayı=sc.nextInt();
		int say=sc.nextInt();
		double sonuc=(say/sayı)+(say*sayı)+(say-sayı)+(say+sayı);
		System.out.println("sonuç="+sonuc);

	}

}
