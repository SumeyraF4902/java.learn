package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
         /*
        eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
        2.değişiklik yapılan variable lar  atama tanımlanır.
         */
        double etiketFiyatI=100;// primitive
         double indirimOranı=0.1;//primitive
        System.out.println("indirim öncesi etiketFiyatI = " + etiketFiyatI);//100
        etiketFiyatI=indirim(etiketFiyatI,indirimOranı);// atama yaptığımız için etiketFiyatI nı değiştirdi.//90
        System.out.println("indirim sonrası etiketFiyatI = " + etiketFiyatI);//90
    }
    public static double indirim(double fiyat, double oran){
        fiyat*=(1-oran);
        System.out.println("indirimli fiyat:"+fiyat);
        return fiyat;
    }
}
