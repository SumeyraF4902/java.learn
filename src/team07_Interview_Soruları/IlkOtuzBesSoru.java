package team07_Interview_Soruları;

public class IlkOtuzBesSoru {
    public static void main(String[] args) {
       // sayfa 16 dan itibaren

      /*  //Task  15--> faktorial
        // sayıyı kullanıcıdan almış olsaydık
        Scanner sc=new Scanner(System.in);
        System.out.println("hangi sayının factorielini öğrenmek istiyorsunuz");
       int num=sc.nextInt();
        int fac=1;
       for (int i=1;i<=num;i++){
            fac*=i;
        }
      System.out.println(fac);

        //Task 16--> Verilen sayının  carpım tablosunu bulun
        int num1=3;


        for(int i=1; i<=10; i++){
            System.out.println(num1+"*"+i+"="+ (num1*i));
        }
        //Task17-->Fibonacci series girilen sayının fibonaccisini bulun
        //0 1 1 2 3 5 8 13 21 34....
        int t1=0;
        int t2=1;
        int num2=10;

        for(int i=1; i<=num2; i++){
            System.out.println(t1);
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }

        //TASK 18 Karakterleri yazdır
        for (char c='A';c<='Z';c++){
            System.out.print(c+" ");
        }
        //Task19-->Verilen sayının basamak değerinini bul
        long num3=1234567222;
        int count=0;
        while(num3!=0){
            num3=num3/10;
            ++count;
        }
        System.out.println(count);*/
        //Task20-->Syıları tersten yazdır
        int num4=123456;
        int reversenum=0;
        while (num4!=0){
            int n=num4%10;
            reversenum=reversenum*10+n;
            num4=num4/10;
        }
        System.out.println(reversenum);
        // 2 yol
        String str=String.valueOf(num4);
        for (int i=0; i<str.length(); i++){
            System.out.print(i);
        }
    }
}
