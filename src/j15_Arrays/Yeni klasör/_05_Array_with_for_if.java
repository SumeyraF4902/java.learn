public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

/*int arr[]={-5,+6,+8,+12,+14,-19};
int toplam=0;
int cıkarma=0;
   for (int i=0; i<arr.length; i++){
       if ( arr[i]%2==0){
           toplam+=arr[i];

       }else toplam-=arr[i];

       }
       System.out.print(toplam);*/

        int sayi[] = {5, 6, 8, 12, 14, 19};
        int toplam1 = 0;

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] % 2 == 0) {
                toplam1 += sayi[i];
            } else toplam1 -= sayi[i];
        }
        System.out.println("\nArray elemanlarinin toplami: " + toplam1);
    }

}



