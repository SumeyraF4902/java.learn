package j10_StringManipulasions;

public class task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char h=harfDepo.charAt(harfDepo.indexOf('H'));
        char a=harfDepo.charAt(harfDepo.indexOf('A'));
           char l= harfDepo.charAt(harfDepo.indexOf('L'));
        System.out.println(""+h+a+l);// HAL ascı değerini toplamasın diye başa hiçlik koyyduk. string algıladı.
        System.out.println(h+a+l);//213 ascı değerini topladı.


double sayı1=15.613;
int sayı2=(int)sayı1;
        System.out.println(sayı2);
        String s1="AHMET";
        String s2="SEREF";

        System.out.println(s1+""+s2);
        System.out.println(s1+"seref");
        System.out.println("ahmet"+"seref");
        System.out.println(s1+" "+s2);
        System.out.println(s1+"seref ");
        if(0>5||7>6){
            System.out.println("apple");
        }else System.out.println("banana");
        int c=150,v=20,n=10;
        boolean valid=(c+v+n)==180;
        if(valid){
            System.out.println("aaaa");
        }else System.out.println("bbbbb");
        if (true){
            System.out.println("aaa");
            System.out.println("aa000a");
            System.out.println("aaa0000");


        }else if (false)
            System.out.println("şlkdlgdfjhlf");

int i=10;
int j=20;
int k=j+=i/5;
i--;
j++;
int num9=10;
num9=+2;
        System.out.println(num9);







    }
}
