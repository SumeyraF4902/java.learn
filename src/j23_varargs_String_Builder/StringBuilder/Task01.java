package j23_varargs_String_Builder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
        Bir cümleyi parametre olarak kabul eden , StringBuilder kullanarak cümleyi ters çeviren ve cümlenin polindrom
         olup olmadığını kontrol eden (büyük / küçük harf duyarlılığı olmadan) bir method create ediniz
                  (without case sensitivity)
         Eg:input : I love Java
         Output:" Reversed sentence : avaJ evol I
         İt is not polindrome
         */
        System.out.println("tersString(\"ece\") = " + tersString("ece"));// ece
        System.out.println("tersString(\"serhat bey\") = " + tersString("serhat bey"));// yeb tahres
        terStr(new StringBuilder("serhat bey"));//yeb tahres
        StringBuilder s=new StringBuilder("ali");
        terStr(s);//ila
        System.out.println("isPolindrom(\"ey edip adanada pide ye\") = " + isPolindrom("ey edip adanada pide ye"));// true
        System.out.println("isPolindrom(\"hikmet bey\") = " + isPolindrom("hikmet bey"));// false
    }
    public static String tersString(String str) {
        String strTersi="";
        for (int i=str.length()-1;i>=0;i--){
            strTersi+=str.charAt(i);

        }return strTersi;
    }
    public static void terStr(StringBuilder str){// cıncık code
        System.out.println("str.reverse() = " + str.reverse());// str ters çevrildi
    }
    public static boolean isPolindrom(String sb){
        if (sb==null) {// boş sb polindrom değildir onun için false verir
            return false;
    }
    return new  StringBuilder(sb).reverse().toString().equals(sb);
    }
}
