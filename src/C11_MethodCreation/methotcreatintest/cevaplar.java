package J11_MethodCreation.methotcreatintest;

/*/public class/* cevaplar {_01_method task********
    Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz : ");
    int max = scan.nextInt();
​
    randomNum(max);
       System.out.println(randomNum(max));
}
    private static double randomNum(int max) {
​
        double rMax = Math.random()*max;
​
        return rMax;

		**********_12_method12 task **********

			************Task 3************
        Scanner scan = new Scanner(System.in);
​
        System.out.println("bir saat giriniz : ");
        int saat = scan.nextInt();
​
        System.out.println("bir mesafe olarak mil giriniz : ");
        int mil = scan.nextInt();
​
        System.out.println("bir kg giriniz : ");
        int kg = scan.nextInt();
​
        çevir(saat, mil, kg);
    }
​
private static void çevir(int s, int m, int kg) {
        ​
        int saniye = s * 3600;
        double km = m * 1.609344;
        int gram = kg * 1000;
        ​
        System.out.println(s + " saat = " + saniye + " saniyedir. " + m + " mil = " + km + " km dir." + kg + " kg = " + gram + " gramdır.");
        ​
        }
        ************Task 6************
        Scanner scan = new Scanner(System.in);
        System.out.println("paralel kenar için 'p' , dikdörtgen için 'd' veya üçgen için 'ü' harfini giriniz : ");
        String tercih = scan.next().toLowerCase().trim();
        System.out.println("taban uzunluğunu giriniz : ");
        int taban = scan.nextInt();
        System.out.println("yüksekliği giriniz : ");
        int yükseklik = scan.nextInt();
        ​
        tercihEt(tercih, taban, yükseklik);
        }
private static void tercihEt(String tercih, int taban, int yükseklik) {
        switch (tercih) {
        case "p":
        paralelAlanBul(taban, yükseklik);
        break;
        ​
        case "d":
        dikdörtgenAlanBul(taban, yükseklik);
        dikdörtgenÇevreBul(taban, yükseklik);
        break;
        ​
        case "ü":
        üçgenAlanBul(taban, yükseklik);
        break;
        ​
default:
        System.out.println("hatalı işlem!!!");
        }
        }
private static void üçgenAlanBul(int taban, int yükseklik) {
        int alan = (taban * yükseklik) / 2;
        System.out.println("üçgenin alanı = " + alan);
        }
private static void dikdörtgenÇevreBul(int taban, int yükseklik) {
        int dÇevre = (2 * taban) + (2 * yükseklik); // 2*(taban+yükseklik) de aynısı...
        System.out.println("dikdörtgen çevre = " + dÇevre);
        }
private static void dikdörtgenAlanBul(int taban, int yükseklik) {
        int dAlan = taban * yükseklik;
        System.out.println("dikdörtgenin alanı = " + dAlan);
        }
private static void paralelAlanBul(int taban, int yükseklik) {
        int pAlan = taban * yükseklik ;
        System.out.println("paralel kenar alanı =" + pAlan);
        }

        ************Task 7************
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz : ");
        int sayi1 = scan.nextInt();
        ​
        System.out.println("ikinci sayıyı giriniz : ");
        int sayi2 = scan.nextInt();
        ​
        System.out.println("üçüncü sayıyı giriniz : ");
        int sayi3 = scan.nextInt();
        ​
        küçükSayiyiBul(sayi1, sayi2, sayi3);
        ​
        System.out.println(küçükSayiyiBul(sayi1, sayi2, sayi3));

        }
private static String küçükSayiyiBul(int a, int b, int c) {
        ​
        String sonuç = (a < b && a < c) ? ("en küçük sayı birinci sayıdır: " + a) : (b < a && b < c) ? ("en küçük sayı ikinci sayıdır: " + b) : ("en küçük sayı üçüncü sayıdır:" + c);
        ​
        return sonuç;
        }
        ************Task 8************
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir yıl giriniz : ");
        int yil= scan.nextInt();
        ​
        artikYilBul(yil);
        System.out.println("arık yıl mıdır? cevap = "+artikYilBul(yil));
        }
        ​
private static boolean artikYilBul(int a) {
        ​
        // System.out.println(a % 100 == 0 && a % 400 == 0 && a % 4 == 0 ? (true) : (false));
        ​
        boolean artikyil = (a % 100 != 0 && a % 400 == 0 && a % 4 == 0 ? (true) : (false));
        ​
        return artikyil;
        ************Task 9************
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir saat giriniz : ");
        int saat = scan.nextInt();
        ​
        saniyeBul(saat);
        }
        ​
private static void saniyeBul(int s) {
        ​
        int saniye = (s*60)*60;
        System.out.println(s+" saat "+saniye+" saniyedir.");
        ************Task 11************
        Scanner san = new Scanner(System.in);
        System.out.println("lütfen bir mesaj giriniz : ");
        String mesaj = san.nextLine().toLowerCase().trim();
        ​
        hackerDili(mesaj);
        ​
        System.out.println(hackerDili(mesaj));
        ​
        }
private static String hackerDili(String mesaj) {
        String yeniMsj = mesaj.replaceAll("s","5").replaceAll("a","4")
        .replaceAll("e","3").replaceAll("i","1").replaceAll("o","0");
        ​
        return yeniMsj ;
        ************Task 12************
        Scanner scan = new Scanner(System.in);
        ​
        System.out.println("Lütfen e-mail adresinizi giriniz : ");
        String email = scan.nextLine().trim();
        ​
        kaliteKontrol(email);
        System.out.println(kaliteKontrol(email));
        ​
        }
private static boolean kaliteKontrol(String email) {
        ​
        boolean kontrol = (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@"))&&
        (email.contains(".") && email.indexOf(".") == email.lastIndexOf("."))&&
        (email.indexOf("@") > 0);
        ​
        return kontrol;
        ************Task 13************
        Scanner scan =new Scanner(System.in);
        ​
        System.out.println("birinci kelimeyi giriniz :");
        String x= scan.next().toLowerCase().trim();
        ​
        System.out.println("ikinci kelimeyi giriniz :");
        String y=scan.next().toLowerCase().trim();
        ​
        kontrolEt(x,y);
        ​
        System.out.println(kontrolEt(x, y));
        ​
        }
        ​
private static boolean kontrolEt(String x, String y) {
        ​
        boolean kontrol = x.endsWith(y);
        ​
        return kontrol;
        ​
        ************Task 14************
        Scanner scan = new Scanner(System.in);
        ​
        System.out.println("saatlik ücret giriniz :");
        double saUc = scan.nextDouble();
        ​
        System.out.println("iş başlama saati giriniz :");
        double baSa = scan.nextDouble();
        ​
        System.out.println("iş bitiş saati giriniz :");
        double biSa = scan.nextDouble();
        ​
        System.out.println("fazla mesai katsayısı giriniz :");
        double mesaiKS = scan.nextDouble();
        ​
        ​
        mesaiHesapla(saUc, baSa, biSa, mesaiKS);
        System.out.println("ücretiniz = "+mesaiHesapla(saUc, baSa, biSa, mesaiKS)+" Tl dir.");
        }
        ​
private static double mesaiHesapla(double saUc, double baSa, double biSa, double kSay) {
        ​
        double sonuç= (biSa <= 17 && biSa >= 9)? ((biSa - baSa) * saUc):(((biSa - 17) * saUc * kSay )+ ((17 - baSa) * saUc));
        ​
        return sonuç;*/


