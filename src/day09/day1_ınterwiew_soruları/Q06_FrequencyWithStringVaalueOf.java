package day09.day1_ınterwiew_soruları;

public class Q06_FrequencyWithStringVaalueOf {
      /*
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
    string e çeviriyor String.valueOf-->stringi sayıya çevirir
    parseint --> stringi sayıya çevirir
     */
      public static void main(String[] args) {
          String str = "Java is so Good";
          String strOutput ="";
          for (int i=0; i<str.length(); i++) {
              int count=0;// döngünün içinde oluşturuyoruz ki her bir karakteri saysın.
              for (int j=0; j<str.length(); j++){
                  if (str.charAt(i)==str.charAt(j)){
                      count++;
                  }
              }
              if(!strOutput.contains(String.valueOf(str.charAt(i)))){// char olan karakteri stringe dönüştürdük
                  strOutput +=""+str.charAt(i)+count+" ";// ilk boşluk string yapsın diye // son boşluk aralara boşluk atsın diye
              }
          }
              System.out.println(strOutput);

      }


}
