package Arrays_List_Tasklar;

public class Rectangle {/*Task 01 > 2 class açıldı task2-cevre-hesapla ve Rectangle clası
                fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
                Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
                */
        //fields
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double cevreHesapla(){
        return width+length+(Math.sqrt(width*2)+(length*2));
    }
    public double alanHesapla(){
        return width*length;
    }
}




