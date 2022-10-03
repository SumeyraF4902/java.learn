package j02_Datatypes_WrapperClass;

public class C04_WrapperClassSarıcı {
    public static void main(String[] args) {
        String name="Sümeyra";
        int yas=33;
        System.out.println(name.toUpperCase());
        String tc="1234455";
        String id="98765";
        System.out.println(tc+id);
        int yeniTC=Integer.valueOf(tc);
        int yeniID=Integer.valueOf(id);
        System.out.println("yeniID = " + yeniID);
        System.out.println("yeniTC = " + yeniTC);

        String okulNo="2345431";
        int yeniOkulNo= Integer.valueOf(okulNo);
        System.out.println("yeniOkulNo = " + yeniOkulNo);
       // TASK byte short int maxsimuum değerlerini print eden code yazınız
       byte maxByteDegeri= Byte.MAX_VALUE;
       byte minByteDegeri= Byte.MIN_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);


        System.out.println();

    }
}
