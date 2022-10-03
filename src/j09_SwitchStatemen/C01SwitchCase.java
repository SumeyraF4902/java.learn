package j09_SwitchStatemen;

import java.util.Scanner;

public class C01SwitchCase {
    public static void main(String[] args) {
        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */
//TASK---> kullanıcının girdiği rakamı yazı ile print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.print("bir rakam giriniz:");
        int a=sc.nextInt();
        switch(a){
            case 0:
                System.out.println("Girilen rakam SIFIR");
                break;
            case 1:
                System.out.println("Girilen sayı BİR");
                break;
            case 2:
                System.out.println("Girilen sayı İKİ");
                break;
            case 3:
                System.out.println("Girilen rakam ÜÇ");
                break;
            case 4:
                System.out.println("Girilen rakam DÖRT");
                break;
            case 5:
                System.out.println("Girilen rakam BEŞ");
                break;
            case 6:
                System.out.println("Girilen rakam ALTI");
                break;
            case 7:
                System.out.println("Girilen rakam YEDİ");
                break;
            case 8:
                System.out.println("Girilen rakam SEKİZ");
                break;
            case 9:
                System.out.println("Girilen rakam DOKUZ");
                break;
            default:
                System.out.println("seni seviyorum annemmmmm");


        }




    }
}
