package day08;

public class erolby_Fahrenayt {
    public static void main(String[] args) {
        /*
Task-->For döngüsü kullanarak 50 ile 60 dereceleri arasını fahrenheit cinsinden ekrana yazdırınız.
formül= f = c * 1.8 + 32
 */

for (double i=50; i<=60; i++){
    double f=i*1.8+32;
    System.out.println(i+"derece  ="+f +"fahrenheit");
}
    }
}
