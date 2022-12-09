package C11_MethodCreation;

import java.util.Scanner;

public class Task04AtmMethod {//Amele köyü
    /*
    bakiye baslangıc degeri 1000 tl ögrenme para yatırma ve cekme cıkıs islemlerinin yapıldiği bir atm projesi yapınız
     */
    static Scanner sc= new Scanner(System.in);
    static int bakiye=1000;

    public static void main(String[] args) {
        secim();
    }

    public static void secim() {
        System.out.println("agam ne yapacaksan seç");
        System.out.println("bakiye ögrenme icin-->1\npara yatırmak icin-->2\npara cekmek icin -->3\ncıkıs icin-->4\nkarar-->5");
        int seçim = sc.nextInt();
        switch (seçim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatır();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cıkısYap();
                break;
            default:
                System.out.println("agam seçim yapamirsen bide para istirsen...");
                secim();
        }


        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */



    }//main dışı



    private static void cıkısYap () {
        System.out.println("agam çıkışınız yapılmıştır gene bekleriz");
    }


    private static void paraCek () {
        System.out.println("agam ne kadar cekecen:");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar < bakiye) {
            bakiye -= cekilecekMiktar;
            System.out.println("paranız cebinizde");
            System.out.println("agam bakiyen:" + bakiye);
        } else System.out.println("agam nidddin olmayan parayımı istiyorsun");
        secim();
    }
    private static void paraYatır () {
        System.out.println("ne kadar para yatıracaksınız:");
        int yatırılacakMiktar = sc.nextInt();
        bakiye += yatırılacakMiktar;
        System.out.println("yeni bakiyeniz:" + bakiye);
        secim();

    }

    private static void bakiyeVer () {
        System.out.println("agam bakiye:" + bakiye);
        karar();
    }
    public static void karar () {
        System.out.println("agam işleme \n devam etmek istiyorsanız-->1\nyeter-->0");
        int karar = sc.nextInt();
        if (karar == 1) {
            secim();
        } else if ((karar == 0)) {
            cıkısYap();

        } else System.out.println("agam adam gibi bir karar ver");


    }

    }
