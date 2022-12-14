package YAPAMADIKLARIM;

import java.util.Scanner;

public class Task_Offer {
    public static void main(String[] args) {
        /* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */
       /* int matrisBoyutu; //Matris boyunu tutacak değişken
            System.out.println("Salyangoz matrisi için boyut giriniz:");
            matrisBoyutu = new Scanner(System.in).nextInt(); //Girilen matris boyunu okuyoruz

        int[][] matris = new int[matrisBoyutu][matrisBoyutu];////salyangoz matrisini tutmak için 2 boyutlu int dizisi oluşturuyoruz.
        //Burada matris içinde salyangoz çizip gerekli değerleri atamak için gereken değişkenler mevcut.
        int apsisGezgini = 0, ordinatGezgini = 0, toplam = 1;
        //Bu değişken true olduğunda apsis ve ordinat gezginlerini arttırırız aksi halde azaltırız.
        boolean arttir = true;
        //Burada boyut sayısı kadar döngü tekrar ettiğinde salyangoz tamamlanıyor.
        for (int i = 0; i < matrisBoyutu; i++){
            //apsis ve ordinat gezginlerinin arttırılma veya azaltmadan önceki değerleri atıyoruz.
            matris[apsisGezgini][ordinatGezgini] = toplam;
            if (arttir){ //Bu alanda hem apsis hem ordinat gezginlerinin değerleri max alabilecekleri kadar arttırılıyor.
                         //Arttırma işlemi yapmak için bir sonraki koordinatın dolu olup olmadığına bakıyoruz.
                while (apsisGezgini + 1 < matrisBoyutu && matris[apsisGezgini + 1][ordinatGezgini] == 0)//Apsis gezginimizi ve toplam değişkenimizi 1 arttırıp gerekli atamayı yapıyoruz.
                                             matris[++apsisGezgini][ordinatGezgini] = ++toplam;//Bir üstteki işlemin aynısı ordinat gezgini için yapılıyor.
                while (ordinatGezgini + 1 < matrisBoyutu && matris[apsisGezgini][ordinatGezgini + 1] == 0)
                               matris[apsisGezgini][++ordinatGezgini] = ++toplam;
                      }
            else{ //Bu alanda hem apsis hem ordinat gezginlerinin değerleri minimum alabilecekleri kadar azaltıyoruz.
                            //Azaltma işlemi yapmak için bir önceki koordinatın dolu olup olmadığına bakıyoruz.
                while (apsisGezgini > 0 && matris[apsisGezgini - 1][ordinatGezgini] == 0)
                                    //Apsis gezginimizi azaltırken, toplam değişkenimizi 1 arttırıp gerekli atamayı yapıyoruz.
                          matris[--apsisGezgini][ordinatGezgini] = ++toplam;
                                       //Bir üstteki işlemin aynısı ordinat gezgini için yapılıyor.
                    while (ordinatGezgini > 0 && matris[apsisGezgini][ordinatGezgini - 1] == 0)
                                     matris[apsisGezgini][--ordinatGezgini] = ++toplam;
                           }
                       arttir = !arttir; //arttir değişkeninin tersini alıyoruz ki üstteki if yapısının blokları sırasıyla işlesin.
        }
               //Oluşturduğumuz salyangoz matrisini ekrana yazdırıyoruz.
                     for (int satir = 0; satir < matrisBoyutu; satir++){
                       for (int sutun = 0; sutun < matrisBoyutu; sutun++)
                           System.out.print(matris[sutun][satir] + "\t"); //Burada ekrana yazılan her değerin yanına düzenli görünmesi için tab boşluğu ekleniyor.
            System.out.println(); //Alt satıra geçiyoruz.

                         Scanner scanner = new Scanner(System.in);
                         System.out.print("Sayı Giriniz: ");
                         int sayi = scanner.nextInt();
                         int neredeyiz = 1;
                         int[][] tablo = new int[sayi][sayi];
                         for(int satir = 0; satir < sayi; satir++){
                             if(satir%2 == 0){
                                 for(int sutun = 0; sutun<sayi; sutun++){
                                     tablo[satir][sutun] = neredeyiz;
                                     neredeyiz++;
                                 }
                             }else{
                                 for(int sutun = sayi-1; sutun >= 0; sutun--){
                                     tablo[satir][sutun] = neredeyiz;
                                     neredeyiz++;
                                 }
                             }
                         }

                         for(int satir = 0; satir<sayi; satir++){
                             for(int sutun = 0; sutun<sayi; sutun++){
                                 System.out.print(tablo[satir][sutun]+"   ");
                             }
                             System.out.println("");*/
                         }

        }







