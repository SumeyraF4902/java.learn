package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentClass {

         /*
    Task 03 ->ÜC CLASS AÇILDI LESSONCLASS, STUDENTCLASS,CLASSRUNNER
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    //fields
    String studentName;
    int maxCredit = 10;
    List<lessonClass>dersListesi= new ArrayList<>();

    public studentClass() {
        Scanner sc=new Scanner(System.in);
        this.studentName = studentName;}

        public int toplamKredi() {
            int toplamKredi = 0;
            for (lessonClass list : dersListesi){
                toplamKredi += list.credit;
        }return toplamKredi;




}}
