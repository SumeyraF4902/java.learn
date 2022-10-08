package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        // Task-girilen bir ifadedeki c karakterine kadar a karakter sayısını   print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("bir ifade giriniz" );
        String str= scan.nextLine();
        int aSayısı=0;
        for (int i =0;i<str.length(); i++){
            if(str.charAt(i)=='a'){
                aSayısı++;
            } else if (str.charAt(i)=='c') {
                break;
            }
            System.out.println("döngüde işleme giren karakterler:"+str.charAt(i));
        }
        System.out.println("agam yazdığın birşeylerde aSayısı"+aSayısı);
    }
}