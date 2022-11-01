package j23_varargs_String_Builder.StringBuilder;

public class Task05 {
    public static void main(String[] args) {
         /* CA   Qestions
        What is the result of the following code?aşağıdaki kodun sonucu nedir*/
        int total=0;
        StringBuilder letters= new StringBuilder("abcdefg");
        total+= letters.substring(1,2).length();//1 in length=1
        total+= letters.substring(6,6).length();// null in length=0
        total+= letters.substring(6,5).length();// çalışır consolda RTE VERİR 6 dan başlayıp 5 te bitemez
        System.out.println(total); //RTE verir
         /* ŞIKLAR
         A.  1
        B.   2
        C.  3
        D. 7
       E. An exception is  thrown--->doğru
        F. The code does not compile.
         */
    }
}
