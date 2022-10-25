package j18_Constructor;

public class C07_Ogrtm {//Öğretmen obj için  kalıphane
    //Fields
    String isim;
    int tecrube;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrube) {// 2 parametreli cons.
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kıdemHesapla(int kıdem){//int parametreli void method.
        System.out.println("agam kıdemin  :"+(kıdem*2));
        System.out.println("agam kıdemin  :"+(this.kıdem*2));




         }
}
