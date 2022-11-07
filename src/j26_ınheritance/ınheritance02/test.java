package j26_ınheritance.ınheritance02;

public class test {
    int x, y;
    public test(int x, int y){
                mama(x,y);
    }
    public void  mama(int x, int y){
        this.x = x*x;
        this.y = y*y;
    }

    public static void main(String[] args) {
        int x=9, y=5;
        test obj=new test(x,y);
        System.out.println(x +" "+y);
    }
}
