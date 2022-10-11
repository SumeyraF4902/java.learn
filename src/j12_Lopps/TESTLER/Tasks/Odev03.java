package j12_Lopps.TESTLER.Tasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= sc.nextInt();
        System.out.println(asalMi(sayi));

    }

    private static boolean asalMi(int a) {

        for (int i = 2; i < a; i++) {
            if (a%i==0){
            return false;}

        }


        return true;
    }
}


=======
   static Scanner sc = new Scanner(System.in);
   static int sayı = sc.nextInt();
    public static void main(String[] args) {

        System.out.println("bir sayı giriniz");

        asalMI();

    }

    private static void asalMI() {
        int sonuc = 0;
        for (int i = 2; i <sayı; i++) {
            if (sayı % i == 0) {
                sonuc++;
            } if (sonuc == 0) {



            }


        }
    }
}
>>>>>>> origin/master
