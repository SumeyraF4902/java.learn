package day_6;

public class Q03_ForLoop {
    public static void main(String[] args) {
        //Convert "Java" to "J*a*v*a*"

/* ForLoop
   print even numbers from 100 to 0 but do not use decrement(i--).

        INPUT      :
        OUTPUT  : 100 98 96 94 92 ....2 0
     */

for  (int i=100;i>=0;i-=2){
    System.out.print(i+" ");
}
        System.out.println("** 2. soru***");
String str="Java";
for (int i=0; i <str.length(); i++){
    System.out.print(str.charAt(i)+"*");
}
    }
}
