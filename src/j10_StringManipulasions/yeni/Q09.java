package j10_StringManipulasions.yeni;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String line=scan.nextLine();
        if(line.length()%2==0) {
            System.out.println(line.substring(0, line.length() / 2));
        }else System.out.println("kelimeniz çift sayı olmadığı için ortası yok");
    }
}
