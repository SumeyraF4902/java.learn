package Drakke_Hoca.Clarusway_Firması;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone extends Product{
    Scanner sc=new Scanner(System.in);

    static  int nId = 1;
    static List<MobilePhone> mobilePhones=new ArrayList<>();

    public MobilePhone( String name, double price, double discountRate, double amount, Brand brand, double screenSize, int ram, int memory) {
        super(nId, name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    } // constructor oluşturuldu

    public MobilePhone() {

    }

    @Override
    public void menu() {

        System.out.println("1) Yeni MobilePhone ekleme\n"+
                "2)MobilePhone listesini görüntüleme \n"+
                "3) MobilePhone silme");
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
        Brand.printMobilePhones();//printBrands methodu static olduğu için bulunduğu sınıf adıyla çagırdık
        Brand brand=Brand.getMobilePhone(sc.nextInt());// get brand methodu static oldugu için class ismiyle çağırdık. ve sc.nextInt içine koyduk
        MobilePhone mobilPhone=new MobilePhone(name,price,discountRate,amount,brand,screenSize,ram,memory);
        mobilePhones.add(mobilPhone);// kullanıcıdan aldığım listeyi yukarıdaki oluşturduğum listeye ekledim
        System.out.println("Eklenen ürünün id'si:"+ mobilPhone.getId());

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
        mobilePhones.remove(id-1);// index 0 dan başladığı için kollanıcı 3 derken aslında 2 yi kastediyor onun için id-1 yaparız
        System.out.println("Mevcut ürün listesi");
        getProducts();
    }

    public void print(List<MobilePhone>mobilePhones){
        for (MobilePhone b :mobilePhones ) {
        }
}}
