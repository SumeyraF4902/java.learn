package j12_Lopps.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /* Eğer bir döngünün baody'sinde başka bir döngü bulunuyorsa bu tür döngülere Nested-Loop--> içiçe döngü denir
        iç döngü, dış döngünün her adımında tekrar çalışır,
        içiçe döngülerde en içteki döngü enönce çalışır.
         */
        for (int apt=0; apt<=10;apt++){//apartman döngü
            System.out.println( "apartman döngü:"+apt);
            for (int daire=1; daire<6; daire++) {//daire döngü
                System.out.println("apt" + apt + "için daire döngü daire:" + daire);
            }
    }






    }
}
