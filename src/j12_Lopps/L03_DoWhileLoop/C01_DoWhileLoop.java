package j12_Lopps.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop--->önce şart kontrol edilir eğer şart sonucu true alınırsa body action çalışır.
        Do-While loop--> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
        sart false ise döngü lırılır ve döngüden sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

         */
        int yas=31;
        while (yas<33){
            System.out.println("agam yas"+yas+"gayet başarılı:) while body action");
            yas++;
        }
        do {
            System.out.println("agam yas"+yas+"gayet başarılı:) do  while body action");
            yas++;
        }while (yas<33);
    }
}
