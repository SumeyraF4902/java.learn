package Arrays_List_Tasklar;

import java.util.Scanner;

public class bisiklet {

         /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
    Scanner sc=new Scanner(System.in);
       // fields;
    int hiz;
    int vites;
static int secim;
    public bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    public void hizdegistir(int hiz){
       this.hiz=hiz;
    }
    public int  vitesArtir() {
        vites++;
return vites++;
    }
    public int vitesAzalt(){
        vites--;
        return vites--;
    }
    public void durunGoster(){
        System.out.println("hızınız  "+hiz+   "vitesiniz  "+vites);
    }

    public void islemYap() {
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n Hız değiştirmek için =0\nVites azaltmak için=1\nVites " +
                "arttırmak için =2\n Durumunuzu görmek için =3\n çıkmak için =4 \nseçiniz");
        secim= sc.nextInt();
        switch (secim) {
            case 0:
                System.out.println("Hızınızı yazınız");
                int hiz = sc.nextInt();
                hizdegistir(hiz);
                break;
            case 1:
                if (vites < 1) {
                    System.out.println("vites 1 den küçük olamaz");
                    vites = 1;
                    break;
                }
                vitesAzalt();
                break;
            case 2:
                if (5 > vites) {
                    System.out.println("vites 5 den büyük olamaz");
                    vites = 5;
                    break;
                }
                vitesArtir();
                break;
            case 3:
                durunGoster();
                break;
            case 4:
                break;
            default:
                System.out.println("yanlış seçim yaptınız tekrar deneyin");
                islemYap();
                break;

        }while (!(secim==4));

    }

}

