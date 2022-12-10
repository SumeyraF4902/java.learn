package Team07_OkulYonetimi.calısma;

public class Yeni {
    static String ders="matematik";
    String name;
    double ortalama;
    boolean doruMu=true;


    public static void main(String[] args) {
        int yas=23;
     Yeni obje=new Yeni();
        obje.ortalama=53.85;

        ders="fizik";
        Yeni baslangıc=new Yeni();
        baslangıc.name="şule";
        baslangıc.ortalama=50.25;
        baslangıc.doruMu=true;
        ders="bilgisayar";
        Yeni.ders="gunes";
        int num=3;
        System.out.println(num++); //cte

        System.out.println(ders);
    }

    public static void  ders1(){
        String ödev1="turkce";

        for (int i=0;i<5; i++){
            int derece=18;
        }
        ders="fen";
    }

    public static class Constructor {

         int size;
         String kumas;

         /* YAPICI KURUCU METHOD
            1- constaructor ismi Class name ile aynı olmalı. büyük harf ile başlamalı
            2- constaructor create edildiğinde name den sonra () {} mutlaka kullanılmalı
            3- eğer parametreli constaructor create edildiğinde java default(parametresiz) cons. ezer(siler).

            4- constaructor  aslında bir methoddur  ama bir  değer dönmez ; return type olmaz  buda onu methoddan ayıran özelliğidir.

            5- class oluştuğunda java default constaructor kendi create eder.

    NASIL CONSTRACTER OLUSTURULUR
    1.  İlk adım olarak “Constructor” yapıyı oluşturabileceğim boş bir sınıf oluşturuyorum.
    2.  Daha sonra, kurucu metot yapımızın ismi ile sınıf yapımızın ismi aynı olmak zorunda
    olduğundan dolayı java constructor kullanımını bu kurala uygun bir şekilde gerçekleştiriyorum.
    3, Tanımla işlemini gerçekleştirirken mutlaka erişim belirleyicisini “public” olarak belirtmemiz gerektiğinden dolayı metot
    yapımızın erişim belirleyicisini “public” olarak belirliyorum.

    PARAMAETRELİ Constructor

    public constructor(int a, String b){}

    PARAMAETRESİZ Constructor

    public constructor(){}

    4. Daha sonra oluşturmuş olduğumuz bu sınıf içerisinde çalışanların bilgilerini kayıt edebilmek için çeşitli değişkenler tanımlayalım.
    5. Tanımlamış olduğumuz bu değişken yapılarını daha güvenli bir yapıda olabilmesi için erişim belirleyicisini “private” olarak tanımlayalım.
                             neden get ve set oluştururuz
    6.Bu aşamalardan sonra sınıf yapımızdan nesne türetildiği zaman bu değişkenlere değerlerin rahatlıkla atanabilmesini sağlamak
     için getter ve setter metot yapılarını oluşturalım.
    Tüm bu işlemlerden sonra oluşturmuş olduğumuz “EmployeManager” sınıf içerisindeki kod blokları aşağıdaki gibi olmuştur.

       ///---> Değişken Tanımlama İşlemleri <---\\\
        private String ayrac = new String(new char[15]).replace("\0", "-");
        private String isim, soyisim, mailAdresi,unvan;
        private int yas, maas;
        ///---> Getter ve Setter Metotlarının Tanımlanması <---\\\


            neden toString yaparız
             */
         public static void main(String[] args) {
              String ayrac = new String(new char[15]).replace("\0", "-");
              System.out.println(ayrac);
              Constructor_obje ogr= new Constructor_obje();
              Constructor tsort= new Constructor();
              tsort.kumas="keten";
              tsort.size=36;
              ogr.isim="gazi";
              ogr.okul="Barboros";
              ogr.yas=12;
              ogr.soyisim="barıs";
              ogr.numara=123;
              System.out.println(ogr.toString());

         }
    }

    public static class Constructor_obje {

        ///---> Değişken Tanımlama İşlemleri <---\\\
        public String isim, soyisim, okul;
        public int  numara,yas;

        ///---> Getter ve Setter Metotlarının Tanımlanması <---\\\
       // public constructor_obje(String isim, String soyisim, String okul, int numara, int yas) {

      //  }
    Constructor_obje(){}
    void goster(){
        System.out.println (okul+ " "+numara + " " + isim + " " +soyisim+"  "+ yas);
    }



        @Override
        public String toString() {
            return "constructor_obje{" +
                    "isim='" + isim + '\'' +
                    ", soyisim='" + soyisim + '\'' +
                    ", okul='" + okul + '\'' +
                    ", numara=" + numara +
                    ", yas=" + yas +
                    '}';
        }
    }
}
