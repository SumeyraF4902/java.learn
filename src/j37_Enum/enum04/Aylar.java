package j37_Enum.enum04;

import j26_ınheritance.task01.A;

public enum Aylar {
    // OCAK(31,"kış","sena hanım hayırlı seneler"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKİM(31),
    KASIM(30),
    ARALIK(31);
    int gunler;

    //  Aylar(int gunSayısı, String mevsim,String birthDay) {// parametreli constacter parametresiz constacterı ezer. 3 parametreli constacter
    Aylar(int gunSayısı) {//parametreli constacter parametresiz constacterı ezer. tek parametreli constacter
        gunler = gunSayısı;
    }

    void gunMiktarı() {//method
        System.out.println("gunler=" + gunler);
    }
}
