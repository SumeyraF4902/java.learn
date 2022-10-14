package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //Stringi Array 'a çevirme..split()--> girlen parametre değere göre String ifade parrçalanır.

        String str="JavaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :)";
        // task string  ifadeyi kelime sayısını print eden code create ediniz.
      String strArr[] =str.split(" ");// str her " " karaktere göre parçalanır. her bir parça str Array in bir elemanı olarak atandı.

        System.out.println(Arrays.toString(strArr));//

        System.out.println(strArr.length);//11
        // task--> string ifadeki harf sayısını print eden code create ediniz
        String harfArr[]=str.split("");//string harf harf  hiçliğe göre parçalandı
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);//77


    }
}
