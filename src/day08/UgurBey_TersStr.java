package day08;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UgurBey_TersStr {
    public static void main(String[] args) {
        String str="JavaCAN & JAVATAR";
        methot1ForLopLastIndex(str);
        methot2ForLopFirsIndex(str);
        method3WhileSubstring(str);
        method4StrBuilder(str);
        method5StrBuffer(str);
        method6StrArray(str);
        method7CharArray(str);
        method8ByteArray(str);
        method9ArrayList(str);
        method10Recursion(str);//KENDİ İÇERSİNDE KENDİNİ CAGİRAN METHOTLARA DENİR RİKORJIN
        method11Stack(str);// yıgın
        method12Lambda(str);
        method13UnicodeRLO(str);






    }//main sonu

    private static void method13UnicodeRLO(String str) {//METHOD13
        System.out.println("Unicode Right-to-Left  Override ile  "+"\u202E"+str);// sagdan sola ustune yazdırır.
    }

    private static void method12Lambda(String str) {// METHOD 12
        System.out.println("Lambda ile   "+Stream.of(str).map(t -> t.split("")).flatMap(Arrays::stream).reduce("", (s, c) -> c + s));
        // 2 yol
        System.out.println("Lambda ile  "+str.chars().mapToObj(ch -> Character.toString(ch)).reduce("", (s, c) -> c + s));
        // 3 yol
        System.out.println("Lambda ile  "+str.chars().mapToObj(Character::toString).reduce("", (s, c) -> c + s));
        // 4 yol
        System.out.println("Lambda ile  "+Stream.of(str).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()));
    }

    private static void method11Stack(String str) {// METHOD 11
        Stack<Character> stack = new Stack<Character>();
        char [] array=str.toCharArray();
        for (int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        int i=0;
        while(!stack.isEmpty()){// stack bos degilse calıs
            array[i]=stack.pop();//stack.pop(); yontemi stacteki tüm elemanları sırayla alır pop ta aldıgını siler ve yola devam eder
            //stack pop sayesinde azalarak gidiyor
            i++;
        }
        System.out.println("stack ile-->"+String.copyValueOf(array));//char arrayini stringe cevirir
        // 2 yol
        System.out.println("stack ile-->"+new String(array));//char arrayini stringe cevirir

    }


    private static void method10Recursion(String str) {// method 10

        if (!str.isEmpty()) {

            // str ici dolu oldugu surece dongu donecek
            System.out.print(str.charAt(str.length() - 1));// str nin son karakterini verir Methodu her cagirdigimizde son karakteri verecegi icin;
            // cagirirken son karakteri silerek  cagiralim ki sürekli   hata vermesin
            method10Recursion(str.substring(0, str.length() - 1));
        }else System.out.println();//dumy

    }

    private static void method9ArrayList(String str) { // method 9
        ArrayList<String> list=new ArrayList<String>(List.of(str.split("")));
        Collections.reverse(list);
        System.out.println("Arraylist -->"+list);//[R, A, T, A, V, A, J,  , &,  , N, A, C, a, v, a, J]
        String arr[]=list.toArray(new String[0]); //ARRAYLIST  ti array a cevirdik
        System.out.println("Arraylist  ile-->"+ String.join("",arr));// String.join methodu ile arr arasına istedigimiz her seyi koyabiliriz. burada hiclik koyduk hepsini birlestirdik.

    }

    private static void method8ByteArray(String str) {// METHOD 8
        byte[] bytes=str.getBytes();
        System.out.println("Stringimizin son hali-->"+ Arrays.toString(bytes));//[74, 97, 118, 97, 67, 65, 78, 32, 38, 32, 74, 65, 86, 65, 84, 65, 82]
        //str yi aski kodlarına cevirdik, en son tekrar str  cevirecegiz.
        for (int i=0, t=str.length()-1;i<t; i++,t--){
            // burada elimize 2 deger aldik, ve yer degistirerek gidecegiz i bastan baslarken, artarak gidiyor , t sondan baslıyor ,azalarak devam ediyor
            byte temp=bytes[i];// ilk değerin üstüne 2 değer atanacağı için ilk değer kaybolmasın diye bir yere koyduk. SWAP YONTEMI DENIR
            bytes[i]=bytes[t];// ikinci karakteri kendinden önce gelene atadık
            bytes[t]=temp;

        }
        System.out.println(" Byte Array ile "+ new String(bytes));// byte stringe cevirdik



    }

    private static void method7CharArray(String str) {
        char [] charArray = str.toCharArray();
        System.out.println("Char Array ile-->");
        for(int i=charArray.length-1; i>=0;i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();//dumy
    }

    private static void method6StrArray(String str) {// METHOD 6
        String arr[]=str.split("");
        System.out.print("String ARR İLE-->");
        for(int i=arr.length-1; i>=0;i--) {
            System.out.print(arr[i]);
        }
        System.out.println();//dumy
    }

    private static void method5StrBuffer(String str) {//METHOD 5
        StringBuffer sf=new StringBuffer(str);
        System.out.println("StringBuffer ile-->"+ sf.reverse());
    }

    private static void method4StrBuilder(String str) {//METHOD 4
        StringBuilder sb=new StringBuilder(str);
        System.out.println("StringBuilder ile -->"+ sb.reverse());
    }

    private static void method3WhileSubstring(String str) {// METHOT 3
        String str5="";
        while (str.length()>0){
           str5+=str.charAt(str.length()-1);// str nin son karakterini str5 verdik.
           str=str.substring(0,str.length()-1);// burada geri kalan strnin karakterlerini str ye atatık.
            // 1 azalarak gider taki str length 0 dan az olana kadar dongu devam eder

        }
        System.out.println("While ile--> "+str5);
    }

    private static void methot2ForLopFirsIndex(String str) {// METHOD 2
        String str3="";// CHARAT İLE
        String str4="";//SUBSITRING İLE
        for (int i=0;i<str.length();i++) {
            str3=str.charAt(i)+str3;
            str4=str.substring(i,i+1)+str4;

        }
        System.out.println("FORLOP  FİRST INDEX İLE CHARAT-->"+ str3);
        System.out.println("FORLOP  FİRST INDEX İLE SUBSİTRİNG-->"+ str4);
    }

    private static void methot1ForLopLastIndex(String str) {// METHOD 1
        String s1="";// charAt ile
        String s2="";// subsitring ile
        for (int i=str.length()-1; i>=0; i--) {
            s1+=str.charAt(i);
            s2+=str.substring(i,i+1);// sadece i yi alır i den sonra geleni almaz.
        }
        System.out.println("FORLOP CHARAT İLE --> "+s1);
        System.out.println( "FOR LOOP SUBSITRIN İLE  -->"+s2);

    }
}
