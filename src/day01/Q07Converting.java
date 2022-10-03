package day01;

import java.util.Scanner;

public class Q07Converting {
    public static void main(String[] args) {
        /*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/
      /*  int gallon=1000;
        double liters=gallon*3.785;
        String result1=gallon +  "gallon degeri " + liters+   "litredir";
        System.out.println("result1 = " + result1);
    double litre=100;
    double galon= litre/3.75;
    String result2= litre + "  litre değeri " +galon + "galona eşittir";
        System.out.println("result2 = " + result2);
        */

      //  double fah = scan.nextDouble();
       // System.out.println( fah + "Fahrenit " + (((fah-32)*5/9)) + "Fahreneitter.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Fahrenit değerini giriniz . ");
        double fah = sc.nextDouble();
        System.out.println("Fahrenit ="+ ((fah-32)*5/9));
    }
    
}
