package Arrays_List_Tasklar;

public class eletrik_Musteri {
    /*
    Task 02 -> elektrkHesapla, elektrik müşteri, ve elktrik Runner adında 3 class açıldı
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    // fields
    String name;
     elektrkHesapla elektrkHesapla;

    public eletrik_Musteri(String name, elektrkHesapla elektrkHesapla) {
        this.name = name;
        this.elektrkHesapla = elektrkHesapla;

    }

}
