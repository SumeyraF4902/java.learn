package Drakke_Hoca.Clarusway_Firması;

import java.util.Scanner;

public abstract class Product {
    /*

    Product Abs. Nitelikleri:
Scanner scanner=new Scanner(System.in);
id = Ürün id si
name = Ürün ismi
price = Ürün fiyatı
discountRate = Ürün indirim oranı
amount = Ürün stoğu
Brand brand = Brand
screenSize = Ürün ekran boyutu
ram = Ürün ram i
memory = Ürün hafızası

Product Abs. Metotları:
void menu()
void addItem()
void getProducts()
void deleteItem()

NoteBook Class ı Nitelikleri:
**Notebook Class ı Products a extend  olmalıdır.
nId=1;
ArrayList<Notebook> notebooks=new ArrayList<>() = notebook listesi
     */

    private  int id;
    private String name;
   private double price;//FİYATI
   private double discountRate;//indirim oranı
   private double amount;//tutar
   private Brand brand;//marka
   private double screenSize;//ekran boyutu
   private int ram;// veri deposu
   private int memory;//hafıza

// abstrac methotlar static yada private olmaz, abstrac methodların badisi olmaz{}

    public Product() {
    }

    public abstract void menu();
    public abstract void addItem();//ekleme
    public abstract void getProducts();//görüntüleme
    public abstract void deleteItem();//silme

    public Product(int id, String name, double price, double discountRate, double amount, Brand brand, double screenSize, int ram, int memory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
