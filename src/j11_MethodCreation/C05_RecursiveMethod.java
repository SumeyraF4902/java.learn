package j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
    public static void main(String[] args) {
/*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

/* Faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir.
0!=1 1!=1 2!=2*1....
 Task ---> GİRİLEN sayının faktöriyelini hesaplayan
 method create gidiniz
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz  :");
        int sayi= sc.nextInt();

        System.out.println(faktöriyel(sayi));


    }//main dışı
    public static int faktöriyel(int a){
        if (a>=1){
            return a*faktöriyel(a-1);
        }else return 1;


    }
}
