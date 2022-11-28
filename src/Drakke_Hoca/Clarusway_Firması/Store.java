package Drakke_Hoca.Clarusway_Firması;

import java.util.Scanner;

public class Store {
    /*
    Store Class ı Metotları:
run() → Notebook işlemlerinin yapıldığı, MobilePhone işlemlerinin yapıldığı, Markaların listelendiği ve çıkış yapılabildiği bir metot oluşturunuz.
*/

    Scanner sc= new Scanner(System.in);
    public void run(){
        System.out.println("CW Store Management PaneLine Hoşgeldiniz....");
        System.out.println("1) Notebook işlemleri\n"+
                "2) Marka işlemleri\n"+
                "3) Çıkış işlemleri\n"
        +"4) MobilePhone işlemleri");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
        switch (sc.nextInt()) {
            case 1:
                Notebook noteBook= new Notebook();
                noteBook.menu();
                break;
            case 2:
                Brand.printBrands();
                break;
            case 3:
                System.out.println("Çıkışınız yapılıyor");
                System.exit(0);break;
            case 4:
                MobilePhone mobilPhone= new MobilePhone();
                mobilPhone.menu();
                break;

        }
    }
}
