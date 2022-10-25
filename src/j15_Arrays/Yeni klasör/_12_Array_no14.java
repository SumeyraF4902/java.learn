import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç do.ğru olmalı
         */
        int intArr[] = {1,3,2,5,8,4};
        boolean flag=true;
      //  boolean flag2=false;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]!=1 )
                if(intArr[i]!=4){
               flag=true;
                System.out.println(flag);
               break;
            }else flag=false;
            System.out.println(flag);
            break;
        }

        // System.out.println((flag1==false && flag2==false)? false:true);
     }

        //  flag1=(intArr[i] ==4 ?  true:false);
        //      flag2=(intArr[i] == 1  ? true:false);

        }




