package j10_StringManipulasions;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        girilen String içindeki istenen index'deki karakteri print code create ediniz.,,,
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String str= sc.nextLine();
        System.out.println(" istediğin karakter için index gir:");
        int index=sc.nextInt();
        if (str.length()>index){
            System.out.println(str.substring(index,index+1));// 2 yol str.charAt(index)

        }else System.out.println("girdiğiniz metinde olmayan index");





    }
}
