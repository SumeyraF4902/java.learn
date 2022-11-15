package j32_Abstract.Ornek3;

public class Runner {
    public static void main(String[] args) {
        Baklava b= new Baklava();
        b.madeIn();//Agam baklava yerli ve milli halis 27 ayar tatlı
        b.taste();//Goood Sugar talı iyidir
        System.out.println(b);//j32_Abstract.Ornek3.Baklava@35f983a6  ata classa toString yapıp oradan  call edersek bu çıkmaz.

        SezarSalad ss= new SezarSalad();
        ss.taste();//Agam salatanı gavurdağı , çoban ,söğüş mü verlim
        ss.madeIn();//Agam sezar yemiş biz bakmışız çok ta şey etme İtaly
    }
}
