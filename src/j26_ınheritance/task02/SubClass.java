package j26_ınheritance.task02;

public class SubClass extends SuperClass {//2. step

    public static void main(String[] args) {
        SubClass obj= new SubClass();
        obj.my_method();
    }

    int num=10;
    public void my_method(){
        goster();
        super.goster();
        System.out.println("sub class num:" +num);
        System.out.println("super class num = " + super.num);
    }

    @Override
    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. " );
    }
}
