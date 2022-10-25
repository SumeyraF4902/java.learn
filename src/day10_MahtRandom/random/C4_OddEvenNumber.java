package day10_MahtRandom.random;

public class C4_OddEvenNumber {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz


        int min=55;
        int max=100;
        System.out.println("math clasın formülizasyon yöntemiyle ");// 1 yol
        int randomNum=(int) (Math.random()*((max-min) +1)) + min; //
        System.out.println("randomNum = " + randomNum);
        System.out.println(randomNum%2==0? "cift":"tek");

        System.out.println("math classın random yöntemiyle");// 2 yol
       int random= (int) (Math.random()*100);
        System.out.println(random);// if veya ternarry yöntemiyle çözebilirsin  System.out.println(random%2==0? "cift":"tek");
        if(random%2==0){
            System.out.println( "sayi çift");
        }else System.out.println("sayi tek");
    }
}
