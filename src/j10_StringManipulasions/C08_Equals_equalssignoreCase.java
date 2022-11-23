package j10_StringManipulasions;

public class C08_Equals_equalssignoreCase {
    public static void main(String[] args) {

/* eguals()
* 2 String metnin birbirine eşit olup olmadığına bakar. büyük küçük harf farkı vardır. sonuc boolean olur.
* egualsIgnoreCase()
* equals () ile aynı işlevi görür, tek farkı büyük küçük harfe duyarlılığı yoktur. sonuç boolean verir.
 */
        /**
         * str.toLowerCase() verilen String in tamamını küçük harfe çevirir.
         * str.egualsIgnoreCase() verilen String in tamamını büyük harfe çevirir
          */

        String str1="Merhaba";
        String str2="merhaba";
        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equalsIgnoreCase(str1));//true


        String s1="songul hanım";
        String s2="songul hanım";
        String s3=new String("songul hanım");// objedir nan primitivedir   heap memory de saklanır
        String s4=new String("songul hanım");// objedir nan primitivedir. heap memory de saklanır
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true






    }
}
