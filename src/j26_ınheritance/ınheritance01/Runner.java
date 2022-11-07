package j26_ınheritance.ınheritance01;

public class Runner {

      /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler (ana özellelikler) parent class'a, specific(özel) ozellikler child class'a tanımlanır.
 4)Parent Child Relationship(ebeveyn -cocuk ilişkisi), "reusability(tekrar tekrar kullanma)", "maintenance(tamir edilme-test edilebilme özelliği)",
   "less code(kod kısalığı)", "well organization(iyi okunalabilme- anlaşılabilme)" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.yani
 özellik babadan oğula geçer, oğuldan babaya değil.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance(inheritance=miras)
  denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent(ebeveyn) class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
      public static void main(String[] args) {
          Hayvancık hyvn=new Hayvancık();
          hyvn.hareket();
          hyvn.içme();
          hyvn.yeme();

          System.out.println("    ***       ");
          Mammal m1=new Mammal();
          m1.sutBeslenme();// child mammal class call edildi
          m1.dogum();//child mammal class call edildi
          m1.içme();//parent Hayvancık class call edildi
          m1.yeme();//parent Hayvancık class call edildi
          m1.hareket();//parent Hayvancık class call edildi
          System.out.println("    ****     ");

          Paluk hms=new Paluk();
          hms.ızgaraTava();
          hms.hareket();//parent Hayvancık class call edildi
          hms.yeme();//parent Hayvancık class call edildi
          hms.içme();//parent Hayvancık class call edildi
          System.out.println("    ****     ");

          Kedi kd=new Kedi();
          kd.cırmalama();
          kd.hareket();
          kd.yeme();
          kd.içme();
          kd.dogum();
          kd.sutBeslenme();

          System.out.println("   *****    ");

          Koyun ky=new Koyun();
          ky.semir();
          ky.hareket();
          ky.yeme();
          ky.içme();
          ky.dogum();
          ky.sutBeslenme();

      }



}
