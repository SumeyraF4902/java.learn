package Projeler;

import java.util.Scanner;

public class TryCatch {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


    } // örnek tryCatch methodları
             public int intTryCatch(int ustlimit,int altlimit){
        //int secim=intTryCatch(urunler.length,1) olarak kullanabilirz
            int userinput;//kullanıcının her türlü sayısal giriş işlemini yapıp atacağımız variable
        while(true){// true olduğu sürece
        try {
        userinput=scan.nextInt();// variable değer atadığımız kısım
            if(userinput>ustlimit || userinput<altlimit){
                throw  new Exception();
            }break;//doğru bilgi girişi yaptığı zaman break komutuyla whileden çıkılacak

        }catch(Exception e){
            System.out.println("Girilen değer geçerli limit snırları içinde olmalıdır\n"+"Tekrar giriş yapınız");
            scan.nextLine();//döngü başına girince scande sorun olmasın diye kullanacağımız Dummy

        }
        }
        scan.nextLine();//döngüden çıkınca bu methodu kullandığımız methotda dummy atamamıza gerek kalmasın diye kullandığımız dummy
            return userinput;
        }

        // Örnek istersen kısaca kullanıcıdan aldığın sayıda kullanıcın gireceği sayı kısmına atama yapabiliriz
        private static int sayıgir(){// sayı gire try catch tanımladık. sayı girildiğinde bazen hataverebiliyor onun önne geçmek için
            // yada ayrı olarak trycatch methodu oluştururp bunları sayı girilecek yere çağırabilirsin örnek en altta var
          //  System.out.println(" secim yapınız seçtiğiniz sayıyı giriniz");
          //  int secim=sayıgir(); olarak kullanırız
            int a;
            while(true){
                try {
                    a=scan.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("yanlış giriş yaptınız. tekrar giriniz ");

                }
            }
            scan.nextLine();
            return a;
        }
    }

