package day11;

public class Q06_Varargs02 {
    public static void main(String[] args) {

        // Create a multiply method with double varargs (return double)

        System.out.println("carp(3.5,4.9,5.9,2.3) = " + carp(3.5, 4.9,5.9,2.3));


    }

    private static double carp(double... sayi) {
        double carpim =1;
        for (double each :sayi)
        {

            carpim *=each;
        }

        return carpim;
        }

        }
