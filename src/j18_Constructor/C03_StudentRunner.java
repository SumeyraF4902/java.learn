package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrenci1= new C03_Student();// OĞRENCİ1 OBJ CREATE EDİLDİ.
        ogrenci1.adı="sümeyra";
        ogrenci1.soyadı="öztürk";
        ogrenci1.sınıf=1;
        ogrenci1.okulNo=256;
        ogrenci1.ortalama=100;
        ogrenci1.takdir=true;
        System.out.println("ogrenci1 = " + ogrenci1);//ogrenci1 = j18_Constructor.C03_Student@5f2050f6
        ogrenci1.mezuniyet();//agam diploman hayırlı olsun

    //task diğer bir öğrenci objesiyle tüm fieldleri atayıp print ediniz.
        C03_Student ogrenci2=new C03_Student();
        ogrenci2.adı="memoli";
        ogrenci2.soyadı="sevimli";
        ogrenci2.okulNo=111;
        ogrenci2.sınıf=12;
        ogrenci2.ortalama=98;
        ogrenci2.takdir=true;
        ogrenci2.mezuniyet();
        ogrenci2.sosyalFaaliyet();
        System.out.println("ogrenci2 = " + ogrenci2);
    }

}
