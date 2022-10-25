package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
       C04_Teacher ogtrm1=new C04_Teacher();//öğretmen1 üzerinden obj create edildi.
       ogtrm1.adı="sümeyra";
       ogtrm1.soyAdı="nergiz";
       ogtrm1.branş="Qa";
       ogtrm1.emekli=false;
       ogtrm1.maas=23000;
       ogtrm1.tecrube=11;
        System.out.println("ogtrm1 = " + ogtrm1);
        C04_Teacher ogtrm2= new C04_Teacher("muhsin","sevgi",10,"başöğretmen",50000,1,false);
        System.out.println("ogtrm2 = " + ogtrm2);
    }
}
