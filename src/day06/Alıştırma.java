package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alıştırma {
   static ArrayList<String>gunler= new ArrayList<>(Arrays.asList("pazartesi"," salı","çarşamba","perşembe","cuma","cumartesi","pazar"));
   static ArrayList<Double>gunlukKazanclar=new ArrayList<>();
   static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int gün=0;
        while(gün<7){
        System.out.println("agam "+ gunler.get(gün)+" günün hasılatını gir");
        gunlukKazanclar.add(sc.nextDouble());
        gün++;






}}}