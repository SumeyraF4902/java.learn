package j10_StringManipulasions;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
    String str="java bilen sırtı yere gelmez";
        System.out.println(str.substring(10));
        //str datasının son 10 karakterini yazdırınız.
        System.out.println(str.substring(str.length() - 10));
        System.out.println(str.substring(0,10));//ilk 10 karekteri verir. 0 -9 dahil 10 hariç.
        System.out.println(str.substring(0,1));//ilk karakteeri verir 0. karakter.
        //TASK--> GİRİLEN DÖRT HARFLİ KELİMEYİ TERSTEN PRİNT EDEN CODE CREATE EDİNİZ.
        Scanner scan=new Scanner(System.in);
        System.out.println("dört harfli bir kelime girin");
String kelime= scan.next();
if (kelime.length()!=4){
    System.out.println("size dört harfli demedik mi");
}else{
    System.out.println((kelime.substring(3,4))+(kelime.substring(2,3))+(kelime.substring(1,2))+(kelime.substring(0,1)));}
//  2.YOL ELSE DEN SONRA SON KARAKTER İÇİN (kelime.substring(.kelime.length()-1)); bu son karakteri verir.diğerleri aynı kalır.




    }
}
