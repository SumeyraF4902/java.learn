package Arrays_List_Tasklar;

public class lessonClass {

         /*
    Task 03 ->ÜC CLASS AÇILDI LESSONCLASS, STUDENTCLASS,CLASSRUNNER
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
    //fields
    String dersName;
    int credit;

    public lessonClass(String dersName, int credit) {
        this.dersName = dersName;
        this.credit = credit;
    }
}



