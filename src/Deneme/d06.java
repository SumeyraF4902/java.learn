package Deneme;

import java.util.Scanner;

public class d06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Çemberin yarıçapını giriniz:");
       double ycap=sc.nextDouble();
       double çevre=ycap*2*3.14;
       double alan=3.14*ycap*ycap;
       System.out.println("alan  :"  + alan + "çevre  :"+ çevre);
        System.out.println("adınızı ve soy adınızı giriniz:");
        String adSoyad= sc.nextLine();
        System.out.println("adınızı yazınız:   ");
        char ilkHrf=sc.next().charAt(0);
        System.out.println("adınızın yazınızilk harfi:"+  ilkHrf);






    }
}
