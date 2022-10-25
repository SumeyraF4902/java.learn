package j21_ImmutableClass;

public class C02_OCA_Equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;//a="2"
        a += 'c';// a="2c"
        a += false;//a="2cfalse"
        System.out.println(a);

        if (a == "2cfalse") {// şart sağlamaz --> a referansı "2cfalse" atama olmadığı için referans yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        String x="ali";
        String y="ali";

        if (x == y) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda x ve y eşit ==");
        }
        //tanımlana atanan değeri a  ile aynı havuzda ve ref olan b variable
        String b = "2cfalse";
        if (a == b) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
            System.out.println("ahan da referansları aynı havuzda a ve b eşit ==");
        }


    }
}
