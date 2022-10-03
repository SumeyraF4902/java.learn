package day3;

import java.util.Scanner;

public class A04_Switch {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("bugün günlerden nedir?:");
        String gün=sc.next();
        switch(gün){
            case ("pazartesi"):
                System.out.println("java dersi günleri");
                break;
            case ("salı"):
                System.out.println("java dersi günleri");
                break;
            case ("çarşamba"):
                System.out.println("SQL dersi gunleri");
                break;
            case ("cumartesi"):
                System.out.println("SQL dersi gunleri");
                break;
            case ("perşembe"):
                System.out.println("selenyum dersi günleri");
                break;
            case ("cuma"):
                System.out.println("selenyum dersi günleri");
                break;
            default:
                System.out.println("tatil gününüz");
                break;

        }

    }
}
