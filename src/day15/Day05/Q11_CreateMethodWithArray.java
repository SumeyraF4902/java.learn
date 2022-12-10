package day15.Day05;

import java.util.Arrays;
import java.util.Random;




public class Q11_CreateMethodWithArray {
    //    ||This Part Should be in Main Method||
    //Bu Kısım Ana Yöntemde Olmalıdır
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //5 boyutunda bir dizi oluşturun, 0 ile 10 arasında bazı rastgele değerler atayın
    //        (değer atamak için rastgele sınıf ve for döngüsü kullanın)
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //Döngü için genel statik geçersiz yöntemler oluşturmalısınız (Yöntemler için parametre int Array olmalıdır
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //"2 3 1 10 2" gibi bir dizi yazdıran bir yöntem oluşturun, dizinin öğeleri arasında boşluk
    //     -2-Create a method that prints the sum of an array
    //     Bir dizinin toplamını yazdıran bir yöntem oluşturun
    //    // -3-Bir dizinin maksimum elemanını yazdıran bir yöntem oluşturun
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing
   // Geri dönüş tipi geçersiz olmalıdır çünkü sadece yazdırılan herhangi bir şeyi iade etmiyoruz
    public static void main(String[] args) {
        Random num = new Random();
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = num.nextInt(10);// array elemanlarina 0-10 arasi sayi atamasi yapar

        }
        System.out.println(Arrays.toString(array));
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int w : array) {
            sum += w;
            if (w > max) {
                max = w;
            }

        }
        System.out.println(sum);
        System.out.println(max);

        // yol methodlarla
        Random num1 = new Random();
        int array1[] = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = num1.nextInt(10);
        }

        printarray(array1);
        printSum(array1);
        printMaxValue(array1);

    }

    private static void printarray(int[] array1) {
        for (int i = 0; i < array1.length;i++) {
            System.out.print(array1[i] + " ");
        }
    }

    private static void printMaxValue(int[] array1) {
        int max1=array1[0];
        for (int i = 0; i < array1.length;i++) {
            max1=Math.max(max1,array1[i]);
        }
        System.out.println(max1);
    }

    private static void printSum(int[] array1) {
        int toplam=0;
        for (int i = 0; i < array1.length;i++) {
            toplam+=array1[i];
        }
        System.out.println("toplam = " + toplam);
    }


}
