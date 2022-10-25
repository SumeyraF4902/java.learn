import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        String arr="$12 $23 $10 $2 $5 $2";

        String arr1[]=arr.replace("$","").split(" ");
        int toplam=0;
        for( String value:arr1){
            toplam+=Integer.parseInt(value);
        }
        System.out.println(toplam+" $");

String str1="$12 $23 $10 $2 $5 $2";
str1=str1.replaceAll("\\$","");

String str2[]=str1.split(" ");
System.out.println("Array: "+ Arrays.toString(str2));
int sum=0;
        for (int i = 0; i < str2.length; i++) {
            sum+=Integer.parseInt(str2[i]);
        }
        System.out.println("Array elemanlarinin toplami: "+sum+"$");

    }
}