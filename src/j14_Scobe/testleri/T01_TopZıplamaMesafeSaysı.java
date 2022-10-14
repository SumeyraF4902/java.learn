import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kaç metre yükseklikten atıyoruz?:");
        double yukseklik=sc.nextDouble();
        double toplamYol=0;
        int yereVsayısı=0;
        do{
            yereVsayısı++;
            toplamYol+=yukseklik;
            yukseklik*=(0.75);
            toplamYol+=yukseklik;

        }
        while(yukseklik>1);
            System.out.println(" topun aldığı toplam yol:"+toplamYol);
        System.out.println("topun yere vurma sayısı:"+ yereVsayısı);


        }



    }

