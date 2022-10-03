import java.util.Scanner;

public class Q04_StringManipulation {

    /*  BİTTTTİİİİİ
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=sc.nextLine().toLowerCase();
       String kel=kelime.substring(0,2);
        if (kelime.length()>=3) {
            System.out.println(kel+kel+kel);
        }else System.out.println(kelime);
    }


}
