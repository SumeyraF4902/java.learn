package day06;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alıştırma {
    public static void main(String[] args) {
        StringBuilder strB=new StringBuilder("AVATAR");
       /* strB.insert(0,"K");
        System.out.println(strB);
        StringBuilder sd=new StringBuilder(2+"apple"+3+8+"banana");
        String isim="Elly";
        sd.append(isim,1,3);
        System.out.println(sd);
        sd.delete(3,5);
        System.out.println(sd);*/
        strB.subSequence(1,5);//vata
        System.out.println(strB);
        strB.reverse();//atav
        System.out.println(strB);
        strB.deleteCharAt(2);//atv
        System.out.println(strB);

    }





}
















