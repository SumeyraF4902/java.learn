package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //Task-->verilen fiyat için %11, %22 ve %33 indirimli fiyatı print eden methotlar create ediniz

        double fiyat=100;// primitive double type variable

        System.out.println("method call öncesi fiyat değeri=  "+fiyat);//100

        System.out.println("indirimli11(fiyat) = " + indirimli11(fiyat));//89
        System.out.println("indirimli22(fiyat) = " + indirimli22(fiyat));//78
        System.out.println("indirimli33(fiyat) = " + indirimli33(fiyat));//67

        System.out.println("method call sonrası fiyat değeri=  "+fiyat);//100

    }

    private static double indirimli11(double fiyat) {//girilen fiyatın % 11 indirimli hali=fiyatın %89 retun eden methot
        return fiyat*=0.89;

    }

    private static double indirimli22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indirimli33(double fiyat) {
        return fiyat*=0.67;
    }
}
