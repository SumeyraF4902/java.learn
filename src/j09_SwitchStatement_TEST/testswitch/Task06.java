package j09_SwitchStatement_TEST.testswitch;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner scan=new Scanner(System.in);
		System.out.println("\"VIP\" kısaltmasında hangi harfin kelime karşılığını öğrenmek istediğinizi belirtiniz:  ");
char harf=scan.next().toLowerCase().charAt(0);
switch (harf){
	case 'v':
		System.out.println("very");break;
	case 'ı':
		System.out.println("important");break;
	case 'p':
		System.out.println("person");
}


	}
}
