package j18_Constructor;

public class C06_Ogrc {// ogrc obj için kalıphane
    //Fields
    String isim="merve hanım";
    int yas;
    String name;
    int age;


    public C06_Ogrc(String isim,int yas) {// 2 parametreli cons .
        this.isim= isim;
       this.yas= yas;
       // name=isim;
       // age=yas;
        System.out.println("cons'taki isim  :"+isim);
        System.out.println("cons'taki isim  :"+this.isim);
        System.out.println("cons'taki name  :"+name);
    }
}
