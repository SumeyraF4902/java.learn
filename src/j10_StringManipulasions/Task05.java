package j10_StringManipulasions;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("adınızı  giriniz:");
        String str1=sc.nextLine();
        System.out.println(" ikinci adınızı  giriniz:");
        String str3=sc.nextLine();

        System.out.println("soyadınızı giriniz:");
                String str2=sc.nextLine();
        System.out.print(str1.substring(0,1).toUpperCase()+str1.substring(1));
        System.out.print(" "+str3.substring(0,1).toUpperCase()+str3.substring(1));
        System.out.println("  "+str2.substring(0,1).toUpperCase()+str2.substring(1));



    }
}
