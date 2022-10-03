package day3;

public class Q05_NestwdIfTernary {
    public static void main(String[] args) {

       /* 0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
        kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
        cikis "Gecersiz" olmalidir
        NestedIf ve Ternary kullanarak 2 yolla da cozunuz*/
        //Nested İf ile
        int num = 14;
        String result = " ";
        if (num >= 0 && num <= 9) {
            if (num == 9) {
                result = "nine";
            } else if (num == 8) {
                result = "eight";
            } else if (num == 7) {
                result = "seven";
            } else if (num == 6) {
                result = "six";
            } else if (num == 5) {
                result = "five";
            } else if (num == 4) {
                result = "four";
            } else if (num == 3) {
                result = "three";
            } else if (num == 2) {
                result = "two";

            } else if (num == 1) {
                result = "one";


            } else result = "hatalı";
        System.out.println("result = "+result);

        }
    }
}
