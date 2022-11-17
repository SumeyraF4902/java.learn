package j33_Interface.task1;

public class Dikdortgen implements Sekil{


    @Override
    public int cevre(int... boyut) {//varargs array gibi çalışır[]
        if (boyut.length == 1) {//Varargs a girilen parametre  1 tane ise---> örnek kare için bütün kenarları eşit olduğu için tek parametre girilir
            return (boyut[0] *4);
        } else//varargs a girilen parametre 1 tane değilse dikdörtgen cevre hesapla gibi
            return (boyut[0] + boyut[1]) * 2;
    }
    @Override
    public int alan(int... boyut){
        if (boyut.length == 1) {//Varargs a girilen parametre  1 tane ise---> örnek kare için bütün kenarları eşit olduğu için tek parametre girilir
            return (boyut[0] * boyut[0]);
        } else
            return (boyut[0] * boyut[1]) ;
        }
    }

