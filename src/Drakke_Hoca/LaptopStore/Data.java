package Drakke_Hoca.LaptopStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {
    /*Data Class ı Nitelikleri:
Bulunmamaktadır.
Data Class ı Metotları:
ArrayList<String> AllData(int laptopID) → Parametre olarak laptop id lerini alan ve ve bizlere List dönen bir metot oluşturulmalıdır.
 Bu metot da store da satışı sunulacak laptopların özellikleri eklenmelidir. (Marka, Model, Ram, CPU, Renk) */


    public ArrayList<String> allData(int laptopID) {

        Map<Integer,ArrayList<String>> allData=new HashMap<>();// İÇİNE BİRŞEY EKLEMEK İÇİN PULL KULLANILIR

        ArrayList<String> l1= new ArrayList<>();
        l1.add("Apple");
        l1.add("middle");//200
        l1.add("32 gb");//300
        l1.add("i5");//300
        l1.add("Black");//150

        allData.put(110001,l1);


        ArrayList<String> l2= new ArrayList<>();
        l2.add("Sansung");
        l2.add("max");//300
        l2.add("16 gb");//200
        l2.add("i7");//500
        l2.add("Red");//400

        allData.put(110002,l2);


        ArrayList<String> l3=new ArrayList<>();
        l3.add("Lenova");
        l3.add("min");//100
        l3.add("8 gb");//100
        l3.add("i3");//200
        l3.add("Silver");//200

         allData.put(110003,l3);

        ArrayList<String> l4=new ArrayList<>();

        l4.add("Apple");
        l4.add("max");//300
        l4.add("32 gb");//300
        l4.add("i7");//500
        l4.add("Orange");//300

        allData.put(110004,l4);

        ArrayList<String> l5=new ArrayList<>();
        l5.add("Asus");
        l5.add("middle");//200
        l5.add("4 gb");//50
        l5.add("i3");//200
        l5.add("Black");//150

        allData.put(110005,l5);


        return allData.get(laptopID);
    }
}
