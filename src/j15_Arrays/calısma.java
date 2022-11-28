package j15_Arrays;

import j26_ınheritance.task01.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class calısma {
    public static void main(String[] args) {
      /*

             * 0/4
           * * 1/3
         * * * 2/2
       * * * * 3/1
     * * * * * 4/0
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 4)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}













