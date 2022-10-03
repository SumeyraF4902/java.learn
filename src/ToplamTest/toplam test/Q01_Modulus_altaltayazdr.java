public class Q01_Modulus_altaltayazdr {
    // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
    // Hint: use / and %
    //    input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5

    public static void main(String[] args) {
       /* int x = 12345;

        int birler = x%10; //5
        int onlar = (x/10) %10; //4;
        int yuzler =(x/100) %10 ; //3
        int binler = (x/1000) %10; //2
        int onBinler = (x/10000); //1

        System.out.println(onBinler + "\n" + binler + "\n" +yuzler + "\n" + onlar + "\n" + birler );*/
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5
        int f=12345;
        int a=f/10000, b=(f/1000)%10, c=(f/100)%10, d=(f/10)%10,e=f%10;
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
}

}

