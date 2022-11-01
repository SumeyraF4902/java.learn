package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
          /*
    Task 03 -> ÜC CLASS AÇILDI LESSONCLASS, STUDENTCLASS,CLASSRUNNER
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
        Scanner sc= new Scanner(System.in);
        List<lessonClass> derslist=new ArrayList<>();
        System.out.println("isminizi giriniz");
        String isim=sc.nextLine();
        studentClass öğr1= new studentClass();
        for (int i=1; i<=3;i++) {
            System.out.println(i + ". dersin isminizi giriniz");
            String dersname = sc.nextLine();
            System.out.println(i + ". dersin kredisini giriniz");
            int credit = sc.nextInt();
            sc.nextLine();
            lessonClass temp = new lessonClass(dersname, credit);
            derslist.add(temp);
        }
        studentClass s1= new studentClass();
        s1.studentName="Ahmet";
        s1.maxCredit=10;
        s1.dersListesi=new ArrayList<>();
        for( lessonClass ders:derslist){
            if (s1.toplamKredi()+ders.credit<=s1.maxCredit) {
                s1.dersListesi.add(ders);
            }else System.out.println("kredi aştı");break;

        }
        System.out.println("alınan dersler:");
        for(lessonClass ders:derslist){
            System.out.println(ders);
            System.out.println("Alınamayan dersler:");
            derslist.removeAll(s1.dersListesi);
            for(lessonClass ders2:derslist){
                System.out.println(ders2.dersName);
            }
        }
    }
}
