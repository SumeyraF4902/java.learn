package j18_Constructor;

public class C05_Arac {
    //Fields-->objenin üretilirken alacağı değer variables
    //bir classda birden çok cons. tanımlanabilir.
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */


    int maxHız;
    String model;

    public C05_Arac(int maxHız) {//1 parametreli cons
        this(180,"hacıMurat");//2 paramtr. cons.call edildi, ilk satıra yazılmalı
        //yoksa cte verir.
        //maxHız=maxHız;//this olmadığı için parametre değeri inst.
        //variable atanmaz obj maxHız değeri ins. variabledeki default değeri alır.
        this.maxHız = maxHız;// this keyword parametre değeri inst. variable atama yapar
        //obj maxHız değeri parametreden alır.
        System.out.println("agam bu seferde 1 p li cons call.edildi");
    }

    public C05_Arac() {// sefil parametresiz cons.
    }

    public C05_Arac(int maxHız, String model) {// 2 parametreli cons.
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("agam bu yazıyı okuduysan 2 parametreli cons . call edilmiştir.");

    }
    public C05_Arac( String model, int maxHız) {// 2 parametre sırası farklı
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("2 p li cons call edilmiştir.");
}}

