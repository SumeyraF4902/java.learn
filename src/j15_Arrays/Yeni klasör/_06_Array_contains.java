public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.   BİTTTİİİİİİ
         */
        String arr[]={"Apple" , "Orange", "Banana" , "Pineapple"};
        boolean flag=false;
        for (int i=0; i<arr.length;i++){

            if( arr[i].contains(arr[i])) {
            flag=true;
            break;
        }
        } if(flag){
            System.out.println("kelime arr içinde mevcuttur");

        }else {
            System.out.println("aradığınız KELİME array de yok");
        }


    }
}
