public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız. BİTTTİİİİİİ
         */
        int arr[]={12,2,5,15,8};        int max_value=arr[0];


        for (int i=0; i<arr.length; i++){
            if(arr[i]>max_value){
                max_value=arr[i];


            }

            }
        System.out.println("max_value"+ max_value);

        }

    }


