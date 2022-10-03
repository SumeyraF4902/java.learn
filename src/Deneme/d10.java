package Deneme;

import java.util.Scanner;

public class d10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz:" );
        int say=sc.nextInt();
        int srkm=say%10;
        int irkm=(say/10)%10;
        int snkm=(say/1000)%10;
        int ensrk=say/10000;
        int toplam=srkm+irkm+snkm+ensrk;
        System.out.println("toplam: "+ toplam);

    }
}
