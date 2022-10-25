public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.BİTTTİİİİİİ
         */
     int arr[]={12, 14 , 21 ,23 , 10 ,4};
     int toplam=0;

     for (int i=0; i<arr.length; i++){
         toplam+=arr[i];

     }
        System.out.println("ortalama:  "+toplam/arr.length);

    }
}