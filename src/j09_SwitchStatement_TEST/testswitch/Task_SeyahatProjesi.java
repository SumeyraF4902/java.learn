package j09_SwitchStatement_TEST.testswitch;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        /*Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi*/
        Scanner scan=new Scanner(System.in);
        System.out.println("******Seyahat şirketimize hoş geldiniz.******");
        System.out.println("Nereye yolculuk etmek istiyorsunuz? Frankurt :60 KM --------Köhn :80 KM--(20 KM başına 5 Euro bilet parası alınmaktadır.");
        System.out.println("Nereye yolculuk etmek istiyorsunuz Frankurt' mu, Köhn' mü?");
        String rota= scan.next().toUpperCase();
        System.out.println("bakiyeniz ne kadar?");
        double bakiye=scan.nextDouble();
        switch (rota){
            case "FRANKURT":
                System.out.println("Kaç kişi yolculuk yapacaksınız, maksimum 2 kişilik yerimiz var.");
                int kisi=scan.nextInt();
                switch (kisi){
                    case 1:
                        System.out.println("1 kişi Frankfurt toplam tutar:"+ (60/20*5)+"  "  +"Euro "+" Kalan Bakiyeniz  = "+" "+(bakiye-(60/20*5))+" "+"Euro");
                        break;
                    case 2:
                        System.out.println(" iki kişi Frankfurt toplam tutar:   "   +   ((60/20*5)*2)+"  " +"Euro"+"KALAN BAKİYENİZ :"+" " +(bakiye-((60/20*5)*2))+" " +"Euro "); break;
                }

            case "KÖHN":
                System.out.println("Kaç kişi yolculuk yapacaksınız, maksimum 2 kişilik yerimiz var.");
                kisi = scan.nextInt();

                switch (kisi){
                    case 1:
                        System.out.println("1 kişilik bilet TUTARI : "+(80/20*5)+""+"Euro"+ " "+"KALAN BAKİYENİZ" +(bakiye-(80/20*5))+" "+ "Euro");
                        break;
                    case 2:
                        System.out.println("2 kişilik bilet TUTARI: "+((80/20*5)*2)+""+"Euro"+ " "+"KALAN BAKİYENİZ" +(bakiye-((80/20*5)*2))+" "+ "Euro");
                        break;
                }

            default:
                System.out.println("hatalı giriş yaptınız.");


        }

    }
}
