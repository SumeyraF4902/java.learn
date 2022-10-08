package day_6;

import java.util.Scanner;

public class Q05_NestedForLoop {
    public static void main(String[] args) {
        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/

        Scanner sc=new Scanner(System.in);
        System.out.println("rows (satır)sayısını giriniz");
        int a= sc.nextInt();
        System.out.println("column (sütun)sayısını giriniz");
        int b= sc.nextInt();

        for (int i =1;i<=a; i++){
            for (int j = 1; j <=b; j++){//i=1           i=2             i=3
                System.out.print("*"+" ");//* * * * *   * * * * *   * * * * *
            }
            System.out.println();//ikinci döngüyü alta yazması için açılır
        }
    }
}
