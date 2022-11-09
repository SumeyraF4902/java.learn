package day08;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // verilen string değerinin içerdiği karakter sayılarını yazdıran code create ediniz
        String str="nfmllşkgfşşö şlşgkklv#½$+542165484 vöb";
        //logic
        //1 . aşama verilen bütün karakterleri gezeceğim için for loopa ihtiyacım var.
        //2. karakter sayısını almak için bizlere değeri 0 olan bir int değer girmem lazım.
        //3. str ifadesindeki er karakterden sadece 1 adet içeren bir String gerekiyor.(benzersizStr)
        String benzersizStr="";

      for(int i=0; i<str.length(); i++) {
          if(!benzersizStr.contains(""+str.charAt(i))) {

              benzersizStr+=""+str.charAt(i);
          }

      }
        System.out.println(benzersizStr);
      for(int i=0;i<benzersizStr.length();i++) {
          int adet = 0;
          for (int j = 0; j < str.length(); j++){
              if (benzersizStr.charAt(i) == str.charAt(j)) {
                  adet++;
              }}
          System.out.println(benzersizStr.charAt(i) + "= " + adet);


    }
}}
