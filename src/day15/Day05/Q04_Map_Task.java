package day15.Day05;

import java.util.*;

public class Q04_Map_Task {
    public static void main(String[] args) {
        // PART 1
        // create a map with groupName as key and groupMembers as value
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]


        // BÖLÜM 1
        // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
        // "Grup1" = ["Üye1", "Üye2"]
        // "Grup2" = ["Üye3", "Üye4", "Üye5"]

        // PART 2
        // find how many members each group has

        // BÖLÜM 2
        // her grubun kaç üyesi olduğunu bul
        HashMap<String, ArrayList<String>> grubIsimVeUyeler = new HashMap<>();
        ArrayList<String> grub1 = new ArrayList<>(Arrays.asList("Ahmet", "Ali", "Veli", "Sevi", "Deli"));
        ArrayList<String> grub2 = new ArrayList<>(List.of("Aliye", "Veliye", "Seviye", "Selime"));
        grubIsimVeUyeler.put("BuyukGrup", grub1);
        grubIsimVeUyeler.put("KucukGrup", grub2);
        System.out.println(grubIsimVeUyeler);//{BuyukGrup=[Ahmet, Ali, Veli, Sevi, Deli], KucukGrup=[Aliye, Veliye, Seviye, Selime]}
        System.out.println("grubIsimVeUyeler.size() = " + grubIsimVeUyeler.size());//2

        // bolum 2
        // 1 yol valulardan giderek
        Collection<ArrayList<String>> values = grubIsimVeUyeler.values();
        for (ArrayList<String> kisi : values) {
            System.out.println(kisi.size());//5,4

        }
        // 2 yol key lerden giderek
        Set<String> keys = grubIsimVeUyeler.keySet();// keyset keyleri set olarak dondurur
        for (String key : keys) {
            //System.out.println(key);// BuyukGrup KucukGrup

        ArrayList<String> grupList=grubIsimVeUyeler.get(key);
            System.out.println("gruptaki uye sayisi : "+ key+ " "+ grupList.size());
            //gruptaki uye sayisi : BuyukGrup 5
            //gruptaki uye sayisi : KucukGrup 4
    }
}}