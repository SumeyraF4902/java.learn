package j09_SwitchStatemen;

import java.util.Scanner;

public class C04_SwitchClass {
    public static void main(String[] args) {
        //TASK--->GİRİLEN AYIN HANGİ MEVSİMDE OLDUĞUNU CODE CREATE EDİNİZ.
        //String ay=sc.nextLine();
        //switch(ay){
        Scanner scan=new Scanner(System.in);
        System.out.println("bir ay giriniz");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 12:
            case 1:
            case 2:

                System.out.println(" kış ayıdır");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar ayıdır");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz ayıdır");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar ayıdır");
                break;
            default:
                System.out.println("yanlış tercih");







        }














    }
}
