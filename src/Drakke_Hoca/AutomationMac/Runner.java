package Drakke_Hoca.AutomationMac;

public class Runner {
    public static void main(String[] args) {

       double accountBalance=5;// cebimdeki para
        Urun urun= new Urun();
        Options options= new Options();
    //  options.select(urun);
        urun.setPrice(options.select(urun));
         accountBalance = options.balance(urun.getPrice(), accountBalance, urun);
       // System.out.println(accountBalance);
        options.purchase(urun.getPrice(), accountBalance, urun);
    }
}
