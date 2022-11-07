package day11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {
    /*
    bir aydaki gün sayısını hesaplayan bir java programın yazınız.
    input :
    Ay numarası:
    2
    yıl:
    2016
    Output:
    Subat 2016 29 gündür.
     */
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("yılı giriniz");
        int yıl=sc.nextInt();
        System.out.println("ayı giriniz");
        int ay= sc.nextInt();

        LocalDate date=LocalDate.of(yıl,ay,1);
        System.out.println(date.getYear()+" "+ date.getMonth()+" "+date.lengthOfMonth()+" "+"gündür");
    }
}
