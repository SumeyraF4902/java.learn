package Arrays_List_Tasklar;

public class bisiklet_Runner {
    public static void main(String[] args) {
         /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
        bisiklet bisiklet1=new bisiklet(20,2);
        bisiklet1.durunGoster();
        bisiklet1.islemYap();
    }
}
