public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH   BİTTTİİİİİİ
         */
String arr="Hello World";
String tersArr[]=arr.split("");
        for (int i = tersArr.length-1; i >=0 ; i--) {
            System.out.print(tersArr[i]);



}

    }
}