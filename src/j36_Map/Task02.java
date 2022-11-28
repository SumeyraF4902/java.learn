package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */
        //semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
   Map<String,String> sumeyraKartvizit= new HashMap<>();
   sumeyraKartvizit.put("isim","Sümeyra Sarı");
   sumeyraKartvizit.put("telefon","0545 222 11 11");
   sumeyraKartvizit.put("email","sarısarı@gmail.com");
   sumeyraKartvizit.put("adres","Manisa");
        System.out.println("sumeyraKartvizit.get(\"isim\") = " + sumeyraKartvizit.get("isim"));
        System.out.println("sumeyraKartvizit.get(\"telefon\") = " + sumeyraKartvizit.get("telefon"));
        System.out.println("sumeyraKartvizit.get(\"email\") = " + sumeyraKartvizit.get("email"));
        System.out.println("sumeyraKartvizit.get(adres) = " + sumeyraKartvizit.get("adres"));


        Map<String,String> muhsinKartvizit=new HashMap<>();
   muhsinKartvizit.put("isim","Muhsin Öz");
   muhsinKartvizit.put("Telefon","0545 222 11 12");
   muhsinKartvizit.put("Adres","İstanbul");
   muhsinKartvizit.put("email","ozasya@gmail.com");
        System.out.println("muhsinKartvizit.get(\"isim\") = " + muhsinKartvizit.get("isim"));
        System.out.println("muhsinKartvizit.get(\"Telefon\") = " + muhsinKartvizit.get("Telefon"));
        System.out.println("muhsinKartvizit.get(\"Adres\") = " + muhsinKartvizit.get("Adres"));

        Map<String, Map<String,String>> kartvizitler=new HashMap<>();

        kartvizitler.put("sümeyra",sumeyraKartvizit);
        kartvizitler.put("muhsin",muhsinKartvizit);
        System.out.println("Sümeyra'nin bilgileri:"+kartvizitler.get("sümeyra"));
        System.out.println("Muhsin'in bilgileri:"+kartvizitler.get("muhsin"));
        System.out.println("kartvizitler = " + kartvizitler);
        System.out.println("kartvizitler.get(\"sümeyra\").get(\"telefon\") = " + kartvizitler.get("sümeyra").get("telefon"));
// sorudışı çalışmalar
        Map<Integer,Kartvizit> krt=new HashMap<>();// Karvizit clasından değerler aldık.
        Kartvizit k1=new Kartvizit("enise","enise@tester.com","google","54236");
         krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));// k1.id key values
        System.out.println("krt.get(101) = " + krt.get(101));//101 key values
    }
}
