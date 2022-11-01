package j23_varargs_String_Builder.StringBuilder;

public class Task04 {
    public static void main(String[] args) {
          /* CA   Qestions
        What are the result of the following code?aşağıdaki kodun sonucu nedir  (Choose all the appyl ) çoklu cevap*/

        String numbers="012345678";
        System.out.println(numbers.substring(1,3));//12
        System.out.println(numbers.substring(7,7));// null hiçlik verir
        System.out.println(numbers.substring(7));//78
        /* ŞIKLAR
         A.  12  doğru
        B.   123
        C.  7
        D. 78  doğru
        E. A blank  line  = null demek doğru
        F. An exception is  thrown
        G. The code does not compile.
         */

    }
}
