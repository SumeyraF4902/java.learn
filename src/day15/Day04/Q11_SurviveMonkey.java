package day15.Day04;

public class Q11_SurviveMonkey {
    public static void main(String[] args) {
/*
There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		Adada yalnız bir maymun var
Her gün 4 muz yemesi gerekiyor.
o adada sadece 165 muz var
Aşağıdaki değişkenleri oluşturun ve kaç gün maymun hayatta kalabilir bulun

do while döngüsü, artırma ve azaltma ve if deyimlerini kullanın
int Bananas Sayısı = 165, hayatta kalma Günleri = 1;
boolean maymunAlive = true;
 */
        int sumbananas=165;
        int gunlukbananas=4;//günde 4 muz yer
        int hayattaKalmaSuresi=0;
        boolean monkeyAlive = true;
        do {

            System.out.println("maymunlar günde 4 muz yer");
            sumbananas -= 4;
            System.out.println("kalan muz sayısı=" + sumbananas);
            hayattaKalmaSuresi++;
            if (sumbananas < 4) {// 4 den az muz kalırsa
                monkeyAlive = false;
                System.out.println("bugun  " + hayattaKalmaSuresi + "   . gun muz kalmadı maymun hayatta değil");
            } else System.out.println("bugun  " + hayattaKalmaSuresi + ". gun maymun hala  yaşıyor");

        }  while(monkeyAlive);
        System.out.println("maymunun toplam yasagigi gun sayısı  "+ hayattaKalmaSuresi);

    }
}
