package day15.Day05;

import java.util.Arrays;

public class Q12_Printing2DArray {
    // Print 2D String array using loops
    public static void main(String[] args) {
        String [][] array = {{"abc", "def","ghi"}, {"jkl","mno","prs"}};
        for (int i = 0; i < array.length; i++) {// dıs array
            for (int j = 0; j < array[i].length; j++) {//inner array
                System.out.print(array[i][j] + " ");// sadece elemanları yazdirir  abc def ghi jkl mno prs
            }
        }
        System.out.println(Arrays.deepToString(array));// [[abc, def, ghi], [jkl, mno, prs]]
    }
}
