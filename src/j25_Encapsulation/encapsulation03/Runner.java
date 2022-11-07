package j25_Encapsulation.encapsulation03;

public class Runner {//3. step
    public static void main(String[] args) {
        // 4. Step
        Arac honda=new Arac("accord","siyah",-200,2012);// parametreli
        Arac volvo=new Arac("s80","beyaz",2000,-2015);// parametreli


        Arac  hacıMurat=new Arac();// parametresiz
        hacıMurat.setModel("serce");
        hacıMurat.setMotor(1300);
        hacıMurat.setMotor(1974);
        hacıMurat.setRenk("cücük SARI");
        System.out.println("honda ne ararsan var onda  "+ honda);
        System.out.println("hacı  Murat"+hacıMurat);
        System.out.println("isveç tankı "+volvo);




    }




}
