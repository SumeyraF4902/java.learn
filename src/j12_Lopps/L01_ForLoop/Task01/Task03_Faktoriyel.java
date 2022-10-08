package j12_Lopps.L01_ForLoop.Task01;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {
        //Task--> girilen sayının faktoriyelini hsaplayan method create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= sc.nextInt();
        faktoriyel(sayi);//integer parametreli method call


    }//main dışı

    private static void faktoriyel(int sayi) {
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;

    }

        System.out.println(faktoriyel);// bunun yerine  return faktoriyel yazarız ancak önce methodati void yerine int, yazarız.üstteki main nin içine sout açarız.


    }
}
