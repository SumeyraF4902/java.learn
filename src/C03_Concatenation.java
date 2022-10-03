 public class C03_Concatenation {
    public static void main(String[] args) {
        String ad= "SÜMEYRA";
        String soyad="öztürk";

        int a=7;
        int b=11;
// Birden çok String variable ile farklı data type variable'ler + ile işleme alınırsa
// java ile birleştirme yaparak yeni bir String oluşturur,

        System.out.println(ad+soyad+a+b);//

        System.out.println(a+ad+soyad+b);//

        System.out.println(a+b+ad+soyad);//


        System.out.println(" "+a+b);//

        System.out.println(ad+soyad+(a+b));//

        System.out.println((a+b)+ad+soyad);//

        System.out.println(ad+(a-b)+(a-b));//

        System.out.println(ad+((a-b)+(a-b)));//

        char ch='1';//


        System.out.println(ad+ch);

        System.out.println(a+ch+ad);

        System.out.println(ad+(ch+b));

        System.out.println(a+ad+ch);//
        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");
        System.out.println("\"Java\"ile hayat çok\'afilli\'");
        System.out.println("\"Başarı \" gayrete \n \'aşıktır\'\n\n\n\t \"clarusway ile java çok kolay\"");

/* TRICK-> Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
// java birleştirme yaparak yeni bir String oluşturur
TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->*/
















    }
}
