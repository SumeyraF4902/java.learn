package j25_Encapsulation.encapsulation03;

public class Arac {
    /*
    1- fieldları (encapsulated)=(private korumalı olacak) model (String), renk(String), motor(int), yıl(int)
    olan arac isimli bir class create ediniz
    2- bütün fieldları parametre olan bir constructor tanımlayınız
    3-Runner isminde main için bir class oluşturunuz.
    4- iki adet parametreli constructor 1 adet parametresiz cons. ile 3 adet araba creat ediniz.
    5- Aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girişine karşı kontrol ediniz
     */
    //fields  1 . step( 1.madde)
    private String model;
    private   String renk;
    private int motor;
    private int yıl;

    public Arac(String model, String renk, int motor, int yıl) {//2. step full parametreli constructor
        this.model = model;
        this.renk = renk;
       // this.motor = motor;
        setMotor(motor);//set method call edildi. call etmezsek - girdiğinde onu + yapamayız
        //this.yıl = yıl;
        setYıl(yıl);//set method call edildi. call etmezsek - girdişinde onu + yapamayız.
    }

    public Arac() {//4. step  parametresiz constructor
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if(motor<1000) {
            System.out.println("agam bisiklete bineydin daha hızlı giderdin");
            this.motor=1001;
        }else  this.motor =motor;
    }

    public int getYıl() {

        return yıl=yıl;
    }

    public void setYıl(int yıl) {
        if (yıl<0) {
            this.yıl = yıl*(-1);
            System.out.println("agam nişşledin milattan önce araba vardı da bizmi binemedik");
        }else this.yıl = yıl;
        //this.yıl = Math.abs(yıl);
    }

    @Override
    public String toString() {
        return "agam tekerine taş değmesin"+
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl ;
    }
}