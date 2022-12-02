package day15.Day04;

public class Q08_FrequencyOfGivenCharacters {
    public static void main(String[] args) {
        /*
        verilen bir metindeki harflerin frekansını(tekrarlayan sayısını )bulup yazdıran bir method olustur
        INPUT  AAABBBCCDEFGG
        OUTPUT A3B3C2CD1E1F1G2
        */
         String str="aaacccbbbbbbbdddefsaatcx";
         String output="";

         for (int i=0;i<str.length();i++) {//i kıyas edilen harf
             int sayac = 0;
             for (int j = 0; j < str.length(); j++) {// j-> kıyas eden harf, onun icin i den baslamak gerek
                 if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                     sayac++;
                 }
             }
             if (!output.contains(str.substring(i, i + 1))) {// eger kıyas edilen harf outputta yoksa
                 output += str.substring(i, i + 1) + sayac;
             }
         }
        System.out.println(output);
    }
}
