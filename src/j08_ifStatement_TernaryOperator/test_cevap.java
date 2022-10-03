package j08_ifStatement_TernaryOperator;

public class test_cevap {
    /* // TASK01
    Scanner scan = new Scanner (System.in);
    int  sayi1 = 35 , sayi2 = 25;
		if (sayi1 > sayi2) {
        System.out.println("sayi1 sayısı sayi2 den büyüktür");
    }
		if (sayi1 < sayi2) {
        System.out.println("sayi1 sayısı sayi2 den küçüktür");
    }

    //TASK02
    int  sayi3 = 26 , sayi4 = 35;
		if (sayi3 > sayi4) {
        System.out.println("sayi3 sayısı sayi4 den büyüktür");
    }
		if (sayi3 < sayi4) {
        System.out.println("sayi1 sayısı sayi2 den küçüktür");
    }
    //TASK03
		System.out.print("birinci kelimeyi  giriniz. ");
    String str1 = scan.nextLine();
		System.out.print("ikinci kelimeyi  giriniz. ");
    String str2 = scan.nextLine();
		if (str1.equals(str2)) {
        System.out.println(str1 + " " + str2 + " 'ye eşittir.");
    }
		if (!(str1.equals(str2))) {
        System.out.println(str1 + " " + str2 + " 'ye eşit değildir.");
    }

    //TASK04
		System.out.print("Birinci double değerini giriniz : ");
    double db1 = scan.nextDouble();
		System.out.print("İkinici double değerini giriniz : ");
    double db2 = scan.nextDouble();
		if (db1 > db2) {
        System.out.println(db1 + " değeri " + db2 + " değerinden büyüktür.");
    }
		if (db1 < db2) {
        System.out.println(db1 + " değeri " + db2 + " değerinden küçüktür.");
    }
    //TASK05
    double db3 = 90.25 , db4 = 90.25;
		if (db3 > db4) {
        System.out.println("Hello World");
    }else if (db3<db4) {
        System.out.println("Not Hello World");
    }else {
        System.out.println("I love JAVA");
    }
    //TASK06
		System.out.print("Bir tam sayı değeri giriniz : ");
    int number = scan.nextInt();
		if (number == 0) {
        System.out.println("I'm neutral");
    }else if (number > 0) {
        System.out.println("I'm positive");
    }else System.out.println("I am negative");
    //TASK07
		System.out.print("Bir tam sayı değeri giriniz : ");
    int number2 = scan.nextInt();
		if (number2 % 2 ==0) {
        System.out.println(number2 + " is a EVEN number");
    }else {
        System.out.println(number2 + " is a ODD number");
    }
    //TASK08
    int sayi5 = 33;
		if (sayi5%4 == 3) {
        System.out.println("Remainder is 3");
    }else if (sayi5%4 == 2) {
        System.out.println("Remainder is 2");
    }else if (sayi5%4 == 1) {
        System.out.println("Remainder is 1");
    }else {
        System.out.println("Remainder iş 0");
    }
    //TASK10
    int sayi6 = 60;
		if (sayi6 % 9 ==0 && sayi6%5 == 0 ) {
        System.out.println("Able to divede by 9 and 5");
    }else if (sayi6%4 ==0 && sayi6%5 ==0){
        System.out.println("Able to divide by 4 and 15");
    }
    //TASK16
    double db6=45;
		if (db6 % 5 == 0 && db6 % 8 == 0 ) {
        System.out.println("able to divide by 5 and 8");
    }else if (db6 % 10 == 5 && db6 % 9 ==0) {
        System.out.println("able to divide by 9 and divide by 10 reminder 5");
    }
    //TASK17 - 18
    // En büyüğünü hesaplama
		System.out.print("Birinci sayıyı giriniz : ");
    int i1 = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
    int i2 = scan.nextInt();
		System.out.print("Üçüncü sayıyı giriniz : ");
    int i3 = scan.nextInt();
		System.out.println("------EN BÜYÜK SAYIYI HESAPLAMA -------");
		if (i1 > i2 && i1 > i3) {
        System.out.println(i1 + " sayısı en büyüktür . ");
    }
		if (i2 > i1 && i2 > i3) {
        System.out.println(i2 + " sayısı en büyüktür . ");
    }
		if (i3 > i1 && i3 > i2) {
        System.out.println(i3 + " sayısı en büyüktür");
    }
		System.out.println("------EN KÜÇÜK SAYIYI HESAPLAMA -------");
    // En küçüğünü hesaplama
		if (i1 < i2 && i1 < i3) {
        System.out.println(i1 + " sayısı en küçüktür.");
    }
		if (i2 < i1 && i2 < i3) {
        System.out.println(i2 + " sayısı en küçüktür. ");
    }
		if (i3 < i1 && i3 < i2) {
        System.out.println(i3 + " sayısı en küçüktür");
    }
    //TASK20 - Trafik cezası hesaplama
    int hizCeza = 0, ehliyetCeza = 0;
		System.out.print("Lütfen hızınızı yazınız : ");
    int hiz = scan.nextInt();

		if (hiz >= 55 && hiz <= 74) {
        hizCeza = 100;
    }else if (hiz >= 75 && hiz <= 84) {
        hizCeza = 150;
    }else if (hiz >= 85 && hiz <=94) {
        hizCeza = 320;
    }else if (hiz >= 95) {
        hizCeza = 500;
    }
		System.out.print("Ehliyetin var mı gardaş??? Varsa -> True - Yoksa -> False :     ");
    boolean ehliyet = scan.nextBoolean();
		if (ehliyet == true) {
        ehliyetCeza = 0;
    }else {
        ehliyetCeza = 200;
    }

		System.out.println( hiz +  " km/saat hız yaptığın için : " + hizCeza +"$");
		if (ehliyet == false) {
        System.out.println("Ehliyetin olmadığı için de 200$ ceza aldın");
    }
		System.out.println("toplam ceza tutarın " + (ehliyetCeza + hizCeza) + " $ dır. Git baban ödesin şimdi....");
}
​
        }
        <<<<<<<<---------------KONSOL ÇIKTILARI ---------->>>>>>>>
        ----------- TASK01 ----------
        sayi1 sayısı sayi2 den büyüktür
        -------------TASK02--------------
        sayi1 sayısı sayi2 den küçüktür
        -------------TASK03------------------
        birinci kelimeyi  giriniz. Fatih
        ikinci kelimeyi  giriniz. Fatih
        Fatih Fatih 'ye eşittir.
        ----------------TASK04-------------------
        Birinci double değerini giriniz : 10,24
        İkinici double değerini giriniz : 14,53
        10.24 değeri 14.53 değerinden küçüktür.
        -------------TASK05-----------------------
        I love JAVA
        ---------------TASK06---------------------
        Bir tam sayı değeri giriniz : 24
        I'm positive
        -----------------TASK07-------------------
        Bir tam sayı değeri giriniz : 69
        69 is a ODD number
        --------------TASK08----------------------
        Remainder is 1
        ----------------TASK10-----------------------
        Able to divide by 4 and 15
        ----------------TASK16--------------------
        able to divide by 9 and divide by 10 reminder 5
        ---------------TASK 17 / 18 ------------------
        Birinci sayıyı giriniz : 12
        İkinci sayıyı giriniz : 24
        Üçüncü sayıyı giriniz : 36
        ------EN BÜYÜK SAYIYI HESAPLAMA -------
        36 sayısı en büyüktür
        ------EN KÜÇÜK SAYIYI HESAPLAMA -------
        12 sayısı en küçüktür.
        ---------------TASK 20 TRAFİK CEZASI -----------------
        Lütfen hızınızı yazınız : 120
        Ehliyetin var mı gardaş??? Varsa -> True - Yoksa -> False :     False
        120 km/saat hız yaptığın için : 500$
        Ehliyetin olmadığı için de 200$ ceza aldın
        toplam ceza tutarın 700 $ dır. Git baban ödesin şimdi....

        }
*/
}