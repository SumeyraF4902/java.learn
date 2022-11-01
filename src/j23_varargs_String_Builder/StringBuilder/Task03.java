package j23_varargs_String_Builder.StringBuilder;

public class Task03 {
    public static void main(String[] args) {
        /* CA   Qestions
        What is the result of the following code?aşağıdaki kodun sonucu nedir*/
        String s1="java";
        StringBuilder s2=new StringBuilder ("java");
        //if (s1==s2) bu sırada CTE verir çünkü StringBuilder ile string eşit olamaz
        System.out.println("1");
        if (s1.equals(s2)) {
            System.out.println("2");
        }
        /* şıklar
        A.  1
        B. 2
        C. 12
        D. Not output is printed
        E. An exception is  thrown
        F. The code does not compile. CTE VERİR CEVAP budur
         */

    }
}
