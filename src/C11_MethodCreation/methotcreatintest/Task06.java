package J11_MethodCreation.methotcreatintest;

import java.util.Scanner;

public class Task06 {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

		System.out.println("kare, dikdörtgen ve üçgen kelimelerinden birini seçiniz");
		 String secim= sc.next().toLowerCase();
		System.out.println("1. sayıyı giriniz");
		int sayi1= sc.nextInt();
		System.out.println("2. sayıyı giriniz");
		 int sayi2= sc.nextInt();
secim(secim,sayi1,sayi2);

	}
public static void secim(String str, int sayi1, int sayi2) {
	switch (str){
		case "kare":
			sayi2=sayi1;
			kareAlan( sayi2,sayi2);
			kareCevre(sayi2,sayi2);
			break;
		case "dikdörtgen":
			dikdörtgenAlan( sayi1,sayi2);
			dikdörtCevre( sayi1,sayi2);
			break;
		case "üçgen"://eşkenar olarak alıyoruz

			üçgenAlan( sayi1);
			üçgenCevre(sayi1);
			break;
		default:
			System.out.println("hatalı secim yaptınız");
			secim(str, sayi1, sayi2);
	}

}

	private static void üçgenCevre(int sayi1) {
		System.out.println("üçgenin çevresi:"+(sayi1*3));
	}

	private static void üçgenAlan(int sayi1) {
		System.out.println("üçgenin yüksekliğini giriniz:");
		int yükseklik=sc.nextInt();
		System.out.println("üçgen alanı:"+((yükseklik*sayi1)/2));
	}

	private static void dikdörtCevre(int sayi1, int sayi2) {
		System.out.println("dikdörtgenin çevresi:"+(sayi1+sayi2)*2);
	}

	private static void dikdörtgenAlan(int sayi1, int sayi2) {
		System.out.println("dikdörtgrn alanı:"+(sayi1* sayi2));
	}

	private static void kareCevre(int sayi1, int sayi2) {
		System.out.println("kare çevresi: "+(sayi2+sayi2)*2);
	}

	private static void kareAlan(int sayi1, int sayi2) {
		System.out.println("kare alan: "+(sayi2*sayi2));
	}
}
