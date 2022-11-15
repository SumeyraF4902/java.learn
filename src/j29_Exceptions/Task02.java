package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) throws IOException {
        /*Girilen hava sıcaklığı  10 nun altında  ise IOException hatası tanımlayıp hatayı print eden method
        create edip mainde kontrol ediniz

        Trick -->
        sıcaklıkKontrol(int sıcaklık){
        throw new IOException("Hava gerçekten soğuk dışarı çıkma");}

        main(){
        Scanner
        try {
        sıcaklıkKontrol(int sıcaklık)
        }
        catch (IOException e) {
        (}
         */
        // main menü
        Scanner sc = new Scanner(System.in);
        System.out.println(" Bugün hava kaç derece");
        int derece=sc.nextInt();
        try {
            if(derece<10){
                throw new IOException("Hava gerçekten soğuk dışarı çıkma");
            }else
            System.out.println("hava yazdan kalma tadını çıkar");


        }catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println(" Evde kalmak en iyisi olmalı");
        }
}
    public static void   sıcaklıkKontrol(int sıcaklık) throws IOException {


}




        }

