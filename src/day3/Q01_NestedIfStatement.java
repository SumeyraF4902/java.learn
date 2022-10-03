package day3;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {

        //kullanıcıdan yaş bilgilerini alın
        //age>=18  ol kullanmaya uygun
        //age>=70 üç kezz oy kullanabilir
        //70>age>=50 iki kez kullanabilir.
        //50>age>=18 bir kez oy kullanabilir
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        int age=scan.nextInt();
        if (age>=18){
            System.out.println("yaşınız oy kullanmaya uygun");
            if(age>=70) {
                System.out.println(" üç kez oy kullanabilirsiniz.");
            }else if (age>=50){System.out.println(" iki kez oy kullanabilirsiniz");
                }else {
                    System.out.println("bir kez oy kullanabilirsiniz");
                }
        }else System.out.println("yaşınız oy kullanmaya yeterli değil.");

    }
}
