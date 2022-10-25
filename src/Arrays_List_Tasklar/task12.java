package Arrays_List_Tasklar;

public class task12 {
    public static void main(String[] args) {
        /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */
        int arr[]={1,2,3,4};
        System.out.println(dupicate(arr));

    }

    private static boolean dupicate(int []arr) {
        boolean flag=false;
        for (int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<=arr.length-1; j++) {
                if (arr[i]==arr[j]){
                    flag=true;
                }
            }
        }return flag;
    }
}
