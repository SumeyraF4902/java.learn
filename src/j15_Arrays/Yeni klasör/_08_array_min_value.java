public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.  BİTTTİİİİİİ
         */
int arr[]={14,19,5,21};
        int min_value=arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<min_value){
                min_value=arr[i];
            }
        }
        System.out.println("min değer"+min_value);
    }
}

