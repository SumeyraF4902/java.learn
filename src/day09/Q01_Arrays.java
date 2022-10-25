package day09;

public class Q01_Arrays {
    public static void main(String[] args) {
        // Type a method to check if an int Array is symmetrical or not
        int []arr= {1,2,3,2,1};
        System.out.println("symetrical(arr) = " + symetrical(arr));

    }
    private static boolean symetrical(int[] arr) {
        boolean flag=false;
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i]==arr[arr.length-1-i]){//dinamik yaptık 0-5,1-4,2-3, karşılaştırdık bir baştan bir sondan olsun diye bu denklemi kurduk
                flag=true;
            }else
                flag=false;
            break;
        }
        return flag;
    }
}
