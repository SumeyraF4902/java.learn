package j37_Enum;

import j26_ınheritance.task01.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RunnerArac {
    public static void main(String[] args) {

        List<Arac> list = new ArrayList<>();
        Arac peugeot301 = Arac.ID1001;
        Arac citroenCElysee=Arac.ID1002;
        Arac fordTourneo= Arac.ID1003;
        Arac fiatLinea= Arac.ID1004;
        Arac renaultClioHb= Arac.ID1005;
        Arac fiatFierino= Arac.ID1006;
        Arac fordTourneoCourier= Arac.ID1007;
        Arac fiatLineaEko= Arac.ID1008;
        Arac peugeot2008= Arac.ID1009;
        Arac hundaiTuscon= Arac.ID1010;
        Arac nissanQashqai= Arac.ID1011;
        Arac peugeot3008= Arac.ID1012;
        Arac peugeotExpert = Arac.ID1013;

        list.add(peugeot301);
        list.add(citroenCElysee);
        list.add(fordTourneo);
        list.add(fiatLinea);
        list.add(renaultClioHb);
        list.add(fiatFierino);
        list.add(fordTourneoCourier);
        list.add(fiatLineaEko);
        list.add(peugeot2008);
        list.add(hundaiTuscon);
        list.add(peugeot3008);
        list.add(peugeotExpert);

for(Arac w:list){
    if(w.karegori==Sinif.EKONOMIK);
    System.out.println(w.getSinif());
}
}

    }

