package j32_Abstract;

public class C01_Abstract {
    /*
    Soyut Sınıf (Abstract Class)

  Nesne tabanlı programlamada sınıf hiyerarşisi oluşturulurken, bazen en tepede bulunan sınıf türünden nesneler programcılar için anlamlı olmayabilir.
  Hiyerarşinin en tepesinde bulunan sınıfın kendisinden türetilecek olan alt sınıflar için ortak bir arayüz (interface) görevi yapması istenebilir.
  Bunun için çözüm olarak oluşturulan metotlara ve sınıflara soyut metot (abstract method) ya da soyut sınıf (abstract class) denir.
  Soyut sınıflar büyük projelerde kullanılırlar ve kalıtım özelliğini kullanarak kod tekrarını azaltırlar.
  Soyut sınıflar diğer sınıflara taban olmak için kullanılırlar. Nesne türetemezler. Önlerine “abstract” sözcüğü yazılarak soyutlaştırılırlar.
  Önlerine "virtual" yazılmaz çünkü “abstract” sözcüğü uygulanan tüm sınıf ve metotlar zaten sanaldır.

Kullanırken dikkat edilmesi gerekenler:

•    Soyut sınıflar “abstract” türünden nesneler tanımlamazlar.
•    Soyut sınıflar içerilerinde soyut olmayan metotlar da barındırabilir ancak soyut metotlar sadece soyut sınıflar içerisinde bildirilebilir.
•    Soyut metotlar türeyen sınıfta mutlaka bildirilmelidir.
•    Soyut metotlar override edilmek zorundadırlar, aksi takdirde derleyici hatası alınır.
•    “Static” metotlar soyut olarak tanımlanamazlar.
•    Soyut sınıflar “private” olarak tanımlanamazlar ama “public” ve “protected” olarak tanımlanabilirler.
•    Soyut sınıflar “sealed” anahtar sözcüğü ile ifade edilemezler.

public abstract class SoyutSınıf
{
       abstract public void Soyut_Metot();//gövdesi olmayan metot

       public void Soyut_Olmayan_Metot()  //gövdesi olan metot
     {
        //metot gövdesi
      }
}

Soyut sınıf  ve arayüz arasındaki farklar ve benzerlikler:
•    Arayüz içerisindeki tüm öğelerin “public” olması gerekirken soyut sınıflarda tüm öğelerin “public” olması zorunlu değildir.
•    Bir sınıf sadece bir soyut sınıftan miras olarak tanımlanabilir ancak birçok arayüz tarafından bildirilebilir.
•    Soyut sınıf ve arayüz için yazılacak olan soyut metotların gövdeleri bulunmaz.
•    Soyut sınıflar çoklu ortamı desteklemezler ancak arayüz destekler.
•    Soyut sınıflar kullanım hızı açısından arayüzden daha avantajlıdır.
•    Soyut bir sınıfın tüm metotları soyut yapılırsa arayüz olarak kullanılabilir.

Uygulama

“Soyut_Sınıf” adında bir soyut sınıf tanımlanır ve içine soyut olan ve olmayan metotlar eklenir.
 Gövdesi olmayan soyut metot ve soyut olmayan metot tanımlanmıştır.
“Soyut_Sınıf”tan kalıtılan “Program” adında sınıf tanımlanır. “Soyut_Metot” override edilerek gövde kazandırılır.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

 namespace Abstract
{
        abstract class Soyut_Sınıf
   {
        public void Soyut_Olmayan_Metot()

        {            Console.WriteLine("Soyut Olmayan Metot");        }
        public abstract void Soyut_Metot(); //Soyut Metotlar gövdesi olmayan metotlardır.
   }
    class Program : Soyut_Sınıf
   {
        public override void Soyut_Metot()
     {
            Console.WriteLine("Soyut Metot");

    1- Bazı durumlarda child classlar parent class daki methodların genellikle badylerine değiştirerek ovarride ederler

    Bu gibi durumlarda parent classdaki methoda body tanımlamak ram ve memory açısından gereksizdir.
    çözüm olarak java parent class a body'siz --> abstract (soyut) methodlar tanımlanmıştır.

    2- Parent class'daki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
    eğer parent class daki  child classın mutlaka kullanması gereken  method varsa abstract tanımlanmalı
    motor () her aracta olmalı

    3- abstract method tanımlamak için;
     a){} body olmaz
    b) access modifier sonrası abstract keyword kullanılmalı
    abstract class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı
    c) Abstract method içinde abstract keyword ve {} bir arada kullanılamaz. aksi halde CTE verir.

    4- Abstract methodlar sadece abstract  Classta tanımlanabilir , kesinlikle concrete classda abs. methot  tanımlanamaz
    ama abs class'da concerete method tanımlanabilir.

    5-Abstract class içinde  hem abstract method hem de concrete method ve variable tanımlanabilir.
    6- bir concrete child class parent abstract classa extend ettiğinde abstract methodları implement etmek zorunda
    ama concrete methodlar isteğe göre override edilir.
    7- Parent child ilşkisi olan abstarct class'lar abs method'ları implement etmek zorunda değil
    8- Parent olan abs class birden çok concerete  veya abs child class exyends edibilir.
        ancak child class birden cok abs parent class'dan extends e-de-mezz...

    9-  Abs Class'da final ve abs method tanımlanamaz CTE -> final method override edilemyecegi için abs olamaz
    10- Abs Class'da private ve abs method tanımlanamaz CTE -> private method override edilemyecegi için abs olamaz
    11- Abs Class'da static ve abs method tanımlanamaz CTE-> static method override edilemyecegi için abs olamaz

        **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE URETEMEZ !!!!
        TRİCK-> Abstract Class'lar referansı child Class'ın obj tutabilir(Polimorphism)
        Soyut Sınıf (Abstract Class)

  Nesne tabanlı programlamada sınıf hiyerarşisi oluşturulurken, bazen en tepede bulunan sınıf türünden nesneler programcılar için anlamlı olmayabilir.
  Hiyerarşinin en tepesinde bulunan sınıfın kendisinden türetilecek olan alt sınıflar için ortak bir arayüz (interface) görevi yapması istenebilir.
  Bunun için çözüm olarak oluşturulan metotlara ve sınıflara soyut metot (abstract method) ya da soyut sınıf (abstract class) denir.
  Soyut sınıflar büyük projelerde kullanılırlar ve kalıtım özelliğini kullanarak kod tekrarını azaltırlar.
  Soyut sınıflar diğer sınıflara taban olmak için kullanılırlar. Nesne türetemezler. Önlerine “abstract” sözcüğü yazılarak soyutlaştırılırlar.
  Önlerine "virtual" yazılmaz çünkü “abstract” sözcüğü uygulanan tüm sınıf ve metotlar zaten sanaldır.

Kullanırken dikkat edilmesi gerekenler:

•    Soyut sınıflar “abstract” türünden nesneler tanımlamazlar.
•    Soyut sınıflar içerilerinde soyut olmayan metotlar da barındırabilir ancak soyut metotlar sadece soyut sınıflar içerisinde bildirilebilir.
•    Soyut metotlar türeyen sınıfta mutlaka bildirilmelidir.
•    Soyut metotlar override edilmek zorundadırlar, aksi takdirde derleyici hatası alınır.
•    “Static” metotlar soyut olarak tanımlanamazlar.
•    Soyut sınıflar “private” olarak tanımlanamazlar ama “public” ve “protected” olarak tanımlanabilirler.
•    Soyut sınıflar “sealed” anahtar sözcüğü ile ifade edilemezler.

public abstract class SoyutSınıf
{
       abstract public void Soyut_Metot();//gövdesi olmayan metot

       public void Soyut_Olmayan_Metot()  //gövdesi olan metot
     {
        //metot gövdesi
      }
}

Soyut sınıf  ve arayüz arasındaki farklar ve benzerlikler:
•    Arayüz içerisindeki tüm öğelerin “public” olması gerekirken soyut sınıflarda tüm öğelerin “public” olması zorunlu değildir.
•    Bir sınıf sadece bir soyut sınıftan miras olarak tanımlanabilir ancak birçok arayüz tarafından bildirilebilir.
•    Soyut sınıf ve arayüz için yazılacak olan soyut metotların gövdeleri bulunmaz.
•    Soyut sınıflar çoklu ortamı desteklemezler ancak arayüz destekler.
•    Soyut sınıflar kullanım hızı açısından arayüzden daha avantajlıdır.
•    Soyut bir sınıfın tüm metotları soyut yapılırsa arayüz olarak kullanılabilir.

Uygulama

“Soyut_Sınıf” adında bir soyut sınıf tanımlanır ve içine soyut olan ve olmayan metotlar eklenir.
 Gövdesi olmayan soyut metot ve soyut olmayan metot tanımlanmıştır.
“Soyut_Sınıf”tan kalıtılan “Program” adında sınıf tanımlanır. “Soyut_Metot” override edilerek gövde kazandırılır.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

 namespace Abstract
{
        abstract class Soyut_Sınıf
   {
        public void Soyut_Olmayan_Metot()

        {            Console.WriteLine("Soyut Olmayan Metot");        }
        public abstract void Soyut_Metot(); //Soyut Metotlar gövdesi olmayan metotlardır.
   }
    class Program : Soyut_Sınıf
   {
        public override void Soyut_Metot()
     {
            Console.WriteLine("Soyut Metot");


     */
}
