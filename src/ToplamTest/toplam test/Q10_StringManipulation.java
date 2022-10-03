public class Q10_StringManipulation {


    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
        String s="  Java ogrenmek123 Cok guzel@      ";
        s=s.replaceAll("\\d","")//"  Java ogrenmek Cok guzel@  "
        //.replaceAll("\\W","")//JavaogrenmekCokguzel BUNU UYGULAYAMAYIZ BOŞLUKLARDA GİDER
                .replace("@","")  // Java ogrenmek Cok guzel
                        .replace("C","c")//"    Java ogrenmek cok guzel      "
                .trim();//Java ogrenmek cok guzel kenar boşlukları yok etti.
        System.out.println(s);





    }
}
