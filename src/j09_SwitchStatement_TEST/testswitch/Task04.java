package j09_SwitchStatement_TEST.testswitch;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("bir ay giriniz :  ");
		String ay = scan.next().toLowerCase();
		switch (ay) {
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "ağustos":
			case "ekim":
			case "aralık":
				System.out.println("bu ay 31 gün çekiyor");
				break;

			case "şubat":
				System.out.println("bu ay 28 veya 29 gün çekiyor");break;
			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":
				System.out.println("bu ay 30 gün çekiyor.");
			default:
				System.out.println("böy bir ay daha keşfedilmedi!!!!");


		}

	}
}
