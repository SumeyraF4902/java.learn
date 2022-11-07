package j25_Encapsulation.Task03;

public class BMI {
    /*
 Bmı classfields -> name, age, weight,height: boy-kilo encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */
    //classfields:
   private String name;
   private int age;
   private double weight;
   private double height;
        public String getStatus() {//getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
    if (getBMI()<18.5){
      return "Zayıf";
    }else if (getBMI()<25){
        return "Normal";
    }else if (getBMI()<30){
        return "Kilolu";
    }else return "Obez";
}
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;


    }
    public double getBMI() {//getBMI() method -> bmi=weight/(height*height) returb type olmalı
      double  bmi=weight/(height*height);
        return bmi;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}//CLASS SONU
class Runner{// inner class içiçe class demek

    public static void main(String[] args) {
        BMI obj= new BMI("muharrem bey",46,54,1.63);
        System.out.println("BMI :" +obj.getName()+ " "+obj.getAge()+" "+obj.getStatus()+" "+obj.getBMI());

    }//main sonu

}//class sonu
