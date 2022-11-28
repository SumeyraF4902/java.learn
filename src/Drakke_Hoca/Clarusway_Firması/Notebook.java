package Drakke_Hoca.Clarusway_Firması;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product{
    Scanner sc= new Scanner(System.in);// her defasında scanner yazmamak için class seviyesine taşıdık
    /*
NoteBook Class ı Metotları:
 name,price,discountRate,amount,brand,screenSize,ram,memory → niteliklerinin aldığı
  bir constructor create edilmelidir. super class a assign edilmelidir
menu() → Override edilmelidir. bu metoda notebook için işlemler bulunmalıdır
(Notebook ekleme, listesinin görüntülenmesi, silme, markaya göre filtreleme)

addItem() → Override edilmelidir. Bu metodda ürünün ilgili özelliklerinin
 (name,price,discountRate,amount,brand,screenSize,ram,memory) olduğu ve notebook listesine eklendiği işlemler yapılmalıdır.

getProducts() → Override edilmelidir. print methodu call edilmeli
print(ArrayList<Notebook> notebookList) → Notebook listesindeki ürünler olmalıdır.
| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu
 | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |
deleteItem() → Override edilmelidir.  Silme işlemi yapılmalıdır.*/
   // nId=1;
   // ArrayList<Notebook> notebooks=new ArrayList<>() = notebook listesi
    static  int nId = 1;
    static List<Notebook> noteBooks=new ArrayList<>();

    public Notebook( String name, double price, double discountRate, double amount, Brand brand, double screenSize, int ram, int memory) {
        super(nId, name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    } // constructor oluşturuldu

    public Notebook() {

    }

    @Override
    public void menu() {

        System.out.println("1) Yeni Notebook ekleme\n"+
                "2)Notebook listesini görüntüleme \n"+
                "3) Notebook silme");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz....");
        int options= sc.nextInt();
        if (options==1) addItem();
        if(options==2) getProducts();
        if(options==3) deleteItem();


    }

    @Override
    public void addItem() {
        System.out.println("Ürün fiyatı:");
        double price = sc.nextDouble();
        System.out.println("Ürünün adı:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Ürünün indirim oranı");
        double discountRate = sc.nextDouble();
        System.out.println("Ürünün stoğu:");
        int amount= sc.nextInt();
        System.out.println("Ürünün Rami:");
        int ram= sc.nextInt();
        System.out.println("Ürünün ekranı:");
        double screenSize= sc.nextDouble();
        System.out.println("Ürünün hafızası");
        int memory= sc.nextInt();
        System.out.println("Lütfen ürünün markasını listeden seçiniz");
        Brand.printBrands();//printBrands methodu static olduğu için bulunduğu sınıf adıyla çagırdık
        Brand brand=Brand.getBrand(sc.nextInt());// get brand methodu static oldugu için class ismiyle çağırdık. ve sc.nextInt içine koyduk
        Notebook notebook=new Notebook(name,price,discountRate,amount,brand,screenSize,ram,memory);
        noteBooks.add(notebook);// kullanıcıdan aldığım listeyi yukarıdaki oluşturduğum listeye ekledim
        System.out.println("Eklenen ürünün id'si:"+ notebook.getId());

    }

    @Override
    public void getProducts() {
        print(null);

    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("Silinmesini istediğiniz ürünün id sini giriniz");
        int id=sc.nextInt();
        noteBooks.remove(id-1);// index 0 dan başladığı için kollanıcı 3 derken aslında 2 yi kastediyor onun için id-1 yaparız
        System.out.println("Mevcut ürün listesi");
        getProducts();
    }

            public void print(List<Notebook>noteBooks){
        for (Notebook b :noteBooks ) {
        }

}}
