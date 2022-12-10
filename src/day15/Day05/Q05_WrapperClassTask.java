package day15.Day05;

public class Q05_WrapperClassTask {
    public static void main(String[] args) {
        // create a method that accepts an int
        // and returns twice of that int
        // overload this method with wrapper class: Integer

        // int kabul eden bir metot yarat
        // ve bu int'nin iki katını döndürür
        // bu yöntemi wrapper sınıfıyla overload et : Integer

        int num=9;
        System.out.println("numIkiKati(num) = " + numIkiKati(num));//18
        Integer num1=10;
        System.out.println("twice(10) = " + twice(num1));//20
    }

    private static Integer twice(Integer i) {
        return i * 2;

    }

    private static int numIkiKati(int num) {
        return num*2;
    }
}
