import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {
       // BİİTTTTTTTTTİİİ
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:");
        int yas=sc.nextInt();
        if(yas>=18){
           if (50>yas&& yas>=18) {
               System.out.println("Birkez oy kullanabilirsiniz");
           } else if (70>yas&& yas>=50) {
               System.out.println("iki kez oy kullanabilirsiniz");
           } else if (yas>=70) {
               System.out.println("üç kez oy kullanabilirsiniz");
           }

        }else System.out.println("yaşınız oy kullanmaya uygun değil");
    }
/* Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */



}