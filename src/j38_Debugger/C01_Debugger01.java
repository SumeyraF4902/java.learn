package j38_Debugger;

public class C01_Debugger01 {// hata ayiklayici demek
     /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir..


İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
    static  int ebikgabik=7;////class level static global variable tanımlandı
     public static void main(String[] args) {
         method01();

     }//main sonu

    private static void method01() {
        System.out.println("*    **  Method01 calisiyor    *****");
        int a=0;// local variable tanımandı
        ebikgabik++;
        for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
            a+=2*i;
        }
        System.out.println();
        System.out.println("*** Method02 call ediliyor");
        method02();
        System.out.println("****** Method03 call edidii");
        method03();
        System.out.println("*    **  Method01 biitiiii    *****");
    }

    private static void method03() {
        System.out.println(" ****Method03 calisiyor");
        ebikgabik+=5;
        for (int i = 1; i <=5; i++) {
            System.out.print(i+" ");

        }System.out.println();
        System.out.println("*** Method03  BİİTTTTTTTTTİİİ");
    }

    private static void method02() {
                System.out.println(" ****Method02 calisiyor");
                ebikgabik-=3;
                for (int i = 1; i <=7; i++) {
                    System.out.print(i+" ");

        } System.out.println();
        System.out.println("*** Method02  BİİTTTTTTTTTİİİ");
    }
}
