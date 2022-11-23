package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task05 {
    public static void main(String[] args) {
        /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
       ArrayList<String> liste=new ArrayList<String>(Arrays.asList("$13","$15","$20"));//48
        ArrayList <String>arrList1 = new ArrayList<String>(Arrays.asList("$-13", "$15", "$-20")); //sum -1 doner
       System.out.println("toplam: "+getSum1(liste));
        System.out.println("toplam: "+getSum1(arrList1));

    }

    public static int getSum1(ArrayList<String>list) {
        int  sum=0;
        for (String s:list) {//for each ile çözüm
            String str=s.replace("$","");// ´$ hiçlikle değiştirdik ,
            sum+=Integer.parseInt(str);// sonra kalanları sayıya çevirdik ve topladık

        } if(sum<0){
            return -1;
        }else return sum;
    }

    //parse int : primitive return eder
    //value Of : non primitive return eder

}
