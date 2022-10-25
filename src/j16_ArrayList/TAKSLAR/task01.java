package j16_ArrayList.TAKSLAR;

import static jdk.nashorn.api.scripting.ScriptUtils.convert;

public class task01 {
    public static void main(String[] args) {
        convert("kilogram",2);
    }
    public static void convert(String birim, int miktar){
        switch (birim){
            case"saat":
                System.out.println(miktar*60*60);
                break;
            case"mil":
                System.out.println(miktar*1.6);
                break;
            case"kilogram":
                System.out.println(miktar*1000);
                break;
            default:
                System.out.println("g");
        }
        }
        }














