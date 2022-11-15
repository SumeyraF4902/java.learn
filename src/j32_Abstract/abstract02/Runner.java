package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1= new Isci();//
        mrb1.maasBilgisi();//Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu :(
        mrb1.maasHesapla();//agam marabalara en çok yeymiye 499 gayme verilir..
        mrb1.name="Sümeyra güzel insan";
        System.out.println("mrb1.name = " + mrb1.name);//mrb1.name = Sümeyra güzel insan
        mrb1.sigorta();//abs Parent calsstaki concarant  meth obj ile call//Agam özel sigorta kapsamındasın

        IdariPersonel cncCdr= new IdariPersonel();

        cncCdr.name="dilek hanım";
        System.out.println("cncCdr.name = " + cncCdr.name);//cncCdr.name = dilek hanım
        cncCdr.sigorta();//agam cıncık coder personel full sigorta
        cncCdr.maasBilgisi();//Agam cıncık code yaan idari personele ekistiradan biy ikramiye :)
        cncCdr.maasHesapla();//Agam frapan idarecimize saatine $120 gayme verilir :)
    }
}
