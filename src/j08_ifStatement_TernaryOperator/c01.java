package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c01 {
    public static void main(String[] args) {

        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("lütfen boyunuzu metre olarak giriniz  : ");
        Double boy= sc.nextDouble();
        System.out.println("Kilonuzu giriniz");
        int kilo= sc.nextInt();
        Double   VKE=kilo/(boy*boy);
if (VKE<=20){
    System.out.println("zayıfsınız");
}else if (20<VKE&&VKE<=25){
    System.out.println("normal sınırlardasınız");}
else if (25<VKE&&VKE<=30){
    System.out.println("şisman kategorisindesiniz");}
else if (30<VKE){
            System.out.println("obez grubundasınız");

}



    }


}
