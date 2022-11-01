package j23_varargs_String_Builder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	     ****   1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		*****    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS
            3- Varargsın objeleri arr gibi toplanır.
           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */
        //Task  -->Verilen iki sayının toplamını  print eden Method create ediniz
        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;
        topla(sayi1, sayi2);
        topla(sayi3, sayi2);
        topla(sayi1, sayi4);
        topla(sayi4, sayi2,sayi3);
// Task -->Verilen üç sayınını toplamını print eden Method create ediniz
        System.out.println(" Varargs yöntemi toplama işlemi");
        toplavarargs(3,21,sayi3,sayi4);// 4 parametreli
        toplavarargs(3,21,sayi4);// 3 parametreli
        toplavarargs(sayi3,sayi4);//2 parametreli
        enUzunKelime("aga","fatih","lokman");
        enUzunKelime("ali","sümeyra","muhsin cevdet");
    }
    public static void topla(int a,int b) {// iki parametreli overload method
        System.out.println("sayılar toplamı: "+ (a+b));
    }
    public static void topla(int a,int b,int c) {// üç parametreli overload method
        System.out.println("sayılar toplamı: " + (a + b + c));
    }
    public static void toplavarargs(int ...a) {//kaç tane sayı olduğu belli değilse VARARGS yöntemi uygulanır.
        int toplam = 0;
        //  System.out.println("sayılar toplamı: "+(a));// diyemeyiz burada bize sadece a nın ıd sini  verir varargs yönteminde işlemler önce arr
        // olduğu gibi açılır sonra toplanır.
        for (int w : a) {// varargs parametre arr içinde tanımlandığı için parametreler loob ile aksiyon eder.
            toplam += w;
        }
        System.out.println("sayılar toplamı: " + toplam);
    } //Task verilen String ifadenin en fazla karaktere sahip olanı  print eden method create ediniz. parametre sayısı belirli değil
        public static void enUzunKelime(String...str){
            String enUzun="";
            for (String w:str){
                if (w.length()> enUzun.length()){
                    enUzun=w;
                }
            }
            System.out.println("enUzunKelime = " + enUzun);
        }
    }


