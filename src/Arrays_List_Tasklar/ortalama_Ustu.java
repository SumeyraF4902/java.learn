package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Scanner;

public class ortalama_Ustu {
    static double toplam=0;
    static ArrayList<Integer>sayı=new ArrayList<Integer>();
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        Scanner sc = new Scanner(System.in);
       int w=1;
       int adet=0;
        while (w==1){
            System.out.println("sayı giriniz");
            int a=sc.nextInt();
            sayı.add(a);
            toplam+=a;

        System.out.println("tekrar sayı girmek istiyorsanız 1, istemiyorsanız 2 giriniz");
        w=sc.nextInt();}
        System.out.println(sayı);

          ortalamaüstü();
    }

    private static void ortalamaüstü() {
        double ortalama=toplam/ sayı.size();
        System.out.println( "sayının ortalaması :"+ortalama);
        ArrayList<Integer>ortalamaustu=new ArrayList<Integer>();
      for(int i=0;i<sayı.size();i++){
          if(sayı.get(i)>ortalama){
              ortalamaustu.add(sayı.get(i));
          }
      }
        System.out.println("ortalama üstü sayılar:"+ortalamaustu);

        }
    }

