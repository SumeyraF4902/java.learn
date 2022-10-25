package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task array elemanlarının çarpımını print eden code create ediniz
        int arr[][]={{2,3},{4},{5,6,7}};
        int crpm=1;
        for (int kc[]:arr){
            for(int a:kc){
                crpm*=a;
            }

        }
        System.out.println("crpm = " + crpm);//5040



    }
}
