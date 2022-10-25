package j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyatI;// güneş
    static double indirimOranı;//güneş

    public static void main(String[] args) {
        /*
        eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
        1.değişiklik yapılan variable lar static olarak tanımlanır.
         */
        etiketFiyatI=100;
        indirimOranı=0.11;
        System.out.println("indirim öncesi etiketFiyatI = " + etiketFiyatI);

        indir();//method call
        indirimOranı=0.22;

        indir();
        indirimOranı=0.05;

        indir();
        System.out.println("indirim sonrası etiketFiyatI = " + etiketFiyatI);
    }
    public static void indir(){
        etiketFiyatI*=(1-indirimOranı);// etiket fiyatını indirimli hale getirdi.
        System.out.println("etiketFiyatI = " + etiketFiyatI);

    }
}
