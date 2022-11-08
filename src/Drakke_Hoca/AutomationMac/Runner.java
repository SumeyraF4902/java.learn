package Drakke_Hoca.AutomationMac;

public class Runner {
    public static void main(String[] args) {
       double accountBalance=1;
        Urun urun= new Urun();
        Options options= new Options();
    //  options.select(urun);
        urun.setPrice(options.select(urun));
         accountBalance = options.balance(urun.getPrice(), accountBalance, urun);
        System.out.println(accountBalance);
    }
}
