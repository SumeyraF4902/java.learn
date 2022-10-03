import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı daha giriniz:");
        int i1 = scan.nextInt();
        System.out.print("bir sayı daha giriniz:");
        int i2 = scan.nextInt();
        System.out.print("bir sayı daha giriniz:");
        int i3 = scan.nextInt();
if (i1<i2 && i1<i3){
    System.out.println( i1);
}if(i2<i1 && i2<i3){
    System.out.println(i2);
        }if (i3<i1 && i3<i2){
            System.out.println(i3);
        }





    }
}
