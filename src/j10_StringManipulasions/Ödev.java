package j10_StringManipulasions;

import java.util.Scanner;

public class Ödev {
    public static void main(String[] args) {
        //task 1 *  girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz <<ternary kullanın.
        //task  2* girilen e-mail hasebının @gmail.com içermiyorsa"lütfen gmail hasabı giriniz".
        //@gmail.com ile bitiyorsa "hesabınız onaylandı" aksi duruumda "geçerli hesap giriniz" print eden bir code create ediniz.
      //!.........contains(variable) içermirorsa demek. ! kaldırırsan içeriyor demek.
     // TASK 2*
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("E-mail hesabınızı giriniz:");
        String email=scan.nextLine();
        if (!email.contains("@gmail.com")){
            System.out.println("lütfen doğru bir hesap giriniz");
        } else if (email.endsWith("@gmail.com") )
            System.out.println("gmail hesabınız onaylandı.");*/
//TASK1--
        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen bir cümle giriniz:");
        String cümle= sc.nextLine();
        System.out.println("bu cümlede aramak istediğiniz kelimeyi giriniz ");
        String  kelime= sc.nextLine();
        System.out.println(cümle.contains(kelime)?"evet  yazdığınız kelime cümle içinde vardır.":"aradığınız kelime cümle içinde yoktur");




        }


    }

