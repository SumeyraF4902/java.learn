package J03_ScannerClass_Type;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

 //Scanner isim=new Scanner(System.in);
   //     System.out.print("Adınızı giriniz :");
     //   String isim= scan.nextLine();
       // System.out.println("isim="+isim);
        
       /* Scanner sc=new Scanner(System.in);
        System.out.print("karenin kenarını giriniz :");
        int kenar= sc.nextInt();
        ;
        System.out.println("alan :"+(kenar*kenar)+  " çevre:"+(kenar*4));
        */
        Scanner sc=new Scanner(System.in);
       /* System.out.println("günlül içtiğiniz çay sayısını giriniz:");
        int caySayısı= sc.nextInt();
        System.out.println("şeker sayısını giriniz");
        int seker=sc.nextInt();
        System.out.println("Yıllık şeker tüketiminiz :"+(caySayısı*1.7*seker*365/1000));


        Scanner giriş=new Scanner(System.in);
        System.out.println("isminizi giriniz :");
        char ch=giriş.nextLine().charAt(0)
        System.out.println("isminizin ilk harfi :"+ch);
        */
        Scanner giriş=new Scanner(System.in);
        System.out.println("isminizi giriniz :");
        String isim= giriş.next();
        System.out.println("isim  :"+isim);




    }
}
