package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException--> arraylerde olmayan bir index elemanı ile işlem yepıldığında oluşan RTE excep. verir.

        int arr[]={24,27,38,41,54};
      //  System.out.println("arr [0] = " + arr[0]);//24

       // System.out.println("arr [7] = " + arr[7]);//ArrayIndexOutOfBoundsException
        try {
            System.out.println("arr [7] = " + arr[7]);//try burada kırıldı catche gitti. catch devreye girdi
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arraydan daha uzun eleman sorarsınız hata alırsınız");
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatıldı  komut  handle edildi ");
        }
        try {
            System.out.println("arr [0] = " + arr[0]);//24  çalıştı catch devreye girmedi
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arraydan daha uzun eleman sorarsınız hata alırsınız");
        }
        System.out.println("Agam sorun handle edildi DEWAMKEE  :)");//Bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur.

    }
}
