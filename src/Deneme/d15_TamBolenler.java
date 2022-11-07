package Deneme;

public class d15_TamBolenler {
    public static void main(String[] args) {
       /* TASK  girilen sayının tam sayı bölenlerini toplayan method yazınız.

        */
            int a=54;
            int toplam=0;
            for(int i=1; i<=a; i++) {
                if(a%i==0){
                toplam+=i;
                System.out.print(i+" ");}
            }
        System.out.println(toplam);
    }
}
