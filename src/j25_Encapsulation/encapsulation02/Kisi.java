package j25_Encapsulation.encapsulation02;

public class Kisi {//pojo class
    /*
    Kişi pojo class için field(özellikler)--> ad, soyad, password(String), yas
    tüm fieldları kullanıcı görebilmeli ve  password haric update(değiştirebilmeli) edebilmeli
   ( password encapsulated update edilmemeli)
    yaş variable negatif değer girmeye karşı encapsulated

    runner class da obje ile field lrı print eden code create ediniz

     */
    //fields
    String ad;
    String soyAd;
    private String password;// değiştirmeye karşı korumalı
    private int yas;// negatif olmaya karşı korumalı

    public Kisi(String ad, String soyAd, String password, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.password = password;
        this.yas = yas;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 0) {
            this.yas = yas;
        } else this.yas=yas*-1;
        // 2 yol this.yas=Math.abs(yas);-->parametre gelen yas - den kurtularak inst. varib. atandı. mutlak değeri alındı Math.abs ile.
    }
}