package j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("emailinizi giriniz");
        String email= scan.nextLine();// enn hkkkh  @mlkvl .kk ---hatalı giriş yaptıysa istemeden boşluk bırakmışsa düzeltiriz
for (int i=0;i<email.length(); i++){
    char c=email.charAt(i);
    if (c==' ')continue;
    System.out.print(c);
}/*
for (int i=0;i<email.length();i++) {
           char  c=email.charAt(i);
            if(c==' '|| c==','|| c=='.'){
                continue;
            }System.out.print(c);
        }*/
    }
}
