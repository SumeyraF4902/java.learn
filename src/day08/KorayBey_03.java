package day08;

public class KorayBey_03 {// interwive soruları
    /*  SORU 1: verilen iki stringin en büyük ortak substringini bulup return eden method create ediniz*/
    public static void main(String[] args) {
        String str1="bandana";
        String str2="andac";
        //output= "anda"
        System.out.println("ortak(str1, str2) = " + ortak(str1, str2));// SORU 1: anda
        System.out.println("uniq(\"AAABBBCCCDEF\") = " + uniq("AAABBBCCCDEF"));//SORU 2:// D
        System.out.println("uniq(\"AAABBBCCCDEF\") = " + uniq("AAABBBCCC"));//SORU 2:Stringinizde uniq karakter bulunmamaktadır

    }
    public  static String ortak (String str1, String str2){
        String ortak="";
        for(int i=0; i<str1.length(); i++){
            for (int j=str1.length(); j>i; j--){
                if (str2.contains(str1.substring(i, j))){
                    ortak=str1.substring(i,j).length()>ortak.length() ? str1.substring(i,j):ortak;
                }

            }
        }

    return ortak;
        /* SORU :2 Bir stringde ilk unig (tek) karakteri bulup return eden method create ediniz
        ex:
        String str="AAABBBCCCDEF";
        String uniqf="D";
         */


    }
            public static String uniq(String str){
        String uniqbos="";
        for (int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                uniqbos=String.valueOf(str.charAt(i));break;// i char olduğu için valueofla string eçevirdik.
               // uniqbos=""+ str.charAt(i); buda char stringe çevirir

            }

    }return uniqbos.length()==0?"Stringinizde uniq karakter bulunmamaktadır":uniqbos;
}

}

