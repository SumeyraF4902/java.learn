package day13;

public class task06 {
    public static void main(String[] args) {
        /*
        Farklı 4 öğrencinin sırasıyla 6,4,3, ve 5 yazılı notlarının ortalamasını
        yazdıran parametreli method yazınız
         */
        ortalamaBul1("fatih",56,67,85,95,100,80);
        ortalamaBul1("ali",75,80,64,95);
        ortalamaBul1("aliye",85,95,82);
        ortalamaBul1("fetiye",87,85,95,100,80);
    }

    private static void ortalamaBul1(String name, int...a) {

        double sum=0;
        for (int each:a){
            sum+=each;
        }
        System.out.println(name+ "--> not ortalaması:"+(sum/a.length));
    }
}
