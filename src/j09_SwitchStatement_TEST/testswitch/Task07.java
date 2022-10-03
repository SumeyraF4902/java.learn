package j09_SwitchStatement_TEST.testswitch;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print(" 3 basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
        int onlarbasamağı=(sayi/100)%10,yüzlerbasamağı=sayi/100,birlerbasamağı=sayi%10;
        if(sayi>99 && sayi<1000){
            switch (yüzlerbasamağı){
                case 0:
                    System.out.println("sıfır");
                    break;
                case 1:
                    System.out.println("yüz");
                    break;
                case 2:
                    System.out.println("ikiyüz");
                    break;
                case 3:
                    System.out.println("üçyüz");
                case 4:
                    System.out.println("dörtyüz");
                    break;
                case 5:
                    System.out.println("beşyüz");
                    break;
                case 6:
                    System.out.println("altıyüz");
                    break;
                case 7:
                    System.out.println("yediyüz");
                    break;
                case 8:
                    System.out.println("sekizyüz");
                    break;
                case 9:
                    System.out.println("dokuzyüz");
                    break;
            }switch (onlarbasamağı){
                case 0:
                    System.out.println("sıfır");
                    break;
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kırk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmış");
                    break;
                case 7:
                    System.out.println("yetmiş");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;

                case 9:
                    System.out.println("doksan");
                    break;
            }switch (birlerbasamağı){
                case 0:
                    System.out.println("sıfır");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");break;
            }
        }else System.out.println("girdiğiniz sayı üç basamaklı değil,tekrar deneyiniz");



    }
}
