package j15_Arrays;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
          /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        System.out.println(" for each çözümü");
        int arr[]={1,2,-3,4,-5,-6};
        for (int w:arr){
            w*=-1;
            System.out.println(w+"");
        }
        System.out.println("method for çözümü");
        System.out.println(Arrays.toString(sayınınTersi(arr)));

    }

    private static int [] sayınınTersi(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }


        return arr;


    }

}
