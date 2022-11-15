package j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //Null pointer exception-->Ataması yapılan bir sitringde length() method run edildiğinde oluşan RTE Exception

        String str="";
        System.out.println(str.length());//0

        //String str1=null;
      //  System.out.println("str1.length() = " + str1.length());// NullPointerException kod kırılır

        String str1=null;
        try {
            System.out.println("str1.length() = " + str1.length());//exception try block kırılır catch block run olur
            System.out.println("Agam try blok'ta bu yazıyı okuduysan excpt. fırlatmadı komut sorunsuz");
        }catch (NullPointerException e) {
            System.out.println("Agam hele dutluk boyutumu hesaplanır");

            try {
                System.out.println("str.length() = " + str.length());//excp olmadıgı için try block tamalanır catch block çalışmaz
                System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
            } catch (NullPointerException ea) {
                System.out.println("agam hele dutlukdaki String boyutu mu hesaplanır TEE ALLAM YAAA :( ");
            }
            System.out.println("Agam sorun handle edildi DEWAMKEE  :)");//Bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.



    }
}}
