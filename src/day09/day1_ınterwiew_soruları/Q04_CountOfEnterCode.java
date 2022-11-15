package day09.day1_ınterwiew_soruları;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        public static void main(String[] args) {
            // sabit değişkenler
            // giriş hakkı üç olacak
            //bir pin kodu belirle ve kullanıcının girdiğiyle karşılaştır.
            // 4 defada yanlış girdiğinde hakkı bitecek.
            String pin="smyr4019";
            int girisHakkı=4;
            Scanner sc = new Scanner(System.in);
            System.out.println("**** Hoş geldiniz ****");

            while (true) {
                System.out.println("pin kodunuzu giriniz");
                String girilenPin=sc.nextLine();
                if (pin.equals(girilenPin)){
                    System.out.println("Başarılı giriş yaptınız."); break;
                }else {
                    System.out.println("yanlış giriş yaptınız");
                    girisHakkı--;
                    System.out.println("kalan giriş hakkınız: "+girisHakkı);
                }if(girisHakkı==0){
                    System.out.println("giriş hakkınız kalmadı sim kartınız bloke oldu");break;
                }
            }





}}
