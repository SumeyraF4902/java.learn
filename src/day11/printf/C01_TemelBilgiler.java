package day11.printf;

public class C01_TemelBilgiler {
    //https://www.digitalocean.com/community/tutorials/java-printf-method
    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;
        System.out.println(sayi+"- "+str+"- "+db);//753- Bootcamp Clarusway- 3.89563056
        System.out.printf("sayi:%d, str:%s, db:%f\n", sayi, str, db);//sayi:753, str:Bootcamp Clarusway, db:3,895631

        System.out.printf("sayi%d,str:%S, db:%f\n", sayi, str, db);//sayi753,str:BOOTCAMP CLARUSWAY, db:3,895631

        System.out.printf("sayi%10d,str:%-15.10S, db:%-5.3f\n", sayi, str, db);//sayi       753,str:BOOTCAMP C     , db:3,896
        //%-5.3 - sola yasla demek. %5.3 yanındaki sayı (5) o kadar karakterlik yer ayır.
        // %5.3 virgülden sonra ki sayı(3) virgülden sonraki  ilk 3 sayıyı al.
        //%-15.10 - sola yasla, strinlerdeki 15.10--> 15 karakterlik yer (kapasite)ayır. 10 ise ilk on karakteri yazdır
        // strinlerdeki %s %S,  küçük s olduğu gibi yazdırır. büyük S hepsini büyük yazdırır.
        //% x.y --> x: kapasite     y: karakter sayısı
        // \n alt satıra gec
        System.out.printf("sayi: %-10s, str:%-8.8s,db:%09.4f",sayi, str, db);//sayi: 753       , str:Bootcamp,db:0003,8956
        // %09.4f ayırdığı 9 karakterden boş kalan yeri 0 yazarak doldurur.
    }

}
