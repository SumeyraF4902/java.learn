package j32_Abstract.Ornek3;

public abstract class Salad extends Food{

    public  abstract void madeIn();//parent ve child abs classlarda aynı isimli iki meth tanımlanabilir.
    public void taste(){
        System.out.println( "Agam salatanı gavurdağı , çoban ,söğüş mü verlim");
    }

}
