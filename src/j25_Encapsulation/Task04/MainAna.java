package j25_Encapsulation.Task04;

import java.util.Scanner;

public class MainAna {
    public static void main(String[] args) {

/* Burada iki adet class vardır. Biri main diğeri ise Student.
Student class içinde ;
String name isim ve int age (yaş) variables (değişkenler) enscapsulated ediniz.

Main class içinde girilen değerleri aşağıdaki gibi print eden code create ediniz
örnek
 age=12;
 name= steven dır
 name isim olarak ;
 "Student name is Steven"
 ve
 age yaş olarakta
 "He is 12 years old"

 */
        Scanner input=new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String ad= input.nextLine();
        System.out.println("yaşınızı giriniz");
        int yas=input.nextInt();
        Student s1=new Student(ad,yas);// ad ve yas data p'li const. parametre olarak gönderildi. sb obj tanımlandı.
        System.out.println("Student name is " + s1.getName()+ "\nHe is age "+ s1.getAge()+" years old");


    }//main sonu
}// class sonu
class Student {// Student class--> inner class
    //String name isim ve int age (yaş) variables (değişkenler) enscapsulated ediniz.
    String name;
    int age;

    public Student(String name, int age) {// full p. constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}