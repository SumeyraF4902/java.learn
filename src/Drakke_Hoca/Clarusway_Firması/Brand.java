package Drakke_Hoca.Clarusway_Firması;

import j26_ınheritance.task01.B;

import java.util.ArrayList;
import java.util.List;

public class Brand {//brand= Marka
    private int id;
    private String name;
    private static List<Brand> brandList= new ArrayList<>();
    private static List<Brand> brandListMobilePhne= new ArrayList<>();
    static{// static blok oluşturduk  clasta , class çağrıldığında ilk çalışacak olan methoddor. onun için oluşturduk ve içine en allta marka eklediğimz methodu çağırdık.
        createBrands();// class çağrıldığında ilk çalışacak methodu yapıştırdık
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

    public Brand(int brandid, String brandname) {
        this.id = brandid;
        this.name = brandname;
    }
    public static void createBrands(){
        //yukarıda listi static yapmasaydık --> obje oluşturarak aşağıdaki işlemleri yapmamız gerekiyordu
        // Brand brand1=new Brand(1,"ebikgabık"); yapıp bu listeyi daha sonra yularıdaki listeye atabilirdik

        //OLUŞTURDUĞUM LİSTEYE EKLEME YAPTIK.
        // Brand objesi olmalıydı.-->new Brand(1,"cw"); obje oluşturduk
        brandList.add(new Brand(1,"Samsung"));
        brandList.add(new Brand(2,"Lenova"));
        brandList.add(new Brand(3,"Apple"));
        brandList.add(new Brand(4,"Huwai"));
        brandList.add(new Brand(5,"HP"));
        brandList.add(new Brand(6,"Asus"));
        brandList.add(new Brand(7,"LG"));
        brandList.add(new Brand(8,"Monster"));
        brandList.add(new Brand(9,"Casper"));
    }
    public static void createBrandsMobilePhone(){
       brandListMobilePhne.add(new Brand(1,"iPhone"));
       brandListMobilePhne.add(new Brand(2,"Samsung"));
       brandListMobilePhne.add(new Brand(3,"Redmi"));
       brandListMobilePhne.add(new Brand(4,"GeneralMobile"));
       brandListMobilePhne.add(new Brand(5,"Oppo"));
    }
    public static void printBrands(){//brandlistesini yazdırmak için oluşturduk
        System.out.println("........Marka Listesi .......");
        //en temelde yapmak istediğim şeyi--->System.out.println("BrandName") tek tek markaları yazdırmak için for each u kullanırız
        for(Brand brand : brandList){
            System.out.println(brand.getId()+"  "+brand.getName());
        }
        System.out.println("=========================================");

    }
    public static void printMobilePhones(){//brandlistesini yazdırmak için oluşturduk
        System.out.println("........Marka Listesi .......");
        //en temelde yapmak istediğim şeyi--->System.out.println("BrandName") tek tek markaları yazdırmak için for each u kullanırız
        for(Brand brand : brandListMobilePhne){
            System.out.println(brand.getId()+"  "+brand.getName());
        }
        System.out.println("=========================================");}
    public static  Brand getBrand(int id){
        for (Brand b : brandList){
            if(b.getId()==id){
                return b;
            }
        }return null;
    }
    public  static  Brand getMobilePhone(int id){
        for(Brand b:brandListMobilePhne){
            if(id==b.getId()){
                return b;
            }
        }return null;
    }
}
