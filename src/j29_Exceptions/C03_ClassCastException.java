package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        // ClassCastException--> Birbirine dönüştürülemeyen data type'lar birbirine dönüştürüldüğünde oluşan RTE

        Object obj ="JavaCan'lara selam olsun";
        String str=(String) obj;//onjeckt data type String data type casting yapılarak atandı.
        System.out.println("str = " + str);//JavaCan'lara selam olsun

        Object sayi1=10;
      //  String str2=(String) sayi1;//onjeckt data type String data type casting yapılarak atandı
    //    System.out.println("str2 = " + str2);//ClassCastException

        try {
            String str2=(String) sayi1;
            System.out.println("Agam integer object hiç Stringe çevrilir mi" );
        }catch (ClassCastException e) {
            System.out.println("Agam integer object hiç Stringe çevrilir mi" );
        }
        try {
            String str3=(String) obj;
            System.out.println("Agam try blok'ta bu yazıyı okuduysan excpt. fırlatmadı komut sorunsuz");
        }catch (ClassCastException e) {
            System.out.println("Agam integer object hiç Stringe çevrilir mi");
        System.out.println("Agam sorun handle edildi DEWAMKEE  :)");//Bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.
    }
}}
