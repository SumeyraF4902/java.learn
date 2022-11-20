package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
        System.out.println("l1 list ilk hali: " + l1);//[Nur, Gamze, Erol, Bekir]

        //l1 elemanlarını foor loop yaparak print ediniz
        for (int i=0; i<l1.size();i++){
        System.out.print(l1.get(i) + " ");//Nur Gamze Erol Bekir
    }
            System.out.println("***********    ");

            // l1 elemanlarını for each loop ile print ediniz
            for(String w:l1) {
                System.out.println(w+ " ");}
        System.out.println();
        System.out.println("****");
        //l1 elemanlarını :-) for loop ile uptade edip print ediniz
        for (int i=0; i<l1.size(); i++) {
            l1.set(i, l1.get(i)+":-)");
        }
        System.out.println("l1 :-) uptade sonrası"+ l1);//l1 :-) uptade sonrası[Nur:-), Gamze:-), Erol:-), Bekir:-)]

        System.out.println();
        System.out.println("   ***   ");

        // l1 herbir  elemanı nı :-( for each loop ile update edip print ediniz

        for(String w:l1) {
            w += ":-(";
        }
        System.out.print("l1 :-( update  sonrası"+ l1);//[Nur:-), Gamze:-), Erol:-), Bekir:-)]
        /*
        index desteklemeyen yapılarda tekrarlayan aksiyon için for each loop update yapamayabilir yukarideki task de olduğu gibi
        Bu durumda java ıtrerator interface den tanımlanacak variable ile tekrarlayan aksiyonlar index olmadan yapılır.
         */

        System.out.println();
        System.out.println("  *****  ");
        Iterator<String> it1=l1.iterator();//Iterator intfaceden it1 variable tanımlandı. atama olarak l1 elemanları atandı.
        while (it1.hasNext()) { //hasNext()->it1 elamanları için pointer old yerde eleman varsa true yoksa false verir ve pointer
            // bir sonrakı eleman önüne koyulur
            System.out.print(it1.next()+" ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-) //next()-> list'in pointer önündeki  elemnını return eder
        }
        System.out.println();
        System.out.println("***Iterators");
        List<String> l2 = new ArrayList<>(Arrays.asList("Baran", "Gülsüm", "Akif", "Nazım"));
        // l2 elemanlarını ıterator ile silip print ediniz l2=[]
        System.out.println("ıterator öncesi l2  " +l2 );//ıterator öncesi l2  [Baran, Gülsüm, Akif, Nazım]
        Iterator<String> it2=l2.iterator();
        while (it2.hasNext()) {//tekrardaki pointer önündeki eleman varlığını kontrol eder
            it2.next();//tekrardaki pointer önündeki elemanı verir
            it2.remove();// next() ile gelen elemenı siler
}
        System.out.println("ıterator sonrası l2 "+ l2);// []

        List<String> l3 = new ArrayList<>(Arrays.asList("Baran", "Gülsüm", "Akif","Nazım"));
        // l3 elemanlarını ıterator ile :-) set edip print ediniz--
        System.out.println("iterator öncesi l3 "+ l3);//iterator öncesi l3 [Baran, Gülsüm, Akif, Nazım]

        ListIterator<String> it3=l3.listIterator();//tekrar iterator yapısı tanımlandı
        while (it3.hasNext()) {
            it3.set(it3.next() + " :-)");// tekrardaki next ile elamanı :-) concat ederek update yapıldı
        }System.out.println("iterator sonrası l3 " + l3);//iterator sonrası l3 [Baran :-), Gülsüm :-), Akif :-), Nazım :-)]
        System.out.println();
        System.out.println("  ****   ");
        List<String> l4 = new ArrayList<>(Arrays.asList("Serhat", "Yakup", "Mustafa","Nazlı"));
        System.out.println("LİstIterator öncesi l3 "+ l3);

        // l3 elemanlarının ilk harfi büyük, kalan 3 harfi *** karakteri ve l4 listi ekleyip print ediniz
        ListIterator<String> it4=l3.listIterator();//tekrar iterator yapısı tanımlandı

        while (it4.hasNext()) {
            it4.set(it4.next().toUpperCase().charAt(0)+"***");//next() ile gelen l4 elemanı ilk harf büyük olan kalan 3 harf*** set edildi
            it4.add(l4.toString());// tekrardaki update edilen l3 e l4 add edildi eklendi
}

        System.out.println("LİstIterator set ve add  sonrası l3 "+ l3);
    }
    }

