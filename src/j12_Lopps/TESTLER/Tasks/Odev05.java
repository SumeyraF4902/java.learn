package j12_Lopps.TESTLER.Tasks;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> origin/master
public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
<<<<<<< HEAD
            Scanner sc= new Scanner(System.in);
        System.out.println(" üçün kuvveti bir sayı giriniz");
        int a= sc.nextInt();
        System.out.println(powerOfThree(a));


    }

    private static boolean powerOfThree(int a) {
        for (int i=1; i<=a;i++){
            if(Math.pow(3,i)==a){
                return true;

            }
        }

        return false;
=======




>>>>>>> origin/master
    }
}
