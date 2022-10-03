package j10_StringManipulasions;

public class C11_ValueOff_parse {
    public static void main(String[] args) {
// Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar. value =değer

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
        //TASK--> string type olarak verilen iki adet bağış miktarını code create ediniz.
String bagıs1="1500";
String bagıs2="2500";
int bagısDegeri1=Integer.valueOf(bagıs1);//bağış1 string içindeki sayı değerini int e çevirdi bagısdegeri1 atadı.
int bagısDegeri2=Integer.valueOf(bagıs2);

System.out.println("toplam bagıs değeri = " +(bagısDegeri1+bagısDegeri2));
int fetih=Integer.valueOf(1453);
        System.out.println(fetih);
        System.out.println(Integer.parseInt(bagıs1) + Integer.parseInt(bagıs2));
        int tc=1453629;
       String strtc=String.valueOf(tc);
        System.out.println(strtc);
        System.out.println(strtc+tc);
        String fiyat="$150";
       int yenifiyat= Integer.valueOf(fiyat);
        System.out.println("yenifiyat = " + yenifiyat);


    }
}
