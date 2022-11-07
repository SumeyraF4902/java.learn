package day08;

public class deneme {
    public static int stvar=100;
    public static int var=200;
    public String toString() {
        return stvar+":"+var;
    }




    public static void main(String[] args) {
        deneme t1=new deneme();
        t1.var=300;
        System.out.println(t1);
        deneme t2=new deneme();
        t2.stvar=300;
        System.out.println(t2);

    }
}
