package day09;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        // sabit değişkenler
        // giriş hakkı üç olacak
        //bir pin kodu belirle ve kullanıcının girdiğiyle karşılaştır.
        // 4 defada yanlış girdiğinde hakkı bitecek.
        Scanner sc= new Scanner(System.in);
        System.out.println( "string giriniz");

      //  System.out.println("asal mıkaçkere yazdırmak istersin");
      //  int kez=sc.nextInt();
        String pin="as1254";
        for(int i=0;i<3; i++){
            System.out.println("pin giriniz");
            String kelime=sc.nextLine();
            if(kelime.equals("pin")){
                System.out.println("doru giriş yaptınız");
            }else System.out.println("tekrar deneyiniz");
        }


    }


}
