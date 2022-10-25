import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız. BİTTİİİİİİ
         */
            String str="Removes white space from both ends of a string";
        System.out.println(str.length());
        String str1="Removes white space from both ends of a string";
        String str2[]=str1.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println(str2 .length);
    }
}