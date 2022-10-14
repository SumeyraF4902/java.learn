package day06;

public class Q02_ForLoop {
    public static void main(String[] args) {
        //Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        System.out.println(" *** FOR İLE ÇÖZÜMÜ****");
        for (int i=0;i<256; i++) {
            char karakter=(char)i;
            System.out.println(i+"-->" + karakter);
        }
        System.out.println("***WHİLE İLE ÇÖZÜMÜ*****");
        int a=0;
        while (a<=255){
            char c=(char)a;
            System.out.println(a+"-->"+c);
            a++;
        }
        System.out.println("***DO while ile çözümü  ***");
        int x=0;
        do {
            char k=(char)x;
            System.out.println(x+"-->"+k);
            x++;
        }while (x<=255);
    }}




