package j09_SwitchStatemen;

import java.util.Scanner;

public class C05_SwitchClass_ATM_Project {
    public static void main(String[] args) {
/*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
 ATM app. code create ediniz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bakiye öğrenme için -->1\n Para yatırma için -->2\nPara çekme için-->3\nÇıkış-->4");
        int seçim = scan.nextInt();
        int bakiye = 1000;
        switch (seçim) {
            case 1:
                System.out.println("Bakiyen :" + bakiye);
                break;
            case 2:
                System.out.println("ne kadar yatıracaksınız?");
                int yatırılanMiktar = scan.nextInt();
                bakiye += yatırılanMiktar;
                System.out.println("bakiyeniz:" + bakiye);
                break;
            case 3:
                System.out.println("ne kadar çekeceksiniz?");
                int cekilenMiktar= scan.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("yetersiz bakiye");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("güncel bakiyen"+ bakiye);

                }
                break;
            case 4:
                System.out.println("hayırlı günler dileriz");
                break;
            default:
                System.out.println("hatalı şeçim yaptınız");

        }
    }
}