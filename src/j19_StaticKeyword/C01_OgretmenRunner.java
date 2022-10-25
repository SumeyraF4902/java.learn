package j19_StaticKeyword;

    public class C01_OgretmenRunner {
        public static void main(String[] args) {
            C01_Ogretmn.okul="KABATAŞ ERKEK LİSESİ";

            C01_Ogretmn hc1=new C01_Ogretmn("cüneyt",11);
            System.out.println("hc1.tecrube="+ hc1.tecrube);
            System.out.println("hc1.isim="+ hc1.isim);
            //hc1.okul="kabataş";// sttaic var. objeyle call edilmez.
            System.out.println("hc1.okul= "+hc1.okul);


            C01_Ogretmn.okul="KABATAŞ ERKEK LİSESİ";


            C01_Ogretmn hc2=new C01_Ogretmn("Bekir",7);
            System.out.println("hc2.tecrube="+ hc2.tecrube);
            System.out.println("hc2.isim="+ hc2.isim);
            //hc2.okul="kabadaş";//sttaic var. objeyle call edilmez.
            System.out.println("hc2.okul= "+hc2.okul);

            C01_Ogretmn hc3=new C01_Ogretmn("Nazım",13);
            System.out.println("hc3.tecrube="+ hc3.tecrube);
            System.out.println("hc3.isim="+ hc3.isim);
            //hc3.okul="gabadaş";//sttaic var. objeyle call edilmez.
            System.out.println("hc3.okul= "+hc3.okul);

            hc1.evlilikYıldonumu();//obje ile nan static method call edildi.
            C01_Ogretmn.maasHesapla();//class name ile static method call edildi.
            hc2.maasHesapla();//obj ile static meth. call --> bad practice
        }

}
