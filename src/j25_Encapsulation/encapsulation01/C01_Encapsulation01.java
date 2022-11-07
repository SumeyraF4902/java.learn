package j25_Encapsulation.encapsulation01;

public class C01_Encapsulation01 {
    /*
		 	1) Encapsulation kisaca "data hiding" demektir

		 	2) Basarili bir Encapsulation için :
		 		a)Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
		 		b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
		     	karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
		 		c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

		 	3) Encapsulation yapısı  tanımlanması için
		 		a)Access modifier'lari private tanımlanmalı
		 		b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
		 	    update edilebilmeli(setter)	.
		 	    c) uygun constructor tanımlanmalı.
		 	    d) toString() method tanımlanmalı


		 	4) Encapsulation'in faydalari
		 		a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
		 		b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
		 	     tum classlar'dan istenildiği kadar kullanabiliri.
		 		c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
		 	    hale getirebilir.
		 		d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
		 	    (setter() olusturma) yapabilir.

		 	  ====>  ahan da  TRICK : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
		 	     data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

		 	5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

		 */
    public static void main(String[] args) {
        C02_Encapsulation01 obj1=new C02_Encapsulation01("dilek hanım",11);
        C02_Encapsulation01 obj2=new C02_Encapsulation01();
        System.out.println("obj1.idVer() = " + obj1.idVer());//11
        System.out.println("obj1.isimVer() = " + obj1.isimVer());// dilek hanım
        obj1.isimDegis("dilek teamlead");// dilek hanım ismi dilek teamlead olarak set(update ) edildi.
        System.out.println("obj1.isimVer() = " + obj1.isimVer());//dilek teamlead
        System.out.println("obj2.idVer() = " + obj2.idVer());//1001
        System.out.println("obj2.isimVer() = " + obj2.isimVer());//Gamze Hanım
        obj2.isimDegis("gamze hanım scrum master");
        System.out.println("obj2.isimVer() = " + obj2.isimVer());//gamze hanım scrum master
        System.out.println("obj2 = " + obj2);// referans numarasını verir==C02_Encapsulation01{name='gamze hanım scrum master', id=1001

    }
}
