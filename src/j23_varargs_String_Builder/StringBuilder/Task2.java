package j23_varargs_String_Builder.StringBuilder;

public class Task2 {
    public static void main(String[] args) {
        /* CA Qestions
        What is the result of thr following code?
        7:  StringBuilder sb= new StringBuilder();
        8: sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        9: System.out.println(sb);


        A. abbaaccc
        B. abbaccca   <------ doğru cevap
        C. bbaaaccc
        D. bbaaccca
        E. An exception is thrown
        F. The code does not compile.
         */
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");// sb ye aaa ata sonra 1 index e bb koy sonra 4 index e ccc koy
        System.out.println(sb);
        //   aaa  abbaa     abbaccca
        //   012  01234     01234567

    }
}
