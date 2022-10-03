package Deneme;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class KacGünSonrası {
    public static void main(String[] args) {
        ///kaç gün onrasını öğrenmek istiyorsun
        Scanner scan = new Scanner(System.in);
        System.out.println("bugün haftanın kaçıncı günü?\n pazartesi için-->1\n Salı için --2>,\n çarşamba için --3>,\n perşembe için--4>,\ncuma için -->5,\n cumartesi için -->6,\n pazar için--7 seçiniz?");
        int gun = scan.nextInt();
        if (gun <= 0 && gun > 6) {//javada sayma 0dan başlıyor pazara 0 verdik.
            System.out.println("hatalı gün girdiniz");
        } else {
            System.out.println("kaç gün sonrasını öğrenmek istiyorsunuz?");
            int kacgun = scan.nextInt();
            int istenengun = (kacgun + gun) % 7;
            switch (istenengun) {
                case 1:
                    System.out.println(kacgun + " gün sonra günlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacgun + " gün sonra günlerden SALI");
                    break;
                case 3:
                    System.out.println(kacgun + " gün sonra günlerden ÇARŞAMBA");
                    break;
                case 4:
                    System.out.println(kacgun + " gün sonra günlerden PERŞEMBE");
                    break;
                case 5:
                    System.out.println(kacgun + " gün sonra günlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacgun + " gün sonra günlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacgun + " gün sonra günlerden PAZAR");
                    break;

            }


        }

    }
}
