package Team07.calısma;

public class DERS01 {
    public static void main(String[] args) {
        String input = "A1B2C3";
       String [] arr=input.replaceAll("\\D","").split("");
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=Integer.parseInt(arr[i]);
       }

        System.out.println(sum);

    }
}
