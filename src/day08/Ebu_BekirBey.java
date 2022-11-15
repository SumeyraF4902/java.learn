package day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ebu_BekirBey {

    public static void main(String[] args) {
        //TASK01 OBEB OKEK - HESAP MAKİNESİ (2 SORU VAR BU 1.SORU)
        //TASK01 HESAP MAKİNESİ
        //Constucter kullanacak şekilde Ruuner ve hesap classları olan bir hesap makinesi

       /* HesapMakinesi obj= new HesapMakinesi();
        obj.giris();*/

            // TASK02  Girilen iki sayının EBOB ve EKOK larını print eden code create ediniz
        // ekok(a,b)=(a*b)/ebob(a*b)
        Scanner sc= new Scanner (System.in);
        System.out.println("1. sayıyı giriniz");
        int num1=sc.nextInt();
        System.out.println("2. sayıyı giriniz");
        int num2=sc.nextInt();
        System.out.println("obeb(num1,num2) = " + obeb(num1, num2));
        System.out.println("ekokBul(num1,num2,obeb(num1,num2)) = " + ekokBul(num1,num2,obeb(num1,num2)));;
    }
    public static  int obeb(int a, int b) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=Math.max(a,b); i++) {
            for(int j=1; j<=Math.min(a,b); j++){
                if(a%i == 0 && b%j==0){
                   if( i==j){
                       list.add(i);

                   }


                }

            }

        }

       return list.get(list.size() - 1);

    }
    public static int  ekokBul(int a, int b,int obeb) {// abs mutlak değer içinde işlem yapma
        return Math.abs(a*b)/obeb;
    }
}

