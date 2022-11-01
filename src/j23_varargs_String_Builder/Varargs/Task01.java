package j23_varargs_String_Builder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
 */
        String arr1[]={ "m", "e", "r", "v","e"};
        String arr2[]={ "a", "l", "i"};
        concat(arr1);
        concat("javaCan","  enise", "  hanım");//javacan enise hanım


    }
    public static void concat(String... str) {
        String birlesenstr="";
        for(String w:str){
            birlesenstr=birlesenstr.concat(w);
        }
        System.out.println("birlesenstr = " + birlesenstr);
    }
}
