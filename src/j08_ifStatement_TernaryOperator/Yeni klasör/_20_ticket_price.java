import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("hızınızı giriniz");
        int hız = scan.nextInt();
        System.out.println("ehliyetiniz var mı 'E' ,'H'");
        boolean ehlyt = scan.nextBoolean();
        if (hız > 45) {
            if (hız > 55 && hız < 74 && ehlyt == E) {
                System.out.println(" Eğer hızınız 55-74 arasında olduğu için :   cezanız 100 $'dır.");
            }
            if ((hız > 55 && hız < 74 && ehlyt != E)) {
                System.out.println("Eğer hızınız 55-74 arasında olduğu ve ehliyetiniz olmadığı için cezanız  : \n" + "300 $'dır");
            }
            if (hız > 74 && hız < 85 && ehlyt == E) {
                System.out.println(" Eğer hızınız 75-84 arasında olduğu  için cezanız: 150 $ dır");
            }
            if (hız > 74 && hız < 85 && ehlyt != E) {
                System.out.println(" Eğer hızınız 75-84 arasında ve ehliyetiniz olmadığı için cezanız  : 350 $ DIR");

            } else System.out.println("yolunuz açık olsun");


        }

    }