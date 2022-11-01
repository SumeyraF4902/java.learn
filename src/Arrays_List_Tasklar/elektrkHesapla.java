package Arrays_List_Tasklar;

public class elektrkHesapla {
    /*
    Task 02 -> elektrkHesapla, elektrik müşteri, ve elktrik Runner adında 3 class açıldı
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
//fields
       int toplamTuketim;
       double oran=0.7;
       double fatura;


    public elektrkHesapla() {
        this.toplamTuketim = toplamTuketim;
        this.oran = oran;
        this.fatura = fatura;
        double tüketim;
    }
    public double ödenecektutar() {
        fatura=oran*toplamTuketim;
        return fatura;
    }

    public double tuketimEkle(int tuketim) {

         toplamTuketim +=tuketim;
         return toplamTuketim;
    }

    public void oran(double v) {
    }
}

