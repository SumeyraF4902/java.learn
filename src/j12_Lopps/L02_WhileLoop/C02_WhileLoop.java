package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //Task--girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= sc.nextInt();
        System.out.println(rakamTopla(sayi));

    }

    private static int rakamTopla(int sayi) {
        int rakamToplamı=0;
        while (sayi>0){//sayı 1 olana dek badi aksiyon çalış
            rakamToplamı+= sayi%10;// sayının birler basamağı rakamToplamına eklenir
            sayi/=10;//sayı bir basamak eksiltildi.



        }
        return rakamToplamı;



    }
}
