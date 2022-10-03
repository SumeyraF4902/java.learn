package j04_AritmeticOperators;

public class C01_AritmeticOperators {
    public static void main(String[] args) {
int a=7;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a++ + ++a);
        int b=13;
        int c=17;
        int d=47;

        System.out.println(c+b*d);
        System.out.println(d-b/(c-d)+b*c);


        int g=2;
        int h=3;
        String s="JavaCAN";
        // g h s variableları kullanarak 61JavaCAN-1 YAZDIR
        System.out.println(""+(g*h)+(h-g)+s+(g-h));








    }
}
