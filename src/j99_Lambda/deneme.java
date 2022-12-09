package j99_Lambda;

import j26_ınheritance.task01.A;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static j99_Lambda.C01_LambdaExpression.ciftMi;
import static j99_Lambda.C01_LambdaExpression.printElFunctional;

public class deneme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("harf giriniz");
        char ch=sc.next().charAt(0);
        if((ch>='a'&& ch<='z')|| ( ch>='A'&& ch<='Z') ){
            System.out.println("alfabee bvar");
        }else System.out.println("yok");

    }

}