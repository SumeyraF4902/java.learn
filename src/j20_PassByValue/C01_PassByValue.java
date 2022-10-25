package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir proğlamlama dilidir.
        Bir primitive variable argument(parametre) olarak bir methoda call edildiğinde variable
        değil bir copy clone (vesikalık)(pointer-giriş noktası gibi) değeri gönderilir.
         */
        //Task--> verilen fiyat için %24 arttırılmış fiyatı print eden methot create ediniz.


        double fiyat=100;//primitive double type variable

        System.out.println("method call öncesi fiyat değeri="+fiyat);//100

        fiyatArttır(fiyat);// fiyat variable method aparametre call edildi.  124

        System.out.println("method call sonrası fiyat değeri="+fiyat);//100
    }
    public static void fiyatArttır(double bişey){
         bişey*=1.24;
        System.out.println("arttırılmış fiyat="+bişey);
    }
}
