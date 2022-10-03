package day02;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {
int a=1;
        System.out.println(++a);//2 value 2
        System.out.println(a++);//2 value 3
        System.out.println(a);//3
        int b=5;
        System.out.println(--b);//4 value 4
        System.out.println(b--);//4 value 3
        System.out.println(b);//3
        int x=20;
        int y=15;
        System.out.println(++x+ y--); //36  21   15
        System.out.println("x="+x);//21
        System.out.println("y ="+y);//14
        System.out.println(++x +--y);// x 22  y13  toplam 35
        int k=5;
        System.out.println(++k + k++ + k++ + --k + k-- + k);//6+6+7+7+7+6   39
        System.out.println("k=" + k);//6

    }
}
