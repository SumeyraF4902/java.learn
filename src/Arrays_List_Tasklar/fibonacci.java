package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayı=sc.nextInt();
        int str=0;
        int sayı1=1;
        int sayı2=1;

        ArrayList<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(sayı2);
        fibonacci.add(sayı1);


        while (sayı2<sayı){


            str=sayı2+sayı1;
            sayı2=sayı1;
            sayı1=str;
            fibonacci.add(str);

        }
        System.out.println(fibonacci);
    }
}
