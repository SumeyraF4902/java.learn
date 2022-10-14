package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        // arr tüm elemanlarının çarpımını print eden code create ediniz
        int sayi[][]={{1,2,3,},{9,8}};
        int carpım=1;// ilk bir verilerek çarpmada etki etmeyecek değer kullanıldı.
        for (int i =0; i< sayi.length; i++){//kat kontrolü
            for (int j=0;j<sayi[i].length; j++){//daire kontrolü
                carpım*=sayi[i][j];
            }

        }
        System.out.println("çarpımları  :"+carpım);//432
    }
}
