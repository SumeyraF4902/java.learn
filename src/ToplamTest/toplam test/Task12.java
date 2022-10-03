import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("3 kelimelik isimnizi giriniz : ");
        String name= sc.nextLine();
        String n1= name.toUpperCase().charAt(0)+".";
        String n2= name.toUpperCase().charAt(name.indexOf(" ")+1)+".";
        String n3= name.toUpperCase().charAt(name.lastIndexOf(" ")+1)+".";

        System.out.println(n1+n2+n3);//U.B.Y.


    }
}
