package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException01 {
    public static void main(String[] args) {
try {

    System.out.println("Agam try block başından selamlar:)");
    hata();
    System.out.println("Agam try block sonundan selamlar");
}catch (IllegalArgumentException e) {
    System.out.println("Agam catch block başından selamlar:)");
    System.out.println(e);
    System.out.println(e.getMessage());
    e.printStackTrace();
    System.out.println("agam sorun handle edildi DEWAMKEE  :)");// bo kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
}

    }
    public static void hata(){
        throw new IllegalArgumentException("Agam nittin yine mi hata");
    }
}