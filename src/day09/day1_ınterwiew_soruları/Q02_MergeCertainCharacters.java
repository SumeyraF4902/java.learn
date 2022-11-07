package day09.day1_ınterwiew_soruları;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir String giriniz");
        String str= sc.nextLine();
        System.out.print("ilk ve son harfini kaç kere yazdırsın");
        int num=sc.nextInt();
        ilkSonHarf(str,num);
        System.out.println(ilkSonHarf(str,num));

    }
    public static String ilkSonHarf(String str,int num){
        String ilkSonHarfler=str.substring(0,1)+str.substring(str.length()-1);
        System.out.println("ilkSonHarfler = " + ilkSonHarfler);
        String output="";
        for (int i=0; i<num; i++){// birleşimden kaç tane yazdıracaksak onu verir
            output+=ilkSonHarfler;

        }return output;
    }

}
