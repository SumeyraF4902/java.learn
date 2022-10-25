package day08;

public class Fatıh_Atas {
    public static void main(String[] args) {


      // verilen string değerinin içerdiği karakter sayılarını yazdıran code create ediniz
        String str="nfmllşkgfşşö şlşgkklv#½$+542165484 vöb";
        //logic
        //1 . aşama verilen bütün karakterleri gezeceğim için for loopa ihtiyacım var.
        //2. karakter sayısını almak için bizlere değeri 0 olan bir int değer girmem lazım.
        //3. str ifadesindeki er karakterden sadece 1 adet içeren bir String gerekiyor.(benzersizStr)
        String bensersizStr="";
        for (int i=0; i<=str.length()-1; i++) {// i<str.lenght diyebiliriz = demezsek.
            if (!bensersizStr.contains("" + str.charAt(i))) {//benzersizstr , str deki harfleri içermiyorsa bu harfleri bensersizStrnib içine ekle.
                // "" işaretini char ı Stringe çevir diye koyduk. veluof da kullanılabilirdi ama kısa olsun diye böyle yaptık.
                bensersizStr += "" + str.charAt(i);
            }

        }System.out.println(bensersizStr);//nfmlşkgö v#½$+542168b hepsinden birer tane aldı.
        for (int i=0; i<=bensersizStr.length()-1; i++){
            int sayac=0;//her defasında saymaya 0 dan başlaması için sayaçı burada tanımlamamaız gerekir.
            // karakteri nerede saydırıyorsak o loop un üzerinde olması gerekir.
            for (int j=0; j<=str.length()-1;j++) {
                if (bensersizStr.charAt(i) == str.charAt(j)) {
                    sayac++;
                }

            }System.out.println("karakter->" + bensersizStr.charAt(i) + "=" + sayac);

        }

}}
