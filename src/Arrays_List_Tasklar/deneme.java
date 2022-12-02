package Arrays_List_Tasklar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class deneme {
    static int secim;
  static   int hiz;
   static int vites;
    Scanner sc = new Scanner(System.in);






public deneme(int hiz, int vites){
        this.hiz= hiz;
        this.vites= vites;

}
    private  void durumuGoster() {
        System.out.println("hızınız   "+hiz+ "vitesiniz"+ vites);
    }


    private static int vitesiAzalt() {
    vites--;
    return vites--;
    }

    private static int  vitesiArttir() {
    return vites++;

    }

    private void hizidegistir(int hiz) {
    this.hiz= hiz;

    }
public void islemYap(){
    System.out.println("Yapmak istediğiniz işlemi seçiniz:\n Hız değiştirmek için =0\nVites azaltmak için=1\nVites " +
            "arttırmak için =2\n Durumunuzu görmek için =3\n çıkmak için =4 \nseçiniz");
secim=sc.nextInt();
switch (secim){
    case 0:
        System.out.println("hızınızı yazınız");
         int hiz=sc.nextInt();
        hizidegistir(hiz);break;
    case 1:
        if(vites<1){
            System.out.println("vites 1 den kücük olamaz");
            vites=1;break;
        }
        vitesiAzalt();break;
    case 2:

        if(vites>5){
            System.out.println("vites 5 den büyük olamaz");
            vitesiArttir();break;
        }
    case 3:
        durumuGoster();break;
    case 4:
        System.out.println("dikkatli kullanın  :)");break;
    default:
        System.out.println("yanlış giriş tekrar dene");
        islemYap();break;
}while (!(secim==4));
    }

    public static void main(String[] args) {
        deneme basla= new deneme(20,2);
        basla.durumuGoster();
        basla.islemYap();
    }

}

