package Arrays_List_Tasklar;

public class Task2_cevreHesapla {
    public static void main(String[] args) {
        /*Task 01 > 2 class açıldı task2-cevre-hesapla ve Rectangle clası
                fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
                Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
                */
       Rectangle rect = new Rectangle(10,15);
        System.out.println(rect.cevreHesapla());
        System.out.println(rect.alanHesapla());
    }
}

