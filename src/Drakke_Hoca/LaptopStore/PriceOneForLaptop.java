package Drakke_Hoca.LaptopStore;

import java.util.ArrayList;

public class PriceOneForLaptop {

    public int getPrice(int laptopID){

        Data pcPrice=new Data();

        ArrayList<String> pc=pcPrice.allData(laptopID);//110001

      int  totalAmount=Calculation.getSize(pc)+Calculation.getCPU(pc)+Calculation.getRam(pc)+Calculation.getColor(pc);//toplam fiyat
        return totalAmount;
    }
}
