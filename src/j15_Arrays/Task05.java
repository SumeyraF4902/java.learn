package j15_Arrays;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int a= scan.nextInt();
    String strsayı=String.valueOf(a);

    String rakam[]=strsayı.split("");

    for (int i = rakam.length-1; i>=0;i--){

        System.out.println(rakam[i]);
    }

}}
